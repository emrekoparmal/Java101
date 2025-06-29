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



    }
    }
