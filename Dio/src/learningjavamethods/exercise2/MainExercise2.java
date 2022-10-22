package learningjavamethods.exercise2;

import learningjavamethods.exercise1.Loan;
import learningjavamethods.exercise1.MathOperations;
import learningjavamethods.exercise1.Message;

public class MainExercise2 {

    public static void main(String[] args) {
        System.out.println("--------- SQUARE --------- ");
        Area.calculateArea(10d);

        System.out.println("\n\n--------- TRIANGLE --------- ");
        Area.calculateArea(10d, 2d);

        System.out.println("\n\n--------- QUADRANGLE --------- ");
        Area.calculateArea(2d, 4d, 10d);

        System.out.println("\n\n--------- DIAMONG --------- ");
        Area.calculateArea(10f, 10f);
    }

}
