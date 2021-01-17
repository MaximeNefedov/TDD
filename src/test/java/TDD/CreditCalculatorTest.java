package TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreditCalculatorTest {
    private static CreditCalculator calculator;
    //  Сумма кредита
    private double sum;
    // Процентная ставка
    private double interestRate;
    // Срок кредита (мес)
    private double creditTerm;

    @BeforeEach
    void createCalculator() {
        sum = 300_000.0;
        interestRate = 10.0;
        creditTerm = 12.0;
        calculator = new CreditCalculator(sum, interestRate, creditTerm);
    }

    @Test
    void calcMonthlyPaymentTest() {
        double expected = Math.abs(sum * (interestRate / 1200.0) /
                (1.0 - Math.pow(1.0 + (interestRate / 1200.0), creditTerm)));
        double calculated = calculator.calcMonthlyPayment();
        Assertions.assertEquals(expected, calculated);
    }

    @Test
    void calcOverpaymentTest() {
        double monthlyPayment = Math.abs(sum * (interestRate / 1200.0) /
                (1.0 - Math.pow(1.0 + (interestRate / 1200.0), creditTerm)));
        double expected = Math.abs((creditTerm * monthlyPayment) - sum);
        double calculated = calculator.calcOverpayment();
        Assertions.assertEquals(expected, calculated);
    }

    @Test
    void totalAmountToBeReturnedTest() {
        double monthlyPayment = Math.abs(sum * (interestRate / 1200.0) /
                (1.0 - Math.pow(1.0 + (interestRate / 1200.0), creditTerm)));
        double overpayment = Math.abs((creditTerm * monthlyPayment) - sum);

        double expected = sum + overpayment;
        double calculated = calculator.totalAmountToBeReturned();
        Assertions.assertEquals(expected, calculated);
    }
}