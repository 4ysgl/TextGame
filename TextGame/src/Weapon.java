import java.util.Scanner;

public class Weapon extends WarTool {
    private int wDamage;
    private int id;
Player player;
    public Weapon(int wId, String wName, int wMoney, int wDamage) {
        super(wId, wMoney, wName);
        this.wDamage = wDamage;
    }

    public void setwDamage(int wDamage) {
        this.wDamage = wDamage;
    }

    public int getwDamage() {
        return wDamage;
    }

    public static void weaponMenu(Player player)
    {
        Weapon[] weaponList = {new Tabanca(), new Knife()};
        Scanner inp = new Scanner(System.in);
        System.out.println("SİLAHLAR");
        for (Weapon weapon : weaponList) {
            System.out.println(
                    "ID:\t" + weapon.getId() +
                            "\t İsim:\t" + weapon.getName() +
                            "\t Hasar:\t" + weapon.getwDamage() +
                            "\t Para:\t" + weapon.getMoney()
            );
        }

        System.out.print("Silah Seçiniz: CIKMAK İÇİN:0  ");
        int selID = inp.nextInt();
        if (selID == 0) {
            System.out.println("Silah menüsünden çıkılıyor.");
            return;
        }
        Weapon selectedWeapon=null;

        switch (selID) {
            case 1:
                selectedWeapon = new Tabanca();
                break;
            case 2:
                selectedWeapon = new Knife();
                break;
            default:
                System.out.println("Geçersiz seçim ,Varsayılan olarak Tabanca verildi");
                selectedWeapon = new Tabanca();
                break;
        }

        if (player.getMoney() >= selectedWeapon.getMoney()) {
            player.getInv().setWeapon(selectedWeapon);
            player.setMoney(player.getMoney() - selectedWeapon.getMoney());
            System.out.println(selectedWeapon.getName() + " satın alındı!");
            System.out.println("Toplam Hasar: "+(selectedWeapon.getwDamage()+player.getDamage()));
            System.out.println("Kalan Para: " + player.getMoney());
        } else {
            System.out.println("Yeterli paranız yok!");
        }
    }
private  void initWeapon(Weapon weapon)
{
    this.id = weapon.getId();
    this.setName(weapon.getName());
    this.setMoney(weapon.getMoney());
    this.setwDamage(weapon.getwDamage());
}

}
