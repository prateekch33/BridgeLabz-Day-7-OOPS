import java.util.Scanner;

class Account {
    private int balance;

    public void setBalance(int balance) {
        this.balance=balance;
    }

    public void debit(int amount) {
        if(balance-amount<0) {
            System.out.println("Insufficient Balance!!");
            return;
        }
        balance-=amount;
        System.out.println("Amount Debited!!");
        System.out.println("Remaining Balance: "+this.balance);
    }

}

public class AccountTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Account ob=new Account();
        int choice;
        do {
            System.out.println("Welcome to Account management System");
            System.out.println("1. Add Balance");
            System.out.println("2. Debit Amount");
            System.out.println("3. Exit Program.");
            choice=in.nextInt();
            switch(choice) {
                case 1: {
                    System.out.print("Enter the amount you want to set the balance of the account: ");
                    int amount=in.nextInt();
                    ob.setBalance(amount);
                    System.out.println("Balance Added!!");
                    break;
                }
                case 2: {
                    System.out.print("Enter the amount you want to debit from the account: ");
                    int amount=in.nextInt();
                    ob.debit(amount);
                    break;
                }
                case 3:
                    break;
                default: {
                    System.out.println("Invalid Choice!!");
                    break;
                }
            }
        }while(choice!=3);
        System.out.println("Thank You!!");
        in.close();
    }
}
