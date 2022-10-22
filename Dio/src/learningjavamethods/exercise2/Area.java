package learningjavamethods.exercise2;

public class Area {

    private static final String text = "The total is %s";

    public static void calculateArea(double side) {
        final double total = side * 2;
        System.out.println(String.format(text, total));
    }

    public static void calculateArea(double side1, double side2) {
        final double total = side1 * side2;
        System.out.println(String.format(text, total));
    }

    public static void calculateArea(double base, double higherBase, double height) {
        final double total = (base * higherBase) / height;
        System.out.println(String.format(text, total));
    }

    public static void calculateArea(float side1, float side2) {
        final double total = (side1 * side2) / 2;
        System.out.println(String.format(text, total));
    }
}
