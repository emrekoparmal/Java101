public class Players {
    int pace, pas, shoot, dribling, strength;
    String name;

    Players(int pace, int pas, int shoot, int dribling, int strength, String name) {
        this.pace = pace;
        this.pas = pas;
        this.shoot = shoot;
        this.dribling = dribling;
        this.strength = strength;
        this.name = name;
    }

    double average() {
        return (pace + pas + shoot + dribling + strength) / 5.0;
    }

    void print() {
        System.out.println("Adı: " + this.name);
        System.out.println("Hızı: " + this.pace);
        System.out.println("Pası: " + this.pas);
        System.out.println("Şutu: " + this.shoot);
        System.out.println("Gücü: " + this.strength);
        System.out.println("Driblingi: " + this.dribling);
        System.out.println("Ortalama Puanı: " + average());
    }

    // Bir dizi oyuncuyu karşılaştır ve GOAT’ı göster
    static void comparePlayers(Players[] players) {
        for (int i = 0; i < players.length; i++) {
            for (int j = i + 1; j < players.length; j++) {
                if (players[i].average() > players[j].average()) {
                    System.out.println(players[i].name + " daha iyi. (" + players[i].average() + " > " + players[j].average() + ")");
                } else if (players[i].average() < players[j].average()) {
                    System.out.println(players[j].name + " daha iyi. (" + players[j].average() + " > " + players[i].average() + ")");
                } else {
                    System.out.println(players[i].name + " ve " + players[j].name + " eşit puana sahip. (" + players[i].average() + ")");
                }
            }
        }

        // GOAT
        Players goat = players[0];
        for (Players p : players) {
            if (p.average() > goat.average()) {
                goat = p;
            }
        }
        System.out.println(goat.name + " GOAT");
    }
}
