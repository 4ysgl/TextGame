import java.util.Random;

public class Obstacle {

    private String name;
    private int damage;

    private int health;
    private int maxObs;
    private int award;

    public Obstacle(String name, int damage, int health, int maxObs, int award) {

        this.name = name;
        this.damage = damage;
        this.health = health;
        this.maxObs = maxObs;
        this.award = award;
    }
    public int count() {
        Random r = new Random();
        return r.nextInt(this.maxObs) + 1;
    }

    public int getMaxObs() {
        return maxObs;
    }

    public void setMaxObs(int maxObs) {
        this.maxObs = maxObs;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }



}
