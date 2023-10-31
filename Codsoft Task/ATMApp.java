import java.io.*;
import java.util.Scanner;
class BankAccount 
{
private double balance;
public BankAccount(double initialBalance) 
{
balance = initialBalance;
}
public double getBalance()
{
return balance;
}
public void deposit(double amount)
 {
if (amount > 0) 
{
balance += amount;
} 
else 
{
System.out.println("Invalid deposit amount.");
}
}
public boolean withdraw(double amount) 
{
if (amount > 0 && amount <= balance) 
{
balance -= amount;
return true;
} 
else 
{
System.out.println("Invalid withdrawal amount or insufficient balance.");
return false;
}
}
}
class ATM 
{
private BankAccount bankAccount;
public ATM(BankAccount account) 
{
bankAccount = account;
}
public void displayMenu() 
{
System.out.println("ATM Options:");
System.out.println("1. Check Balance");
System.out.println("2. Deposit");
System.out.println("3. Withdraw");
System.out.println("4. Exit");
}
public void run() 
{
Scanner scanner = new Scanner(System.in);
while (true) 
{
displayMenu();
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
switch (choice)
{
case 1:
double balance = bankAccount.getBalance();
System.out.println("Your balance is: " + balance);
break;
case 2:
System.out.print("Enter the deposit amount: ");
double depositAmount = scanner.nextDouble();
bankAccount.deposit(depositAmount);
break;
case 3:
System.out.print("Enter the withdrawal amount: ");
double withdrawalAmount = scanner.nextDouble();
if (bankAccount.withdraw(withdrawalAmount)) 
{
System.out.println("Withdrawal successful.");
}
break;
case 4:
System.out.println("Exiting ATM. Thank you!");
scanner.close();
return;
default:
System.out.println("Invalid choice. Please try again.");
}}
}
}
public class ATMApp
{
public static void main(String[] args) 
{
BankAccount account = new BankAccount(1000.0);
ATM atm = new ATM(account);
atm.run();
}
}
