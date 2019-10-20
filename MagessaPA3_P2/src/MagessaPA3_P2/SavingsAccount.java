package MagessaPA3_P2;

public class SavingsAccount {

    static private double annualInterestRate;
    private double savingsBalance;
    public double calculateMonthlyInterest;
    public double monthlyInt;
    public SavingsAccount(double savingBalance)
    {
        this.savingsBalance =savingBalance;
    }
    public void calculateMonthlyInterest()
    {
        this.monthlyInt= (this.savingsBalance*(annualInterestRate/12));
    }
    public static void modifyInterestRate(double intRate)
    {
        annualInterestRate = intRate;
    }
    public double totalSavings()
    {
        double ans=0;
        ans = savingsBalance += this.monthlyInt;
        return ans;
    }
}

