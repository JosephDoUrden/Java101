import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();

        pattern(n);
    }

    static void pattern(int a){
        if (a > 0){
            System.out.print(a + " ");
            pattern(a - 5);
        }
        System.out.print(a + " ");
    }
}
