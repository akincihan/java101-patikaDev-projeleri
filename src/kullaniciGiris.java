import java.util.Scanner;
import java.lang.String;

public class kullaniciGiris {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName, password, sifirlama, newPassword;
        System.out.print("Kullan�c� Ad�n�z: ");
        userName = scan.nextLine();
        System.out.print("�ifreniz: ");
        password = scan.nextLine();

        if (userName.equals("oguzhan") && password.equals("1234")) {
            System.out.print("Ba�ar�yla giri� yapt�n�z.");
        } else if (!(userName.equals("oguzhan") && password.equalsIgnoreCase(""))) {
            System.out.println("Kullan�c� ad�n�z veya �ifreniz hatal�.");
            System.out.print("�ifrenizi s�f�rlamak ister misiniz? (E/H):");
            sifirlama = scan.nextLine();
            if (sifirlama.equals("H")) {
                System.out.print("L�tfen tekrar giri� yapmak i�in sayfay� yenileyiniz.");
            } else if (sifirlama.equals("E")) {
                System.out.print("Yeni �ifrenizi giriniz: ");
                newPassword = scan.nextLine();

                while (newPassword.equals("1234") || newPassword.equals(password)) {
                    System.out.print("�ifreniz olu�turulamad�. Farkl� bir �ifre ile tekrar deneyin: ");
                    newPassword = scan.nextLine();
                }
                System.out.print("�ifreniz ba�ar�yla olu�turuldu.\nYeniden Giri� yapabilirsiniz.\nKullan�c� Ad�n�z: ");
                userName = scan.nextLine();
                System.out.print("�ifreniz: ");
                password = scan.nextLine();

                if (userName.equals("oguzhan") && password.equals(newPassword)) {
                    System.out.print("Ba�ar�yla giri� yapt�n�z.");
                } else {
                    System.out.println("Kullan�c� ad�n�z veya �ifreniz hatal�.");
                }

            }


        }

    }
}
