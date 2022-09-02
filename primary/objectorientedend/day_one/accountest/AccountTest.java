package primary.objectorientedend.day_one.accountest;

public class AccountTest {
    public static void main(String[] args) {
        Account acct1 = new Account();
        Account acct2 = new Account("123456",2000);

        Account.setInterestRate(0.014);
        Account.setMinMoney(500);

        System.out.println(acct1);
        System.out.println(acct2);

        System.out.println(acct1.getInterestRate());
        System.out.println(acct1.getMinMoney());


    }
}
