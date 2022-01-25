import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter annual interest rate, for example, 8.25: ");
        double ui_IR = sc.nextDouble();
        System.out.println("Enter number of years as an integer: ");
        int ui_YR = sc.nextInt();
        System.out.println("Enter loan amount, for example, 120000.95: ");
        double ui_LA = sc.nextDouble();

        Loan loan = new Loan(ui_IR, ui_YR, ui_LA);

        System.out.println("The loan was created on " + loan.getLoanDate());
        System.out.println("The monthtly payment is " + String.format("%.2f", loan.getMonthlyPayment()));
        System.out.println("The total payment is " + String.format("%.2f", loan.getTotalPayment()));

    }

}