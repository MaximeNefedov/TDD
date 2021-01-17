package TDD;

public class CreditCalculator {

    private double sum;
    private double interestRate;
    private double creditTerm;
    private double rate;

    public CreditCalculator(double sum, double interestRate, double creditTerm) {
        this.sum = sum;
        this.interestRate = interestRate;
        this.creditTerm = creditTerm;
        this.rate = interestRate / 1200.0;
    }

    public double calcMonthlyPayment() {
        return Math.abs(sum * rate /
                (1.0 - Math.pow(1.0 + (interestRate / 1200.0), creditTerm)));
    }

    public double calcOverpayment() {
        return Math.abs((creditTerm * calcMonthlyPayment()) - sum);
    }

    public double totalAmountToBeReturned() {
        return sum + calcOverpayment();
    }
}
