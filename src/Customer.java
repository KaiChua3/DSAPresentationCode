
import java.util.Scanner;
// Customer class
public class Customer {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your account name:");
        String name = input.nextLine();
        System.out.print("Enter your account balance:");
        int tempBalance = input.nextInt();
        BankSystem newAccount = new BankSystem(1000, "Bob");
        newAccount.changeBalance(tempBalance);
        newAccount.changeName(name);
        newAccount.addToSystem();
        newAccount.displayArrays();
    }
}
