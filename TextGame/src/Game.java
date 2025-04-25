import java.util.Scanner;

public class Game {
    Player player ;
Location location;

    private Scanner inp = new Scanner(System.in);


    void Start() {
        System.out.println("Oyuna Hoşgeldiniz !");
       // System.out.println("İsminizi Giriniz : ");
       player = new Player("ayse");
        System.out.println("OYUNA BAŞLYABİLİRSİN" + " " + player.getName());
        System.out.printf(" LÜTFEN BİR KARAKTER SEÇİNİZ  \n ");
        player.selectChar();

    }
}
