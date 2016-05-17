package ex5;

public class Card {
    private int mark;
    private int number;

    public static final int SPADE = 0;
    public static final int HEART = 1;
    public static final int CLUB = 2;
    public static final int DIAMOND = 3;

    public static final int BLACK = 0;
    public static final int RED = 1;

    public Card(int m, int num) {
        mark = m;
        number = num;
    }

    public int getMark() {
        return mark;
    }

    public int getNumber() {
        return number;
    }

    public int color() {
        if (mark == 0 || mark == 2) {
            return 0;
        } else {
            return 1;
        }
    }

    public String toString() {
        String markString = "", numString = "";
        switch (mark) {
            case 0:
                markString = "S";
                break;
            case 1:
                markString = "H";
                break;
            case 2:
                markString = "C";
                break;
            case 3:
                markString = "D";
                break;
        }
        switch (number) {
            case 1:
                numString = "A";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                numString = String.valueOf(number);
                break;
            case 11:
                numString = "J";
                break;
            case 12:
                numString = "Q";
                break;
            case 13:
                numString = "K";
                break;
        }
        return "a Card(" + markString + ", " + numString + ")";
    }

    public boolean isEqualMark(Card aCard) {
        return mark == aCard.mark;
    }

    public boolean isLargerThan(Card aCard) {
        if (mark == 1 && aCard.mark == 13)
            return true;
        else if (mark == 13 && aCard.mark == 1)
            return false;
        else if (mark > aCard.mark)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Card card1, card2, card3;
        card1 = new Card(Card.SPADE, 1);
        card2 = new Card(Card.DIAMOND, 2);
        card3 = new Card(Card.SPADE, 13);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
    }

}
