import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Sayı Giriniz: ");
        n = input.nextInt();

        System.out.print(n + " sayısından küçük 2'nin kuvvetleri: ");
        for (int i = 1; i <= n; i*=2){
            System.out.print(i + "  ");
        }

        System.out.print("\n" + n + " sayısından küçük 4'ün kuvvetleri: ");
        for (int i = 1; i <= n; i*=4){
            System.out.print(i + "  ");
        }

        System.out.print("\n" + n + " sayısından küçük 5'in kuvvetleri: ");
        for (int i = 1; i <= n; i*=5){
            System.out.print(i + "  ");
        }




    }
}
