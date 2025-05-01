import java.util.Scanner;

public class Armor extends WarTool{
    private int id;
    Player player;
    private int aDamage;
    Scanner inp=new Scanner(System.in);

    public Armor(int aId,String aName, int aMoney,int aDamage) {
        super(aId, aMoney, aName);
        this.aDamage= aDamage;

    }

    public static void armorMenu(Player player)
    {
        Armor[] armorList = {new SmallArmor(), new MidArmor(), new GoldArmor()};
        Scanner inp = new Scanner(System.in);

        System.out.println("Zırhlar:");
        for (Armor armor : armorList) {
            System.out.println(
                    "ID: " + armor.getId() +
                            " | İsim: " + armor.getName() +
                            " | Engellenen Hasar: " + armor.getaDamage() +
                            " | Fiyat: " + armor.getMoney()
            );
        }

        System.out.print("Zırh Seçiniz (çıkmak için 0): ");
        int selID = inp.nextInt();

        if (selID == 0) {
            System.out.println("Zırh menüsünden çıkılıyor.");
            return;
        }

        Armor selectedArmor = null;

        switch (selID) {
            case 1:
                selectedArmor = new SmallArmor();
                break;
            case 2:
                selectedArmor = new MidArmor();
                break;
            case 3:
                selectedArmor = new GoldArmor();
                break;
            default:
                System.out.println("Geçersiz seçim.");
                return;
        }

        if (player.getMoney() >= selectedArmor.getMoney()) {
            player.getInv().setArmor(selectedArmor); // INVENTORY'e zırhı atıyoruz
            player.setMoney(player.getMoney() - selectedArmor.getMoney());
            System.out.println(selectedArmor.getName() + " satın alındı!");
            System.out.println("Engellenen Hasar: " + selectedArmor.getaDamage());
            System.out.println("Kalan Para: " + player.getMoney());
        } else {
            System.out.println("Yeterli paranız yok!");
        }
    }


    private void initArmor(Armor armor) {
        this.id = armor.getId();
        this.setName(armor.getName());
        this.setMoney(armor.getMoney());
        this.setaDamage(armor.getaDamage());

    }


    public int getId()
    {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getaDamage() {
        return aDamage;
    }

    public void setaDamage(int aDamage) {
        this.aDamage = aDamage;
    }

    public Scanner getInp() {
        return inp;
    }

    public void setInp(Scanner inp) {
        this.inp = inp;
    }
}
