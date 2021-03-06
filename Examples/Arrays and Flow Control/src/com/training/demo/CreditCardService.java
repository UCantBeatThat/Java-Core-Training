package com.training.demo;

public class CreditCardService {
	
	private CreditCard[] cardList;
	public static int indexPos = 0;
	
	public static int arraySize = 2;
	
	public CreditCardService() {
		super();
		this.cardList =  new CreditCard[arraySize];
	}

	public CreditCard[] getCardList() {
		return cardList;
	}

	public void setCardList(CreditCard[] cardList) {
		this.cardList = cardList;
	}

	public boolean addCard(CreditCard card) {
		boolean result = false;
		
		if(indexPos < arraySize) {
			this.cardList[indexPos++] = card;
			result = true;			
		}
		else if(indexPos == arraySize) {
			CreditCard[] tempCardList = new CreditCard[arraySize*2];
			System.arraycopy(cardList, 0, tempCardList, 0, arraySize);
			arraySize *= 2;
			cardList = tempCardList;
			this.cardList[indexPos++] = card;
			result = true;
		}
		System.out.println(this.cardList.length);
		return result;
	}

}
