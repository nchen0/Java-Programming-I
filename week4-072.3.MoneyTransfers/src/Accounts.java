
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account a = new Account("a", 100);
        Account b = new Account("b", 0);
        Account c = new Account("c", 0);
        transfer(a, b, 50);
        transfer(b, c, 25);
    }


    public static void transfer(Account first, Account second, double howMuch) {
        first.withdrawal(howMuch);
        second.deposit(howMuch);
    }


}
