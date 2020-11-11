package com.project.organicstores.daily_sales_report.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.project.organicstores.daily_sales_report.ifaces.Constants;
import com.project.organicstores.daily_sales_report.ifaces.DataAccess;
import com.project.organicstores.daily_sales_report.model.Edible;
import com.project.organicstores.daily_sales_report.model.Electronics;
import com.project.organicstores.daily_sales_report.model.Garments;
import com.project.organicstores.daily_sales_report.model.Product;

public class ProductService implements DataAccess<Product> {

	private Connection connection;

	public ProductService(Connection connection) {
		super();
		this.connection = connection;
	}

	private String invoiceIDGenerator(int key) {

		int lastKeyValue = 0;

		String invoiceID = "";

		String lastKey = findLastKey(key);

		try {
			String invoiceNumber = "";

			if (lastKey == null || lastKey.equals("")) {
				lastKeyValue = 0;
				invoiceNumber = "0001";
			}
			else {
				lastKeyValue = Integer.parseInt(lastKey.substring(lastKey.length() - 4, lastKey.length()));

				lastKeyValue++;
				int tempLastKeyValue = lastKeyValue;
				int countDigits = 0;
				while (tempLastKeyValue != 0) {
					tempLastKeyValue /= 10;
					countDigits++;
				}

				if (countDigits == 1) {
					invoiceNumber = "000" + lastKeyValue;
				}
				else if (countDigits == 2) {
					invoiceNumber = "00" + lastKeyValue;
				}
				else if (countDigits == 3) {
					invoiceNumber = "0" + lastKeyValue;
				}
				else if (countDigits == 4) {
					invoiceNumber = "" + lastKeyValue;
				}
			}
			
			if (key == 1) {
				invoiceID = Constants.INVOICE_NUMBER_PREFIX + Constants.INVOICE_NUMBER_EDIBLE + invoiceNumber;
			}
			else if (key == 2) {
				invoiceID = Constants.INVOICE_NUMBER_PREFIX + Constants.INVOICE_NUMBER_GARMENT + invoiceNumber;
			}
			else if (key == 3) {
				invoiceID = Constants.INVOICE_NUMBER_PREFIX + Constants.INVOICE_NUMBER_ELECTRONICS + invoiceNumber;
			}
			else {
				throw new NumberFormatException("Exception occurred while generating invoiceID. ");
			}

		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}

		return invoiceID;
	}

