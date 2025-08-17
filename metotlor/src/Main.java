import java.util.Scanner;

public class Main {

    static int pow(int x,int y){
        int toplam =1;
        for (int i=1;i<=y;i++){
            toplam=toplam*x;
        }
        return toplam;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Taban giriniz: ");
        int t= input.nextInt();
        System.out.print("Üs giriniz: ");
        int u= input.nextInt();

        System.out.println(pow(t,u));
        }
    }
