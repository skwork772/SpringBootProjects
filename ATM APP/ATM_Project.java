import java.util.*;

public class ATM_Project {
    public static void main(String args[]) {
        int pin = 1234;
        int balance = 10000;

        int AddAmount = 0;
        int TakeAmount = 0;

        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your PIN Number: ");
        int password = scanner.nextInt();

        if(password == pin){
            System.out.print("Enter Your Name : ");
            name = scanner.next();
            System.out.println("Welcome" + name);

            while(true){
                System.out.println("Press 1 to check balance: ");
                System.out.println("Press 2 to  Deposit: ");
                System.out.println("Press 3 to Withdraw: ");
                System.out.println("Press 4 to take Recept: ");
                System.out.println("Press 5 to Exit: ");
                System.out.print("Enter Your Option: ");
                int opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Your current Balance is: "+ balance);
                        break;
                    case 2:
                        System.out.print("ADD Amount: ");
                        AddAmount = scanner.nextInt();
                        System.out.println("Successfully credited");
                        balance =AddAmount + balance;
                        break;
                    case 3:
                        System.out.print("Withdraw Amount: ");
                        TakeAmount = scanner.nextInt();
                        if(TakeAmount > balance){
                            System.out.println("Insufficient Balance");
                        }else{
                            balance = balance - TakeAmount;
                            System.out.println("Transaction Successfull");
                        }
                    case 4:
                        System.out.println("Welcome to MINI ATM");
                        System.out.println("Available Balance: " + balance);
                        System.out.println("Amount Deposited: "+ AddAmount);
                        System.out.println("Amount Withdrawed: "+TakeAmount);
                        System.out.println("Thank You");
                        break;
                    default:
                        System.out.println("Invalid Option");
                        break;
                }
                if(opt == 5){
                    System.out.println("Thank you Come Again");
                }
            }
        }else{
            System.out.print("Wrong PIN Number");
        }
    }
}