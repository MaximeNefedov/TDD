package TDD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму кредита");
        int sum = scanner.nextInt();
        System.out.println("Введите процентную ставку");
        int interestRate = scanner.nextInt();
        System.out.println("Введите срок кредита (мес)");
        int creditTerm = scanner.nextInt();

        CreditCalculator creditCalculator = new CreditCalculator(sum, interestRate, creditTerm);
        double monthlyPayment = creditCalculator.calcMonthlyPayment();
        double overpayment = creditCalculator.calcOverpayment();
        double amountToBeReturned = creditCalculator.totalAmountToBeReturned();
        System.out.printf("Ежемесячный палтеж: %.2f\n" +
                "Переплата: %.2f\n" +
                "Общая сумма к возврату: %.2f", monthlyPayment, overpayment, amountToBeReturned);
    }
}