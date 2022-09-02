package primary.java.eleven.three;

public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount acct = new CheckAccount(1122,20000,0.045,5000);

        acct.withdraw(5000);
        System.out.println("当前账户余额为：" + acct.getBalance());
        System.out.println("当前可透支金额为：" + acct.getOverdraft());
        acct.withdraw(18000);
        System.out.println("当前账户余额为：" + acct.getBalance());
        System.out.println("当前可透支金额为：" + acct.getOverdraft());
        acct.withdraw(3000);
        System.out.println("当前账户余额为：" + acct.getBalance());
        System.out.println("当前可透支金额为：" + acct.getOverdraft());
    }
}
