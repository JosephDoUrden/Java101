import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year, mod4, mod100, mod400;

        System.out.print("Yıl giriniz: ");
        year = input.nextInt();

        mod4 = (year % 4);     // year mod 4 = ?
        mod100 = (year % 100); // year mod 100 = ?
        mod400 = (year % 400); // year mod 400 = ?

        if (year < 0)
        {
            System.out.println("Yıl değeri negatif olamaz!");
        }
        else
        {
            if ((mod4 != 0) || ((mod100 == 0) && (mod400 != 0)))
            {
                System.out.println(year + " artık yıl değildir!");
            }
            else  // all the rest possibilities are leap year
            {
                System.out.println(year + " bir artık yıldır!");
            }
        }
    }
}
