public class Person {
    private String name;
    private Bank bank;

public Person (Bank bank){
    this.bank = bank;
}
public void bankBalance(){
    System.out.println("I have: " + bank.getBalance());
}
public void withdraw(int amount){
bank.withdraw(amount);
}
public void deposit(int amount){
    bank.deposit(amount);
}

}

