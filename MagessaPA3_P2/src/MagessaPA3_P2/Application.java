package MagessaPA3_P2;

public class Application {
    public static void main(String[] args) {
        SavingsAccount saver1, saver2;
        saver1 = new SavingsAccount(2000.0);
        saver2 = new SavingsAccount(3000.0);

        SavingsAccount.modifyInterestRate(.04);

        System.out.println("Saver 1 Balance for 4% \n");
        for (int i = 0; i <= 12; i++) {
            saver1.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1) + " : " + String.format("%.2f", saver1.totalSavings()));
        }
        System.out.println("Saver 2 Balance for 4%\n");
        for (int i = 0; i <= 12; i++) {
            saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1) + " : " + String.format("%.2f", saver2.totalSavings()));
        }
        SavingsAccount.modifyInterestRate(.05);
        System.out.println("Saver 1 Balance for 5% \n");
        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1) + " : " + String.format("%.2f", saver1.totalSavings()));
        }
        System.out.println("Saver 2 Balance for 5%\n");
        for (int i = 0; i < 12; i++) {
            saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1) + " : " + String.format("%.2f", saver2.totalSavings()));
        }
    }
}