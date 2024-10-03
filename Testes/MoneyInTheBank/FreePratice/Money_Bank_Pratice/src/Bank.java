public class Bank {
    private int balance = 1000;

    //GETTER BALANCE
    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
if (amount > 0){
    balance = balance + amount;
    System.out.println("Done, You Have deposit: " + amount);
    return;
}
    System.out.println("Can't deposit!");
}

    public void withdraw(int amount){
        if (amount > balance){
            System.out.printf("Can't withdraw, not enough balance");
        }
        if (amount < 0){
            System.out.println("Can't withdraw negative number");
        }
        if (amount <= balance){
            balance = balance - amount;
            System.out.println("Withdraw successful, you withdrew: " + amount);
        }
    }
}
