import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        //Değişkenler
        int a, b;
        double c;

        //input
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci Kenarı giriniz: ");
        a = input.nextInt();
        System.out.println("İkinci kenarı giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs: " + c);
    }
}
