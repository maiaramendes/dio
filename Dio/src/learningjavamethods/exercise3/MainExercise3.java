package learningjavamethods.exercise3;

public class MainExercise3 {

    private static final String text = "The total is: ";

    public static void main(String[] args) {
        System.out.println("--------- SQUARE --------- ");
        System.out.println((text) + Area.calculateArea(10d));

        System.out.println("\n--------- TRIANGLE --------- ");
        System.out.println((text) + Area.calculateArea(10d, 2d));

        System.out.println("\n--------- QUADRANGLE --------- ");
        System.out.println((text) + Area.calculateArea(2d, 4d, 10d));

        System.out.println("\n--------- DIAMOND --------- ");
        System.out.println((text) + Area.calculateArea(10f, 10f));
    }

}
