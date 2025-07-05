import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanıcı Adınızı Giriniz :");
        userName = inp.nextLine();
        System.out.println("Şifrenizi Giriniz :");
        password = inp.nextLine();
        if (userName.equals("emre") && password.equals("emre123")) {
        System.out.println("GİRİŞ YAPTINIZ !");
    } else {
            System.out.println("BİLGİLERİNİZ YANLIŞ !");
        }


    }
}