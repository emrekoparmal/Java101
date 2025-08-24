import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Players[] players = {
                new Players(90, 86, 96, 95, 68, 60000000, "Cristiano Ronaldo"),
                new Players(94, 95, 92, 88, 66, 58000000, "Lionel Messi"),
                new Players(93, 93, 91, 92, 70, 55000000, "Neymar Junior"),
                new Players(83, 86, 85, 82, 72, 22000000, "Arda Güler"),
                new Players(86, 84, 88, 85, 68, 23500000, "Kenan Yıldız")
        };

        Club[] clubs = {
                new Club(90, 93, 98, 5, 100000000, "Real Madrid"),
                new Club(86, 85, 87, 3, 35000000, "Fenerbahçe"),
                new Club(54, 54, 55, 1, 200000, "Arhavispor"),
                new Club(66, 68, 65, 2, 1000000, "Bursaspor"),
                new Club(88, 87, 90, 4, 60000000, "Juventus"),
        };

        System.out.print("Adınız Soyadınız: ");
        String name = input.nextLine();

        System.out.print("Lütfen Teknik Direktörlük Yeteneğinizi Giriniz (1-5 arası): ");
        int skill = input.nextInt();

        if (skill <= 0 || skill > 5) {
            System.out.println("Yeteneğinizi yanlış girdiniz.");
            return;
        }

        System.out.println("İşte yönetebileceğiniz kulüpler:");
        for (Club kopya : clubs) {
            if (skill >= kopya.tecrube) {
                kopya.print();
            }
        }

        System.out.print("İstediğiniz takımın TECRÜBE değerini giriniz: ");
        int secim = input.nextInt();

        Club secilen = null;
        for (Club kopya : clubs) {
            if (secim == kopya.tecrube) {
                secilen = kopya;
                break;
            }
        }

        if (secilen == null) {
            System.out.println("Geçersiz seçim. Program sonlandırılıyor.");
            return;
        }

        System.out.println("Sayın " + name + ". Yeni kulübünüz " + secilen.clubname + ". Hoş geldiniz!");
        System.out.println("Kulüp bütçesi: " + secilen.bütçe + " €");
        System.out.println("Dikkat! Oyuncuların değerleri Euro (€) cinsindendir.");


        int[] uygunIndexler = new int[players.length];
        int uygunSayisi = 0;
        System.out.println("\nBütçenize uygun transfer adayları:");
        for (int i = 0; i < players.length; i++) {
            if (players[i].değer <= secilen.bütçe) {
                uygunIndexler[uygunSayisi] = i;
                uygunSayisi++;
                System.out.println(uygunSayisi + ") " + players[i].oyuncuadı +
                        " - Değer: " + players[i].değer + " €");
            }
        }

        if (uygunSayisi == 0) {
            System.out.println("Maalesef bütçenize uygun oyuncu bulunmuyor. Scout ekibini güçlendirelim mi? 🙂");
            return;
        }

        System.out.print("\nLütfen transfer etmek istediğiniz oyuncunun numarasını giriniz: ");
        int secimOyuncu = input.nextInt();

        if (secimOyuncu <= 0 || secimOyuncu > uygunSayisi) {
            System.out.println("Geçersiz seçim.");
            return;
        }

        Players transfer = players[uygunIndexler[secimOyuncu - 1]];
        System.out.println("\nTebrikler! " + transfer.oyuncuadı + " transfer edildi 🎉");
        int kalanBütçe = secilen.bütçe - transfer.değer;
        System.out.println("Kalan bütçe: " + kalanBütçe + " €");



    }
}

