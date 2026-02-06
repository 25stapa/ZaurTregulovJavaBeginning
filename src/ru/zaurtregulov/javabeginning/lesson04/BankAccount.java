package ru.zaurtregulov.javabeginning.lesson04;

public class BankAccount {

    int id;
    String name;
    double balance;

    double accountReplenishment(double value) {
        return balance += value;
    }

    double withdrawalFromAccount(double value) {
        return balance -= value;
    }

}


class BankAccountTest {
    static void main() {
        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Zaur";
        myAccount.balance = 12.35;

        yourAccount.id = 2;
        yourAccount.name = "Mike";
        yourAccount.balance = 121.5;


        hisAccount.id = 3;
        hisAccount.name = "Ivan";
        hisAccount.balance = 2.89;

        System.out.println("My id: " + myAccount.id);
        System.out.println("Your name: " + yourAccount.name);
        System.out.println("His balance: " + hisAccount.balance);

        System.out.println("My account balance - " + myAccount.balance);
        System.out.println(myAccount.accountReplenishment(100));
        System.out.println("My account balance - " + myAccount.balance);

        System.out.println(myAccount.withdrawalFromAccount(100));

    }
}