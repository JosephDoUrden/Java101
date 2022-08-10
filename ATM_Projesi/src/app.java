import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;


        while (right > 0) {
            System.out.print("Kullanıcı Adı: ");
            userName = input.nextLine();
            System.out.print("Parola: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoş Geldiniz!");
                do {
                    System.out.println(
                                    "1- Para Yatırma\n" +
                                    "2- Para Çekme\n" +
                                    "3- Bakiye Sorgulama\n" +
                                    "4- Çıkış Yap\n"
                    );
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Para miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            int priceWithdraw = input.nextInt();
                            if(priceWithdraw > balance){
                                System.out.println("Bakiye yetersiz.");
                            }else {
                                balance -= priceWithdraw;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                }while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya parola. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen Banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan hakkınız: " + right);
                }

            }
        }

    }
}
