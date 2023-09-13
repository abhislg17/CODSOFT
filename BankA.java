import java.util.Scanner;
class BankA{
    private double balance;
    public BankA(double initialbalance){
        this.balance=initialbalance;
    }
    public double getbalance(){
        return balance;
    }
    public void deposit(double amount){
        balance+=amount;
    } 
    public boolean withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
            return true;
        }
        return false;
    }
}
class ATM{
    private BankA account;
    private Scanner sc;
    public ATM(BankA account){
        this.account=account;
        this.sc=new Scanner(System.in);
    }
    public void displayMenu(){
        System.out.println("Welcome to ATM!");
        System.out.println("1.Check Balance");
        System.out.println("2. Deposit ");
        System.out.println("3. Withdraw");
        System.out.println("4.Exit");
    }
    public void run(){
        boolean exit=false;
        while(!exit){
            displayMenu();
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    checkbalance();
                    break;
                case 2:
                    deposit();
                    break;
                
                case 3:
                    withdraw();
                    break;
                case 4:
                    exit=true;
                    break;
                default:
                    System.out.print("Invalid Choice.Please tryagain");
            }
        }
    }
    public void checkbalance(){
        double balance=account.getbalance();
        System.out.println("Your balance is:"+ balance);
    }
    public void deposit(){
        System.out.println("Enter the deposit amount:");
        double amount=sc.nextDouble();
        account.deposit(amount);
        System.out.println("Deposited Rupees"+amount+"successfully");
    }
    public void withdraw(){
        System.out.println("Enter the withdrawal amount");
        double amount=sc.nextDouble();
        boolean success=account.withdraw(amount);
        if(success){
            System.out.println("Withdrawn Rupees"+ amount +"successfully");
        }
        else{
            System.out.println("Insufficient funds.Withdrawn failed");
        }
    }
}   
public class ATM{
    public static void main(String[] args){
        BankA useraccount=new BankA(11234.56);
        ATM atm=new ATM(useraccount);
        atm.run();
    }
}