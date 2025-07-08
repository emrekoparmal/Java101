import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yas, yolculukTipi;
        double ücret, indirimliÜcret, indirimliToplamFiyat, mesafe;
        double küçükYas = 0.5, gençYas = 0.1, ileriYas = 0.3, gidisDönüs = 0.2;

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen yolculuk tipini seçiniz : (Tek yön/Gidiş Dönüş)\n" + "1-Tek Yön\n" + "2-Gidiş Dönüş");
        yolculukTipi = inp.nextInt();

        switch (yolculukTipi){
            case 1:
                System.out.print("Lütfen gidilecek mesafeyi seçiniz : ");
                mesafe = inp.nextDouble();
                ücret = mesafe*(0.10);

                System.out.print("Lütfen yaşınızı giriniz : ");
                yas = inp.nextInt();
                if(yas>=0 && yas<=12){
                    indirimliÜcret = ücret*küçükYas;
                    indirimliToplamFiyat = ücret-indirimliÜcret;
                    System.out.println("Ödeyeceğiniz indirimli tutar : "+indirimliToplamFiyat+"TL");

                } else if (yas>=12 && yas<=24) {
                    indirimliÜcret = ücret*gençYas;
                    indirimliToplamFiyat = ücret-indirimliÜcret;
                    System.out.println("Ödeyeceğiniz indirimli tutar : "+indirimliToplamFiyat+"TL");

                } else if (yas>24 && yas<=65) {
                    System.out.println("Ödeyeceğinz bilet ücreti : "+ücret+"TL");

                } else if (yas>65) {
                    indirimliÜcret = ücret*ileriYas;
                    indirimliToplamFiyat = ücret-indirimliÜcret;
                    System.out.println("Ödeyeceğiniz indirimli ücret : "+indirimliToplamFiyat+"TL");
                }else {
                    System.out.println("Hatalı giriş yaptınız! Tekrar deneyiniz.");
                }break;

            case 2:
                System.out.print("Lütfen gidilecek mesafeyi giriniz : ");
                mesafe = inp.nextDouble();
                ücret = mesafe*(0.10);

                System.out.print("Lütfen yaşınızı giriniz : ");
                yas = inp.nextInt();
                if (yas>=0 && yas<=12){
                    indirimliÜcret = ((ücret) * (küçükYas)) - (ücret*gidisDönüs);
                    indirimliToplamFiyat = ücret-indirimliÜcret;
                    System.out.println("Ödeyeceğiniz indirimli ücret : "+indirimliToplamFiyat+"Tl");

                } else if (yas>=12 && yas<=24) {
                    indirimliÜcret = ((ücret) * (gençYas)) - (ücret*gidisDönüs);
                    indirimliToplamFiyat = ücret-indirimliÜcret;
                    System.out.println("Ödeyeceğiniz indirimli ücret : "+indirimliToplamFiyat+"Tl");

                } else if (yas>24 && yas<=65) {
                    ücret = (mesafe*(0.10))- (ücret*gidisDönüs);
                    System.out.println("Ödeyeceğinz bilet ücreti : "+ücret+"TL");

                } else if (yas>65) {
                    indirimliÜcret = ((ücret) * (ileriYas)) - (ücret*gidisDönüs);
                    indirimliToplamFiyat = ücret-indirimliÜcret;
                    System.out.println("Ödeyeceğiniz indirimli ücret : "+indirimliToplamFiyat+"Tl");
                }else {
                    System.out.println("Hatalı giriş yaptınız! Lütfen tekrar deneyiniz.");
                    break;
                }
        }

    }
}





