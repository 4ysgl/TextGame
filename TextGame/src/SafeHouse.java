public class SafeHouse extends  NormalLoc {
    public SafeHouse(Player player) {
        super(player,"Güvenli Ev");
    }
    boolean getLocation(Player player) {
        player.setHealthy(player.getHealth());
        System.out.println("Güvenli evdesiniz");

        return true;
    }
}
