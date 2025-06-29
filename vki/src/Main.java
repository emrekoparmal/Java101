import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu Metre Cinsinden Giriniz (Virgül Kullanarak) : ");
        double boy = scanner.nextDouble();

        System.out.println("Kilonuzu Kilogram Cinsinden Giriniz :");
        double kilo = scanner.nextDouble();

        double indeks = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz :" + indeks);
        if (indeks<18.5){
            System.out.println("zayıf");
        } else if (indeks<24.9) {
            System.out.println("normal");
        } else if (indeks<29.9) {
            System.out.println("kilolu");

        } else  {
            System.out.println("OBEZ");

        }


    }
}
