import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

// я добавил считование с клавиши, вы сами выбираете какого участника удалить и тем самым проверить все:
    public static void main(String[] args) {

        Account user1 = new Account(0,"Beksultan", "Kuralbay", "student",22000);
        Account user2 = new Account(1,"Azamat", "Rzageldyev", "student",29000);
        Account user3 = new Account(2,"Sanjar", "Abutalip", "student",28000);
        Account user4 = new Account(3,"Amina", "Kenes", "student",23000);
        Account user5 = new Account(4,"Sania", "Kalieva", "student",31000);
        BankApplication funk = new BankApplication();
        funk.addAccount(user1);
        funk.addAccount(user2);
        funk.addAccount(user3);
        funk.addAccount(user4);
        funk.addAccount(user5);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        funk.removeAccount(a);
        System.out.println(funk.getmaxAccount().toString());
        System.out.println(funk.getAvarage());
        System.out.println(funk.getSum());
        System.out.println(funk.getUser());
        System.out.println(funk.toString());
    }

}