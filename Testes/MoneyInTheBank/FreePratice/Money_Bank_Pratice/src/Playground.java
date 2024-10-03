public class Playground {

    public static void main(String[] args) {

        Bank bank = new Bank();
        Person person1 = new Person(bank);

person1.bankBalance();
person1.deposit(1000);
person1.withdraw(9);
person1.bankBalance();


    }
}
