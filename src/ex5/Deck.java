package ex5;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cardList;

    public static void main(String[] args) {
        Deck aDeck = new Deck();
        aDeck.show();
    }

    public Deck() {
        cardList = new ArrayList<Card>();
        for (int m = 0; m < 4; m++) {
            for (int num = 1; num < 14; num++) {
                Card c = new Card(m, num);
                cardList.add(c);
            }
        }
    }

    public void show() {
        for (Card c : cardList) {
            System.out.println(c);
        }
    }

}
