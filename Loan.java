import java.util.Date;
import java.lang.Math;

public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        Date date = new Date();
        return date;
    }

    public void setAnnualInterestRate(double annualInterest) {
        this.annualInterestRate = annualInterest;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = (getAnnualInterestRate() / 100) / 12;
        return (getLoanAmount() * monthlyInterestRate)
                / (1 - (1 / (Math.pow(1 + monthlyInterestRate, (getNumberOfYears() * 12)))));
    }

    public double getTotalPayment() {
        return (getMonthlyPayment() * getNumberOfYears() * 12);
    }

}