import java.util.Scanner;

public class Game {
    Player player;
    Location location;

    private Scanner inp = new Scanner(System.in);


    void Login() {
        System.out.println("Oyuna Hoşgeldiniz !");
        // System.out.println("İsminizi Giriniz : ");
        player = new Player("ayse");
        System.out.println("OYUNA BAŞLYABİLİRSİN" + " " + player.getName());
        System.out.printf(" LÜTFEN BİR KARAKTER SEÇİNİZ  \n ");
        player.selectChar();

    }

    public void Start() {

            System.out.println();
            System.out.println("=================================================");
            System.out.println();
            System.out.println("Bir yer seçiniz : ");
            System.out.println("1. Güvenli Ev --> Size ait güvenli bir mekan, Düşman yok !");
            System.out.println("2. Mağara --> Zombi çıkabilir!");
            System.out.println("3. Orman --> Vampir Çıkabilir !");
            System.out.println("4. Nehir --> Ayı çıkabilir!");
            System.out.println("5. Mağaza --> Silah veya Zırh alabilirsiniz!");
            System.out.print("Gitmek istediğiniz yer : ");
            int selLoc = inp.nextInt();

            while (selLoc < 0 || selLoc > 5)
            {
                System.out.print("Lütfen geçerli bir yer seçiniz : ");
                selLoc = inp.nextInt();
            }
            switch (selLoc)
            {case 1:
                location = new SafeHouse(player);
                // burada locasyonun safe house gibi davranmasını istiyor
                break;
                case 2:
                    location = new ToolStore(player);
                    break;
           default:
                    location = new SafeHouse(player);
            }

            if (!location.getLocation()) {
                System.out.println("Oyun Bitti !");

            }





        }
    }


