import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Card[] cards = draw(5);
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
    }
    public static Card getRandomCard() {
        Random r = new Random();
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String suit = suits[r.nextInt(suits.length)];
        String value = values[r.nextInt(values.length)];
        return new Card(value, suit);
    }
    public static Card[] draw(int num) {
        Card[] out = new Card[num];
        for (int i = 0; i < num; i++) {
            Card card = getRandomCard();
            out[i] = card;
        }
        return out;
    }
}
