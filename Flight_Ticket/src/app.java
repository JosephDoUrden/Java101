import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distance, age, flightType;
        double actualPrice, perKm = 0.10, discount, discountedPrice, ageDiscount, total, twoWayDiscount;

        System.out.print("Uçuş mesafesini km cinsinden giriniz: ");
        distance = input.nextInt();

        System.out.print("Yaşınız: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipi seçiniz(1 => Tek Yön, 2 => Gidiş Dönüş): ");
        flightType = input.nextInt();

        if (distance < 0 || age < 0 || (flightType != 1 && flightType != 2)){
            System.out.println("Hatalı veri girişi !");
        }else {
            actualPrice = distance * perKm;

            if(age < 12){
                discount = 0.50;
            } else if (age < 24) {
                discount = 0.10;
            } else if (age > 65) {
                discount = 0.30;
            }else {
                discount = 0;
            }

            ageDiscount = actualPrice * discount;
            discountedPrice = actualPrice - ageDiscount;

            if (flightType == 2){
                twoWayDiscount = discountedPrice * 0.20;
                //total = (discountedPrice-twoWayDiscount)*2;
                System.out.println("Toplam Tutar: " + (discountedPrice-twoWayDiscount)*2);
            }else {
                System.out.println("Toplam Tutar: " + discountedPrice);
            }
        }







    }
}
