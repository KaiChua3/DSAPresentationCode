
import java.util.ArrayList;
// Bank System class that extends the Bank Class

interface BankMethods {
    /**
     * addToSystem allows you to construct Bank Accounts for the Bank class
     */
    public void addToSystem();
    /**
     * changeBalance allows you to change the internal bank account balance to a specified value
     * @param balance variable indicates the new balance you want your bank account to be
     */
    public void changeBalance(int balance);
    /**
     * changeName allows you to change the name of your bank account to a specified string
     * @param name variable indicates the new name you want your bank account to have
     */
    public void changeName(String name);
    /**
     * displayArrays allows you to display the current amount of bank accounts and their balances
     */
    public void displayArrays();
}

public class BankSystem extends Bank implements BankMethods {
    // int Array accountBalances
    private int[] accountBalances;
    // String ArrayList accountNames
    private ArrayList<String> accountNames;
    // Temporary int count variable
    private int count = 0;
    // BankSystem constructor using the super keyword to call the Bank class constructor
    public BankSystem(int balance, String name) {
        super(balance,name);
        accountBalances = new int[200];
        accountNames = new ArrayList<String>();
    }
    
    public void addToSystem() {
        accountBalances[count] = balance;
        count++;
        accountNames.add(name);
    }
    public void changeBalance (int balance) {
        this.balance = balance;
    }
    public void changeName (String name) {
        this.name = name;
    }
    public void displayArrays() {
        System.out.println("Account name: " + accountNames);
        System.out.print("Account Balances: ");
        System.out.println(accountBalances[0]);
    }
}
