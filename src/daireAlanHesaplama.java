import java.util.Scanner;

public class daireAlanHesaplama {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double yariCap, daireAlan, daireCevre, merkezAci, merkezAlan;

        System.out.print("Yar� �ap�n� giriniz: ");
        yariCap = input.nextDouble();
        System.out.print("Merkez A��s�n�n �l��s�n� Giriniz: ");
        merkezAci = input.nextDouble();


        // Alan Hesaplama pi*r*r
        daireAlan = Math.PI * yariCap * yariCap;
        daireCevre = 2 * Math.PI * yariCap;
        merkezAlan = ((Math.PI * (yariCap*yariCap) * merkezAci) / 360);
        System.out.println("Daire Alan�: " +daireAlan);
        System.out.println("Daire �evresi: " +daireCevre);
        System.out.println("Merkez A��s� Verilmi� Daire Alan�: " +merkezAlan);

    }

}