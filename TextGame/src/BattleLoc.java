import javax.swing.*;

public abstract class BattleLoc extends Location{
    protected Obstacle obstacle;
    protected String award;

    BattleLoc(Player player, String name, Obstacle obstacle, String award) {
        super(player);
        this.obstacle = obstacle;
        this.name = name;
        this.award = award;
    }
public boolean getLocation(){
    int obsCount = obstacle.count();
    System.out.println("Şuan buradasınız :"+this.getName());
    System.out.println("DİKKATLİ OL !!  "+this.obstacle.count()+" Tane  "+ this.obstacle.getName()+ " Yaşıyor");
        return true;
}
    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
