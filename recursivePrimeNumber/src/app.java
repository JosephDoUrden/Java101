import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();

        prime(number, 2);

    }

    static void prime(int number, int i){
        if (i == number){
            System.out.println(number + " Asal Sayı!");
            return;
        } else if (number % i == 0) {
            System.out.println(number + " Asal Sayı Değil!");
            return;
        }
        prime(number, i+1);
    }
}
