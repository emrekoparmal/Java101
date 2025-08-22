import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Club[] clubs = {
                new Club(90,93,98,5,"Real Madrid"),
                new Club(86,85,87,3,"Fenerbahçe"),
                new Club(54,54,55,1,"Arhavispor"),
                new Club(66,68,65,2,"Bursaspor"),
                new Club(88,87,90,4,"Juventus"),
        };
        System.out.print("Adınız Soyadınız: ");
        String name=input.nextLine();
        System.out.print("Lütfen Teknik Direktörlük Yeteneğinizi Giriniz (1-5 arası) : ");
        int skill = input.nextInt();
        if (skill <= 0 || skill >5 ) {
            System.out.println("Yeteneğinizi Yanlış Girdiniz");
        }else {
            System.out.println("İşte Yönetebileceğiniz Kulüpler : ");
            for (Club kopya: clubs){
                if (skill >= kopya.tecrube) {
                    kopya.print();
                }
            }
            System.out.print("İstediğiniz Takımın Tecrübe Değerini Giriniz: ");
            int secim=input.nextInt();
            for (Club kopya: clubs){
                if (secim == kopya.tecrube) {
                    System.out.println("Sayın "+name+". Yeni Kulübünüz "+kopya.clubname+". Hoşgeldiniz");
                }
            }

        }
    }
}
