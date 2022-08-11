import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, total = 0;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (number == total) {
            System.out.println(number + " mükemmel sayıdır.");
        }else {
            System.out.println(number + " mükemmel sayı değildir.");
        }
    }
}
