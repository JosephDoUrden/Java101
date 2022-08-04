import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, select;

        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("Toplama(1)\nÇıkarma(2)\nÇarpma(3)\nBölme(4)");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Sonuç: " + (n1+n2));
                break;
            case 2:
                System.out.println("Sonuç: " + (n1-n2));
                break;
            case 3:
                System.out.println("Sonuç: " + (n1*n2));
                break;
            case 4:
                if (n2 != 0){
                    System.out.println("Sonuç: " + (n1/n2));
                }
                else {
                    System.out.println("Bir sayı sıfıra bölünemez!");
                }
                break;
            default:
                System.out.println("Geçerli seçim yapınız!");
                break;
        }

    }
}
