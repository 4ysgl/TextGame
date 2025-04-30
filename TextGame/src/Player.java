import java.util.Scanner;

public class Player {
    Weapon weapon;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    Location location;
    Inventory inv = new Inventory();
    // Kalııtım
    private int id;
    private int damage; // HASAR
    private int health; // CAN

    private int money; // PARA
    private String name;  // İSİM
    private String gamerName;
    Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }


    // karakter secmek için bir metod oluşturuldu
    void selectChar() {
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};

        for (GameChar gameChar : charList) {

            System.out.println(
                    "İD: \t" + gameChar.getId() +
                            "\t Karakter: \t" + gameChar.getName() +
                            " \t Hasar \t : " + gameChar.getDamage() +
                            " \t Sağlık \t : " + gameChar.getHealth() +
                            " \t Para \t :" + gameChar.getMoney());
        }
        System.out.println("Lütfen karakter seçiniz ");
        int selectChar = input.nextInt();
        switch (selectChar) {


            case 1:
                initPlayer(new Samurai());

                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("İD: " + getId() +
                "\t KARAKTER:\t" + getName() +
                " \tHASAR: \t" + getDamage() +
                "\tSAĞLIK : \t" + getHealth() +
                "\tPARA :\t" + getMoney());

    }

    private void initPlayer(GameChar gameChar) {
        this.id = gameChar.getId();
        this.setDamage(gameChar.getDamage());
        this.setHealthy(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setName(gameChar.getName());

    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHealth(int health) {
        this.health = health;
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

    public void setHealthy(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGamerName() {
        return gamerName;
    }

    public void setGamerName(String gamerName) {
        this.gamerName = gamerName;
    }
    public int getTotalDamage() {
        return this.getDamage() + this.getInv().getDamage();
    }

    public void setWeapon(Weapon selectedWeapon) {
    }


///  weapon

}

