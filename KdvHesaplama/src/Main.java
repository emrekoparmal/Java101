import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    double tutar,kdvOran = 0.18;
    Scanner input = new Scanner(System.in);
    System.out.println("Ücret Tutarını Giriniz : " );
    tutar = input.nextDouble();
    double kdvTutar = tutar * kdvOran ;
    double kdvlitutar  = tutar + kdvTutar;
   System.out.println("KDV'siz Tutar : " + tutar);
   System.out.println("KDV Oran : " + kdvOran);
   System.out.println("KDV Tutarı : " + kdvTutar);
   System.out.println("KDV'li Tutar : " + kdvlitutar);


    }
}