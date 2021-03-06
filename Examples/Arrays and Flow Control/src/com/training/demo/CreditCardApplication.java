package com.training.demo;

public class CreditCardApplication {

	public static void main(String[] args){
		
		CreditCardService service = new CreditCardService();
		try {
			CreditCard card1 = new CreditCard(101, "Ramesh", 10000.00);
			CreditCard card2 = new CreditCard(102, "Suresh", 20000.00);
			CreditCard card3 = new CreditCard(103, "Rakesh", 40000.00);
			CreditCard card4 = new CreditCard(104, "Rajesh", 100000.00);
			CreditCard card5 = new CreditCard(105, "Ravesh", 90000.00);
			CreditCard card6 = new CreditCard(105, "Sandesh", 10000.00);
			CreditCard card7 = new CreditCard(101, "Ramesh", 10000.00);
			CreditCard card8 = new CreditCard(102, "Suresh", 20000.00);
			CreditCard card9 = new CreditCard(103, "Rakesh", 40000.00);
			CreditCard card10 = new CreditCard(104, "Rajesh", 100000.00);
			CreditCard card11 = new CreditCard(105, "Ravesh", 90000.00);
			CreditCard card12 = new CreditCard(105, "Sandesh", 10000.00);
		
			service.addCard(card1);
			service.addCard(card2);
			service.addCard(card3);
			service.addCard(card4);
			service.addCard(card5);
			service.addCard(card6);
			service.addCard(card7);
			service.addCard(card8);
			service.addCard(card9);
			service.addCard(card10);
			service.addCard(card11);
			service.addCard(card12);
			
			CreditCard card13 = new CreditCard();
			card13.setCardholderName("Hebbar");
			card13.setCardNumber(110);
			card13.setCreditLimit(50000);
			
			service.addCard(card13);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			CreditCard[] cardList = service.getCardList();
			
			for(CreditCard eachCard:cardList) {
				if(eachCard != null) {
					System.out.println(eachCard.getCardholderName());
				}
			}
		}
		
		String name = "Ramesh";
		
		System.out.println(UsingFinallyBlock.getMessage(name));
		
		String name2 = null;
		
		System.out.println(UsingFinallyBlock.getMessage(name2));

	}

}
