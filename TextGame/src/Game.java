import java.util.Scanner;

public class Game {
    private  Scanner inp=new Scanner(System.in);
    void Start()
    {
        System.out.println("Oyuna Hoşgeldiniz !");
        System.out.println("İsminizi Giriniz : ");
      String NameGamer=inp.nextLine();
        System.out.println("OYUNA BAŞLYABİLİRSİN"+ " " +NameGamer);


    }
}
