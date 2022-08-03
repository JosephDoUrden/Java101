import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        int a, b, c;
        double u, alan;

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci kenarı giriniz: ");
        a = input.nextInt();
        System.out.println("İkinci kenarı giriniz: ");
        b = input.nextInt();
        System.out.println("Üçüncü kenarı giriniz: ");
        c = input.nextInt();

        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin alanı: " + alan);
    }
}
