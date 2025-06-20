import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class CardDuel {

	ArrayList<String> player1Cards = new ArrayList<>(52);
	ArrayList<String> player2Cards = new ArrayList<>(52);

	ArrayList<String> Cards = new ArrayList<>(52);


	boolean Winner = false; 
	boolean flag = false;

	public CardDuel(){
		inintializeDeck();
		RandomizePlayersCards();
		while(flag == true){
			SortCardsForPlayer1();
			Player1AsksForCards();
			SortCardsForPlayer2();
			Player2AsksForCards();
		}
		if (Winner){
			println("Congradulations You Win!!!")
		}else{println("Congradulations You Win!!!")}

	}

	public void inintializeDeck(){
		Cards.add("1♠");
		Cards.add("1♥");
		Cards.add("1♣");
		Cards.add("1♦");

		Cards.add("2♠");
		Cards.add("2♥");
		Cards.add("2♣");
		Cards.add("2♦");

		Cards.add("3♠");
		Cards.add("3♥");
		Cards.add("3♣");
		Cards.add("3♦");

		Cards.add("4♠");
		Cards.add("4♥");
		Cards.add("4♣");
		Cards.add("4♦");

		Cards.add("5♠");
		Cards.add("5♥");
		Cards.add("5♣");
		Cards.add("5♦");

		Cards.add("6♠");
		Cards.add("6♥");
		Cards.add("6♣");
		Cards.add("6♦");

		Cards.add("7♠");
		Cards.add("7♥");
		Cards.add("7♣");
		Cards.add("7♦");

		Cards.add("8♠");
		Cards.add("8♥");
		Cards.add("8♣");
		Cards.add("8♦");

		Cards.add("7♠");
		Cards.add("7♥");
		Cards.add("7♣");
		Cards.add("7♦");

		Cards.add("8♠");
		Cards.add("8♥");
		Cards.add("8♣");
		Cards.add("8♦");

		Cards.add("9♠");
		Cards.add("9♥");
		Cards.add("9♣");
		Cards.add("9♦");
	}

	public void RandomizePlayersCards(){
		int randomNumber;
		for (int i=0; i<26; i++){
			randomNumber = random.nextInt(Cards.size());
			Player1Cards.add(Cards.remove(randomNumber));
		}
		
	}



	public void SortCardsForPlayer1(){
		flag = true;
		return null;
	}
	public void SortCardsForPlayer2(){
		return null;
	}
	public void Player1AsksForCards(){
		return null;
	}
	public void Player2AsksForCards(){
		return null;
	}

}	
