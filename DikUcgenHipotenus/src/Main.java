import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;
       Scanner girdi = new  Scanner(System.in);
        System.out.println("Birinci Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.println("İkinci Kenarı Giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Üçgenin Hipotenüsü :" + c);

    }
}