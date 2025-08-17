 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz : ");
        int a= input.nextInt();

        System.out.print("1. sayı: ");
        int x= input.nextInt();
        int min=x;
        int max=x;

        for (int i = 2; i <= a; i++) {
            System.out.print(i+ ". sayı: ");
            x= input.nextInt();

            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
        }

        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);
    }
}

