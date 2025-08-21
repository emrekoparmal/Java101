public class Main {
    public static void main(String[] args) {
        Players p1 = new Players(99, 84, 99, 95, 97, "Cristiano Ronaldo");
        Players p2 = new Players(96, 92, 87, 98, 85, "Lionel Messi");
        Players p3 = new Players(90, 88, 86, 96, 90, "Neymar Junior");

        Players[] team = {p1, p2, p3};

        for (Players p : team) {
            p.print();
            System.out.println("--------------");
        }

        System.out.println("==============");
        Players.comparePlayers(team);
    }
}

