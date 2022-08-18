import java.util.Scanner;

public class app {

    static void sum(int a, int b){
        int result = 0;
        result = a + b;
        System.out.println("Toplam: " + result);
    }

    static void minus(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma: " + result);
    }

    static void times(int a, int b){
        int result = a * b;
        System.out.println("Çarpma: " + result);
    }

    static int divided(int a, int b){
        if(b == 0)
            return 0;

        int result = a / b;
        System.out.println("Bölüm: " + result);
        return result;
    }

    static void power(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        System.out.println("Üs Hesabı: " + result);
    }

    static void mod(int a, int b){
        int result = a % b;
        System.out.println("Mod: " + result);
    }

    static void rectangle(int a, int b){
        System.out.println("Çevresi: " + (2 * (a+b)));
        System.out.println("Alanı: " + (a*b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int select;

        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme İşlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Mod Alma\n" +
                "7- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap";

        while (true){
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();

            if (select == 0)
                break;

            System.out.print("1. sayı: ");
            int a = input.nextInt();
            System.out.print("2. sayı: ");
            int b = input.nextInt();

            switch (select){
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    if(divided(a, b) == 0){
                        System.out.println("İkinci sayı sıfırdan farklı olmalı.");
                    }
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    rectangle(a, b);
                    break;
                default:
                    System.out.println("Geçersiz işlem.");
            }
        }
    }
}
