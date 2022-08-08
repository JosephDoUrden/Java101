import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, k, total = 1;

        System.out.print("Üssü alınacak sayı: ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println(total);
    }
}
