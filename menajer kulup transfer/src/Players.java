public class Players {
    int hız,pas,defans,şut,güç,değer;
    String oyuncuadı;

    Players(int hız,int pas,int şut,int güç,int defans,int değer,String oyuncuadı) {
        this.hız = hız;
        this.pas = pas;
        this.güç = güç;
        this.şut = şut;
        this.defans = defans;
        this.değer = değer;
        this.oyuncuadı = oyuncuadı;

    }
    void print() {
        System.out.println("---------------");
        System.out.println("Hız : " + this.hız);
        System.out.println("Pas : " + this.pas);
        System.out.println("Şut : " + this.şut);
        System.out.println("Güç : " + this.güç);
        System.out.println("Defans : " + this.defans);
        System.out.println("Değeri : " + this.değer);
        System.out.println("Oyuncu Adı : " + this.oyuncuadı);
    }

}
