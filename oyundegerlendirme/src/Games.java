public class Games {
    double oynanış, hikaye, grafik, karakterler;
    String oyunadi;

    Games(double oynanış, double hikaye, double grafik, double karakterler, String oyunadi) {

        this.oynanış = oynanış;
        this.hikaye = hikaye;
        this.grafik = grafik;
        this.karakterler = karakterler;
        this.oyunadi = oyunadi;

    }

    void print() {
        System.out.println(" Oyun Adı : " + this.oyunadi);
        System.out.println("Oynanış : " + this.oynanış);
        System.out.println(" Hikaye : " + this.hikaye);
        System.out.println("Karakterler : " + this.karakterler);
        System.out.println("Grafikler : " + this.grafik);
    }
}
