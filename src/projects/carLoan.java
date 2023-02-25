package projects;

public class carLoan {
    public static void main(String[] args) {
        int carLoan = 10000;
        int loanLength = 3;
        double interestRate = 0.05;
        int downPayment = 2000;

        if(loanLength <= 0){
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full");
        }else{
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance/months;
            double interest = monthlyBalance*interestRate;
            double monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }

    }
}
