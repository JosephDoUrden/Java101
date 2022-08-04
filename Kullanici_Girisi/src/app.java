import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password, temp;

        System.out.print("Kullanıcı Adı: ");
        userName = input.nextLine();

        System.out.print("Parola: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız :)");
        }
        else {
            System.out.println("Giriş bilgileriniz yanlış !");
            if (userName.equals("patika")){
                char select;

                System.out.println("Parolanızı sıfırlamak ister misiniz? Y/N");
                select = input.next().charAt(0);

                switch (select){
                    case 'Y':
                        Scanner inp = new Scanner(System.in);
                        System.out.print("Yeni parola: ");
                        temp = inp.nextLine();
                        if(temp.equals("java123")){
                            System.out.println("Eski parola ile aynı! Parola oluşturulamadı.");
                        }
                        else{
                            password = temp;
                            System.out.println("Yeni parola oluşturuldu!");
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
