import java.util.Scanner;
public class kdvHesaplama {
    public static void main(String[] args) {

        // De�i�ken de�erimiz KDV say�lar� olacak
        double sayi, kdvOrani18= 0.18, kdvOrani8= 0.08, kdvliSonuc, hesaplananKdv, hesaplananKdv2, str, str2;

        Scanner input = new Scanner(System.in);

        // Kullan�c�dan KDV de�eri girmesini isteyelim

        System.out.print("KDV'si hesalanacak say�: ");
        sayi = input.nextDouble();

        /** str a��klama
         * �htimal olarak girilecek say� 1000'den k���kse hesaplananKdv 'i kullan�yoruz.
         * De�ilse hesaplananKdv2 yi kullan�yor sistem. */

        boolean kdvDusuk = sayi < 1000;
        hesaplananKdv = (sayi * kdvOrani18);
        hesaplananKdv2 = (sayi * kdvOrani8);

        /** str 2 a��klama
         *  kdvD���k do�ru ise kdvOrani18'i kullan
         *  de�ilse kdvOrani8'i kullan anlam�na geliyor.
         */
        str = kdvDusuk ? (hesaplananKdv) : (hesaplananKdv2);
        str2 = kdvDusuk ? (kdvOrani18) : (kdvOrani8);


        // Say�y� KDV'li hale d�n��t�relim ve ekrana nihai ��kt�y� alal�m.

        kdvliSonuc = ( str + sayi);

        System.out.println("KDV'siz Tutar: "+ sayi);
        System.out.println("KDV Oran�: "+ str2);
        System.out.println("Eklenecek KDV: "+ str);
        System.out.println("KDV'li Tutar: "+ kdvliSonuc);
    }
}