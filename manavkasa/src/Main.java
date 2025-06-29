import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double muz = 5;
        double armut = 7.5;
        double elma = 6;
        double kiraz =8.5;
        double karpuz = 3.5;

        System.out.println("Kaç Kilo Muz");
        double muzKilo = input.nextDouble();

        System.out.println("armut kaç kilo");
        double armutKilo = input.nextDouble();

        System.out.println("elma kaç kilo");
        double elmaKilo = input.nextDouble();

        System.out.println("kiraz kaç kilo ");
        double kirazKilo = input.nextDouble();

        System.out.println("Karpuz kaç kilo");
        double karpuzKilo = input.nextDouble();

        double toplam = 0.0;
        toplam += (3.5 * muzKilo);
        toplam += (6.3 * armutKilo);
        toplam += (5.0 * elmaKilo);
        toplam += (6.9 * kirazKilo);
        toplam += (2.8 * karpuzKilo);
        System.out.println("toplam tutar :" + toplam + "TL");






        }
    }
