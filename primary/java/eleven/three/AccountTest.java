package primary.java.eleven.three;

public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(1122,20000,0.045);

        acct.withdraw(30000);
        System.out.println("您的账户余额为" + acct.getBalance());
        acct.withdraw(2500);
        System.out.println("您的账户余额为" + acct.getBalance());
        acct.withdraw(3000);
        System.out.println("您的账户余额为" + acct.getBalance());
        System.out.println("您的账户月利率为" + (acct.getAnnualInterestRate() * 100) + "%");
    }
}
