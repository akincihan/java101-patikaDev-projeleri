import java.util.Scanner;

public class vucutKitleIndeksiHesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double kilo, boy, vucutKitleIndeks;

        System.out.print("L�tfen Kilonuzu giriniz: ");
        kilo = input.nextDouble();
        System.out.print("L�tfen Boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        vucutKitleIndeks = ( kilo / ( boy* boy ));
        System.out.print("V�cut Kitle �ndeksiniz: " +vucutKitleIndeks);




    }


}
