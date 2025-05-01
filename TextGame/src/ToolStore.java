import java.util.Scanner;

public class ToolStore extends NormalLoc {
    Scanner scan = new Scanner(System.in);

    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    public boolean getLocation() {
        System.out.println("Para : " + player.getMoney());
        System.out.println("1. Silahlar");
        System.out.println("2. Zırhlar");
        System.out.println("3. Çıkış");
        System.out.print("Seçiminiz : ");
        int selTool = scan.nextInt();

        switch (selTool) {
            case 1:
                Weapon.weaponMenu(this.player);
                break;
            case 2:
                Armor.armorMenu(this.player);
            break;
            case 3:
                return false;
            default:
                System.out.println("Geçersiz seçim.");
                break;
        }

        return true;
    }
}
