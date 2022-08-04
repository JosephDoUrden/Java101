import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kg, height, bmi;

        System.out.println("Boyunuzu metre cinsinden giriniz: ");
        height = input.nextDouble();
        System.out.println("Kilonuzu giriniz: ");
        kg = input.nextDouble();

        bmi = kg/(height*height);

        System.out.println("Vücut kitle indeksiniz: " + bmi);


    }
}
