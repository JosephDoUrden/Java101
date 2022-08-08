import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, total = 1, sayi1, sayi2, sayi1Factorial = 1, sayi2Factorial = 1;
        int sayi3, sayi3Factorial = 1;

        System.out.print("Sayı Giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++){
            total *= i;
        }

        System.out.println(n + " Faktöriyel: " + total);

        System.out.print("1. sayıyı giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        sayi2 = input.nextInt();

        //C(n,r) = n! / (r! * (n-r)!)

        for (int i = 1; i <= sayi1; i++){
            sayi1Factorial *= i;
        }

        for (int i = 1; i <= sayi2; i++){
            sayi2Factorial *= i;
        }

        sayi3 = sayi1 - sayi2;

        for (int i = 1; i <= sayi3; i++){
            sayi3Factorial *= i;
        }

        System.out.println("Kombinasyon: " + (sayi1Factorial / (sayi2Factorial * sayi3Factorial)));
    }
}
