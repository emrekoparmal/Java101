public class Foods {
    int calori,protein;
    double yag,sugar;
    String yemekadi;
    Foods(int calori,int protein,double sugar,double yag,String yemekadi) {
        this.calori = calori;
        this.protein = protein;
        this.sugar = sugar;
        this.yag = yag;
        this.yemekadi = yemekadi;
    }
    void print()  {
        System.out.println("Yemek Adı : " + this.yemekadi);
        System.out.println("Kalori : " + this.calori);
        System.out.println("Protein : " + this.protein);
        System.out.println("Yağ : " + this.yag);
        System.out.println("Şeker : " + this.sugar);
    }
}
