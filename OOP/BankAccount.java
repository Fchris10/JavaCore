package OOP;

public class BankAccount {
    double balance;
    public BankAccount(){
        return;
    }
    public BankAccount(double balance){
        this.balance = balance;
        return;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        this.balance += amount;
        return;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
}