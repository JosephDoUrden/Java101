import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, total = 0, total2 = 0;

        do {
            System.out.print("Sayı Giriniz: ");
            n = input.nextInt();

            if (n % 2 == 1){
                total += n;
            }

        }while (n > 0);

        System.out.println("Tek sayıların toplamı: " + total);

        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

        do {
            System.out.print("Sayı Giriniz:");
            n = input.nextInt();

            if (n % 4 == 0){
                total2 += n;
            }


        }while (n % 2 == 0);

        System.out.println("4'ün katları sayıların toplamı: " + total2);


    }
}
