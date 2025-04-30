import java.awt.font.TextHitInfo;
import java.util.Scanner;

public class Weapon extends WarTool{
private  int id;
Player player;
    private  int wDamage;
Scanner inp=new Scanner(System.in);
    public Weapon(int wId, String wName, int wMoney,int wDamage) {
        super(wId, wMoney, wName);
        this.wDamage=wDamage;
    }

    public void setwDamage(int wDamage) {
        this.wDamage = wDamage;
    }

    public int getwDamage() {
        return wDamage;
    }

    public static void weaponMenu(Player player) {
        Weapon[] weaponList = { new Tabanca(), new Knife() };
        Scanner inp = new Scanner(System.in);

        for (Weapon weapon : weaponList) {
            System.out.println(
                    "ID:\t" + weapon.getwId() +
                            "\t İsim:\t" + weapon.getwName() +
                            "\t Hasar:\t" + weapon.getwDamage() +
                            "\t Para:\t" + weapon.getwMoney()
            );
        }

        System.out.print("Silah Seçiniz: ");
        int selID = inp.nextInt();

        Weapon selectedWeapon;
        switch (selID) {
            case 1:
                selectedWeapon = new Tabanca();
                break;
            case 2:
                selectedWeapon = new Knife();
                break;
            default:
                System.out.println("Geçersiz seçim, varsayılan olarak Tabanca verildi.");
                selectedWeapon = new Tabanca();
                break;
        }

        if (player.getMoney() >= selectedWeapon.getwMoney()) {
            player.setWeapon(selectedWeapon);
            player.setMoney(player.getMoney() - selectedWeapon.getwMoney());
            System.out.println(selectedWeapon.getwName() + " satın alındı!");
            System.out.println("KALAN: ");
        } else {
            System.out.println("Yeterli paranız yok!");
        }
    }

    private void initWeapon(Weapon weapon)
    {
        this.id=weapon.getwId();
       this.setwName(weapon. getwName());
       this.setwMoney(weapon.getwMoney());
       this.setwDamage(weapon.getwDamage());

    }

    public void buyWeapon(int itemID) {
        int damage = 0, price = 0;
        String wName = null;
        switch (itemID) {
            case 1:
                damage = 2;
                wName = "Tabanca";
                price = 25;
                break;
            case 2:
                damage = 3;
                wName = "Kılıc";
                price = 35;
                break;
            case 3:
                damage = 7;
                wName = "Tüfek";
                price = 45;
                break;
            case 4:
                System.out.println("Çıkış yapılıyor.");
                break;
            default:
                System.out.println("Geçersiz İşlem !");
                break;
        }


    }
}
