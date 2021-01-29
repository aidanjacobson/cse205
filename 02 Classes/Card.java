public class Card {
    String value = "";
    String suit = "";
    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String toString() {
        return this.value + " of " + this.suit;
    }
}