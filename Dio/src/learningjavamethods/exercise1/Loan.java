package learningjavamethods.exercise1;

public class Loan {

    private static final float tax = 0.5f;

    private static final float taxByMonthInstallments = 1.3f;

    public static void calculateLoad(final float value, final int installments) {
        final float result = value * tax * installments * taxByMonthInstallments;
        final float installmentsAmount = result / installments;

        System.out.println("Your loan was successfully accepted! For more details about it: ");
        System.out.println("Amount contracted: $" + value);
        System.out.println(String.format("Total amount to be paid: $%s / $%s in %s months.", result, installmentsAmount, installments));
        System.out.println(String.format("**Obs: applied %sx tax for the value contracted and %sx for each month installments", tax, taxByMonthInstallments));
    }
}
