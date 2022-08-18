import java.util.Scanner;

public class app {

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int sayi = input.nextInt();

        if(isPalindrom(sayi) == true){
            System.out.println("Sayı palindrom sayıdır.");
        }else
            System.out.println("Palindrom sayı değildir.");



    }
}
