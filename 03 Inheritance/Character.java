public abstract class Character {
    int health;
    String name;
    String className;
    int attackStrength;
    public Character(String name) {
        this.name = name;
    }
    public int attack() {
        return this.attackStrength;
    }
    public void hit(int points) {
        this.health -= points;
    }
    public boolean isAlive() {
        return this.health > 0;
    }
    public String toString() {
        return String.format("%s (%s): %d Attack, %d HP remaining", this.name, this.className, this.attackStrength, this.health);
    }
}
