package TDD;

public class CreditCalculator {

    private double sum;
    private double interestRate;
    private double creditTerm;

    public CreditCalculator(double sum, double interestRate, double creditTerm) {
        this.sum = sum;
        this.interestRate = interestRate;
        this.creditTerm = creditTerm;
    }

    public double calcMonthlyPayment() {
        return 0.0;
    }

    public double calcOverpayment() {
        return 0.0;
    }

    public double totalAmountToBeReturned() {
        return 0.0;
    }
}
