import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double kg, total=0;

        System.out.println("Armut kaç kilo: ");
        kg = input.nextDouble();
        total += armut*kg;

        System.out.println("Elma kaç kilo: ");
        kg = input.nextDouble();
        total += elma*kg;

        System.out.println("Domates kaç kilo: ");
        kg = input.nextDouble();
        total += domates*kg;

        System.out.println("Muz kaç kilo: ");
        kg = input.nextDouble();
        total += muz*kg;

        System.out.println("Patlıcan kaç kilo: ");
        kg = input.nextDouble();
        total += patlican*kg;

        System.out.println("Toplam tutar: " + total + " TL");


    }
}
