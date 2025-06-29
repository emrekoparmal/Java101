 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,tarih,muzik,turkce;
        Scanner inp = new Scanner(System.in) ;
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt() ;

        System.out.print("Fizik  Notunuz : ");
        fizik = inp.nextInt() ;

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt() ;

        System.out.print("Muzik Notunuz : ");
        muzik = inp.nextInt() ;

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt() ;

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt() ;

        int toplam= (mat + tarih + turkce + fizik + kimya + muzik) ;
        double sonuc = toplam /6.0 ;

        if (sonuc >= 50){
            System.out.println(sonuc+ " ile Geçti");
        }else {
            System.out.println(sonuc+ " ile Kaldı");
        }
    }
}