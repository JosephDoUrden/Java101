import java.util.Scanner;

public class app {

    static int power(int a, int b){
        if(a == 1 | b == 0)
            return 1;

        return power(a,b-1) * a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayı: ");
        int a = input.nextInt();
        System.out.print("2. Sayı: ");
        int b = input.nextInt();

        System.out.println("Sonuç: " + power(a, b));


    }
}
