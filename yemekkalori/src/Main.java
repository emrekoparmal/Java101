import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu kg olarak girin : ");
        int kilo = input.nextInt();
        System.out.println("Kilonuzun İki Katı Kadar Protein Almalısınız : " + kilo * 2 +"Gram");
        System.out.println("İşte Yemek Listemiz");


        System.out.println("----------------------");


        System.out.println("Yemeklerin Besin Değerleri (Gram) Olarak Alınır.\n");

        System.out.println("--------------------");

        System.out.println("Çorbalar 1 Kase,Diğer Yemekler Tabak Olarak Alınır. \n");

        System.out.println("-----------------------");

        Foods f1 = new Foods(515, 36, 0.8, 14.5, "Tavuk Pilav");
        Foods f2 = new Foods(350, 12, 1.0, 1.5, "Makarna");
        Foods f3 = new Foods(120, 7, 2, 3, "Mercimek Çorbası");
        Foods f4 = new Foods(80, 2, 4, 3, "Karışık Salata");

        f1.print();
        System.out.println("----------------------");
        f2.print();
        System.out.println("----------------------");
        f3.print();
        System.out.println("----------------------");
        f4.print();
    }
}

