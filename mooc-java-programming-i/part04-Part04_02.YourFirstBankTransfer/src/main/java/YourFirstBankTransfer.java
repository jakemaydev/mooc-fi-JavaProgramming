
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account acc = new Account("Matthews account", 1000.0);
        Account myAcc = new Account("My account", 0);

        acc.withdrawal(100.0);
        myAcc.deposit(100.0);

        System.out.println(acc);
        System.out.println(myAcc);
    }
}
