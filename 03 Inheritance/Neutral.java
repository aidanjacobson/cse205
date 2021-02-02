public class Neutral extends Character {
    public Neutral(String name) {
        super(name);
        this.className = "Neutral";
        this.attackStrength = 1000000;
        this.health = 1000000;
        // he's too powerful so we don't let him battle
    }
}
