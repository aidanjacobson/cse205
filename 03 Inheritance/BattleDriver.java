import java.util.Random;
public class BattleDriver {
    public static void main(String[] args) {
        Character monster = new Monster("Capitalism");
        Character hero = new Hero("Taxing the rich");
        boolean player1Turn = true;
        Random r = new Random();
        System.out.println("PREPARE FOR BATTLE!!!!");
        System.out.println(hero);
        System.out.println("VS...");
        System.out.println(monster);
        System.out.println();
        System.out.println();
        System.out.println("THE BATTLE BEGINS!!!!");
        while (monster.isAlive() && hero.isAlive()) {
            Character attacking;
            Character defending;
            if (player1Turn) {
                attacking = hero;
                defending = monster;
            } else {
                attacking = monster;
                defending = hero;
            }
            boolean attackWorked = r.nextDouble() >= 0.5;
            System.out.printf("%s tried to attack!", attacking.name);
            if (attackWorked) {
                System.out.println(" It was super effective!");
                defending.hit(attacking.attack());
            } else {
                System.out.println(" It wasn't very effective!");
            }
            System.out.println(defending);
            System.out.println();
            player1Turn = !player1Turn;
        }
        System.out.println("Winner:");
        if (hero.isAlive()) {
            System.out.println(hero);
        } else {
            System.out.println(monster);
        }
    }    
}
