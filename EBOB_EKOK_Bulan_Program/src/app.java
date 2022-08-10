import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;
        boolean check = false;

        do {
            System.out.print("n1 sayısını giriniz: ");
            n1 = input.nextInt();
            System.out.print("n2 sayısını giriniz: ");
            n2 = input.nextInt();

            if (n1 <= 0 || n2 <= 0){
                System.out.println("Pozitif sayılar giriniz.");
            }else {
                check = true;
            }
        }while (!check);

        if (n2 < n1){
            int temp = n2;
            n2 = n1;
            n1 = temp;
        }

        int i = n1;

        while (i >= 1) {
            if((n1 % i == 0) && (n2 % i == 0)){
                System.out.println("EBOB: " + i);
                break;
            }else {
                i--;
            }
        }

        i = n2;

        while (i <= (n1 * n2)) {
            if ((i % n1 == 0) && (i % n2 == 0)) {
                System.out.println("EKOK: " + i);
                break;
            }else {
                i++;
            }
        }

    }
}