	@Override
	public String findLastKey(int key) {

		String selectLastKeyQuery = "SELECT MAX(invoiceID) FROM ";

		String resultString = "";
		
		if (key == 1) {
			selectLastKeyQuery += Constants.EDIBLE_SALE_TABLE_NAME;
		} 
		else if (key == 2) {
			selectLastKeyQuery += Constants.GARMENT_SALE_TABLE_NAME;
		}
		else if (key == 3) {
			selectLastKeyQuery += Constants.ELECTRONICS_SALE_TABLE_NAME;
		}

		try (PreparedStatement pstmt = connection.prepareStatement(selectLastKeyQuery)) {

			ResultSet result = pstmt.executeQuery(selectLastKeyQuery);

			if (result.next()) {
				resultString = result.getString(1);
			}

			if (result.next()) {
				throw new SQLException("Query returns multiple rows. Expected one row to be returned");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultString;
	}

	@Override
	public boolean add(Product t, int key) {

		int rowsAdded = 0;
		String insertQuery = "";
		String invoiceNumberGenerated = invoiceIDGenerator(key);

		if (key == 1) {
			insertQuery = "INSERT INTO " + Constants.EDIBLE_SALE_TABLE_NAME + " VALUES(?,?,?,?,?,?,?,?,?,?)";
		} 
		else if (key == 2) {
			insertQuery = "INSERT INTO " + Constants.GARMENT_SALE_TABLE_NAME + " VALUES(?,?,?,?,?,?,?,?,?)";
		}
		else if (key == 3) {
			insertQuery = "INSERT INTO " + Constants.ELECTRONICS_SALE_TABLE_NAME + " VALUES(?,?,?,?,?,?,?,?,?,?)";
		}

		try (PreparedStatement pstmt = connection.prepareStatement(insertQuery)) {
			pstmt.setString(1, invoiceNumberGenerated);
			pstmt.setInt(2, t.getItemCode());
			pstmt.setString(3, t.getItemName());
			pstmt.setDouble(4, t.getUnitPrice());
			pstmt.setInt(5, t.getQuantity());
			pstmt.setString(6, t.getDateOfPurchase().toString());

			if (key == 1) {
				Edible edibleItem = (Edible) t;
				pstmt.setString(7, edibleItem.getDateOfManufacture().toString());
				pstmt.setString(8, edibleItem.getDateOfExpiry().toString());
				pstmt.setString(9, edibleItem.getFoodType());
				pstmt.setDouble(10, t.calculateLineTotal(t.getQuantity()));
			}
			else if (key == 2) {
				Garments garmentItem = (Garments) t;
				pstmt.setInt(7, garmentItem.getSize());
				pstmt.setString(8, garmentItem.getMaterial());
				pstmt.setDouble(9, t.calculateLineTotal(t.getQuantity()));
			}
			else if (key == 3) {
				Electronics electronicItem = (Electronics) t;
				pstmt.setInt(7, electronicItem.getSize());
				pstmt.setInt(8, electronicItem.getWarranty());
				pstmt.setInt(9, electronicItem.getWattage());
				pstmt.setDouble(10, t.calculateLineTotal(t.getQuantity()));
			}

			rowsAdded = pstmt.executeUpdate();

		}
		catch (SQLException e) {
			e.printStackTrace();
		}

		return rowsAdded == 1 ? true : false;
	}

	@Override
	public List<Product> findAll(int key) {
		
		String selectQuery = "SELECT * FROM ";
		
		if (key == 1) {
			selectQuery += Constants.EDIBLE_SALE_TABLE_NAME;
		} 
		else if (key == 2) {
			selectQuery += Constants.GARMENT_SALE_TABLE_NAME;
		}
		else if (key == 3) {
			selectQuery += Constants.ELECTRONICS_SALE_TABLE_NAME;
		}
		
		ArrayList<Product> productList = new ArrayList<>();
		
		Product product = null;
		
		try(PreparedStatement pstmt = connection.prepareStatement(selectQuery)){
			
			ResultSet resultList = pstmt.executeQuery(selectQuery);
			
			while(resultList.next()) {
				String invoiceID = resultList.getString(1);
				int itemCode = resultList.getInt(2);
				String itemName = resultList.getString(3);
				double unitPrice = resultList.getDouble(4);
				int quantity = resultList.getInt(5);
				LocalDate dateOfPurchase = resultList.getDate(6).toLocalDate();
				
				if(key == 1) {
					LocalDate dateOfManufacture = resultList.getDate(7).toLocalDate();
					LocalDate dateOfExpiry = resultList.getDate(8).toLocalDate();
					String foodType = resultList.getString(9);
					double lineTotal = resultList.getDouble(10);
					
					product = new Edible(itemCode, itemName, unitPrice, quantity, dateOfPurchase, lineTotal, dateOfManufacture, dateOfExpiry, foodType);
				}
				else if(key == 2) {
					int size = resultList.getInt(7);
					String material = resultList.getString(8);
					double lineTotal = resultList.getDouble(9);
					
					product = new Garments(itemCode, itemName, unitPrice, quantity, dateOfPurchase, lineTotal, size, material);
				}
				else if(key == 3) {
					int size = resultList.getInt(7);
					int warranty = resultList.getInt(8);
					int wattage = resultList.getInt(9);
					double lineTotal = resultList.getDouble(10);
					
					product = new Electronics(itemCode, itemName, unitPrice, quantity, dateOfPurchase, lineTotal, size, warranty, wattage);
				}
				
				productList.add(product);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return productList;
	}

	@Override
	public List<Product> findByDate(int key, LocalDate date) {
		String selectQuery = "SELECT (@SLNO:=@SLNO+1) AS SL_NO, itemName, unitPrice, quantity, lineTotal as Amount FROM ";
		
		if (key == 1) {
			selectQuery += Constants.EDIBLE_SALE_TABLE_NAME;
		} 
		else if (key == 2) {
			selectQuery += Constants.GARMENT_SALE_TABLE_NAME;
		}
		else if (key == 3) {
			selectQuery += Constants.ELECTRONICS_SALE_TABLE_NAME;
		}
		
		selectQuery += ", (SELECT @SLNO:= 0) AS SLNO WHERE dateOfPurchase = '" + date.toString() + "'";
		
		ArrayList<Product> productList = new ArrayList<>();
		
		Product product = null;
		
		try(PreparedStatement pstmt = connection.prepareStatement(selectQuery)){
			
			ResultSet resultList = pstmt.executeQuery(selectQuery);
			
			while(resultList.next()) {
				int sl_no = resultList.getInt(1);
				String itemName = resultList.getString(2);
				double unitPrice = resultList.getDouble(3);
				int quantity = resultList.getInt(4);
				double amount = resultList.getDouble(5);
				
				if(key == 1) {
					product = new Edible(sl_no, itemName, unitPrice, quantity, amount);
				}
				else if(key == 2) {
					product = new Garments(sl_no, itemName, unitPrice, quantity, amount);
				}
				else if(key == 3) {
					product = new Electronics(sl_no, itemName, unitPrice, quantity, amount);
				}
				
				productList.add(product);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return productList;
	}

	@Override
	public List<Product> findTopProductsByMonth(int key, int month) {
		
		String selectQuery = "SELECT (@SLNO:=@SLNO+1) AS SL_NO, itemName, SUM(quantity) AS quantity FROM ";
		
		if (key == 1) {
			selectQuery += Constants.EDIBLE_SALE_TABLE_NAME;
		} 
		else if (key == 2) {
			selectQuery += Constants.GARMENT_SALE_TABLE_NAME;
		}
		else if (key == 3) {
			selectQuery += Constants.ELECTRONICS_SALE_TABLE_NAME;
		}
		
		selectQuery += ", (SELECT @SLNO:= 0) AS SLNO WHERE MONTH(dateOfPurchase) = ?  GROUP BY itemName LIMIT 3";
		
		ArrayList<Product> productList = new ArrayList<>();
		
		Product product = null;
		
		try(PreparedStatement pstmt = connection.prepareStatement(selectQuery)){
			
			pstmt.setInt(1, month);
			
			ResultSet resultList = pstmt.executeQuery();
			
			while(resultList.next()) {
				int sl_no = resultList.getInt(1);
				String itemName = resultList.getString(2);
				int quantity = resultList.getInt(3);
				
				if(key == 1) {
					product = new Edible(sl_no, itemName, quantity);
				}
				else if(key == 2) {
					product = new Garments(sl_no, itemName, quantity);
				}
				else if(key == 3) {
					product = new Electronics(sl_no, itemName, quantity);
				}
				
				productList.add(product);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return productList;
	}
	
	public void closeConnection() {
		try {
			this.connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
