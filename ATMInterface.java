import javax.swing.*;
import java.util.Scanner;
public class ATMInterface
{
    public static void main(String args[] )
    {
        int balance = 1000000, withdraw, deposit, Transfer;
        long Account;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Automated Teller Machine(ATM)");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Transfer Money");
            System.out.println("Choose 5 for Exit");
            System.out.print("Choose the operation you want to perform:");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = sc.nextInt();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }

                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Enter your account Number");
                    long AccountNumber=sc.nextLong();
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;
                case 4:
                    System.out.print("Enter money to be Transfer:");
                    Transfer = sc.nextInt();
                    System.out.print("Enter  account number then Transfer a money:");
                    Account = sc.nextLong();
                    balance = balance - Transfer;
                    System.out.println("Your Money has been successfully Transfer");
                    System.out.println("");
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
