import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;
        int islemSecimi;
        System.out.print("�lk Say�y� giriniz: ");
        a = scan.nextInt();
        System.out.print("�kinci Say�y� giriniz: ");
        b = scan.nextInt();

        System.out.println("1- Toplama\n2- ��karma\n3- �arpma\n4- B�lme");
        System.out.print("Yapmak istedi�iniz i�lem numaras�n� giriniz: ");
        islemSecimi = scan.nextInt();

        switch (islemSecimi) {
            case 1:
                System.out.println("Toplama i�lem sonucu: " + (a + b));
                break;
            case 2:
                System.out.println("��karma i�lem sonucu: "+(a-b));
                break;
            case 3:
                System.out.print("�arpma i�lem sonucu: "+(a*b));
                break;
            case 4:
                System.out.println("B�lme i�lem sonucu: "+(a/b));
                break;
            default:
                System.out.print("Hatal� giri� yapt�n�z. L�tfen se�iminizi 1 ve 4 rakamlar� ile yap�n�z.");
                break;
        }

    }

}
