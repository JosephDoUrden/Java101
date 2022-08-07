import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k, modTotal=0, counter=0;

        System.out.print("Sayı giriniz: ");
        k = input.nextInt();

        System.out.print("Çift Sayılar: ");
        for (int i = 1; i<=k; i++){
            if(i % 2 == 0){
                System.out.print( i + ", ");
            }
            if(i % 3 == 0 && i % 4 == 0){
                modTotal += i;
                counter++;
            }
        }

        System.out.println("\n3 ve 4'e tam bölünen sayıların ortalaması: " + (modTotal/counter));
    }
}
