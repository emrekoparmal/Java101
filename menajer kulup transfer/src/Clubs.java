class Club {

    int defans, ortasaha, hucum, tecrube;
    String clubname;

    Club(int defans, int ortasaha, int hucum,int tecrube, String clubname) {
        this.defans = defans;
        this.ortasaha = ortasaha;
        this.hucum = hucum;
        this.clubname = clubname;
        this.tecrube = tecrube;
    }

    int average() {
        return (hucum + ortasaha + defans) / 3;

    }
    void print() {
        System.out.println("-------------------------------");
        System.out.println("Gerekli Tecrübe : " + this.tecrube);
        System.out.println("Kulüp Adı : " + this.clubname);
        System.out.println("Defans : " + this.defans);
        System.out.println("Orta Saha : " + this.ortasaha);
        System.out.println("Hücum : " + this.hucum);
        System.out.println("Takım Ortalaması : " + average());
        System.out.println("-------------------------------");
    }
}















