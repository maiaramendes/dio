package learningjavamethods.exercise1;

public class MainExercise1 {

    public static void main(String[] args) {
        System.out.println("--------- MATH OPERATIONS --------- ");
        MathOperations.sum(10, 2);
        MathOperations.minus(10, 8);
        MathOperations.multiply(1000, 1000);
        MathOperations.dividedBy(100, 10);

        System.out.println("\n\n--------- MESSAGE --------- ");
        Message.message();

        System.out.println("\n\n--------- LOAN 1 --------- ");
        Loan.calculateLoad(12000f, 24);

        System.out.println("\n\n--------- LOAN 2 ---------");
        Loan.calculateLoad(500000f, 4);
    }

}
