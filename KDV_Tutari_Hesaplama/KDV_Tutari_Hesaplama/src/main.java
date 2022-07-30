import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double kdv, fiyat, kdvOrani, fiyatKDV;
        boolean kdvCheck;

        Scanner inp = new Scanner(System.in);

        System.out.println("Fiyat giriniz: ");
        fiyat = inp.nextDouble();

        kdvCheck=(0<fiyat)&&(1000>fiyat);
        kdvOrani=kdvCheck?0.18:0.08;

        kdv=kdvOrani*fiyat;
        fiyatKDV=kdv+fiyat;

        System.out.println("KDV'siz fiyat: "+fiyat);
        System.out.println("KDV Orani: "+kdvOrani);
        System.out.println("Eklenecek KDV tutari:"+kdv);
        System.out.println("Fiyat + KDV: "+fiyatKDV);
    }
}
