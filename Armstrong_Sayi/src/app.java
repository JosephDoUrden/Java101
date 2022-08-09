import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();

        int basNumber = 0, tempNumber = number;
        int basValue, result = 0, basPow, total = 0;

        while (tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;

        while (tempNumber != 0){
            basValue = tempNumber % 10;
            basPow = 1;
            total += basValue;
            for (int i = 1; i <= basNumber; i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        System.out.println(number + " sayısının basamaklarının toplamı: " + total);

        if (result == number){
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        }else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }
    }
}
