import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;


        for (int number = 2; number <= 100; number++) {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.print(number + " ");
                counter++;
            }
        }

    }
}
