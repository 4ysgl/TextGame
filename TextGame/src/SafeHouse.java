public class SafeHouse extends  NormalLoc {
    public SafeHouse(Player player) {
        super(player,"Güvenli Ev");
    }
    boolean getLocation(Player player) {

            player.setHealthy(player.getHealth());
            System.out.println("Yenilendiniz...");
            System.out.println("Şuan Güvenli Evdesiniz");
            return true;

    }
}
