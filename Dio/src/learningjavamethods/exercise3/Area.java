package learningjavamethods.exercise3;

public class Area {

    public static double calculateArea(double side) {
        return side * 2;
    }

    public static double calculateArea(double side1, double side2) {
        return side1 * side2;
    }

    public static double calculateArea(double base, double higherBase, double height) {
        return (base * higherBase) / height;
    }

    public static double calculateArea(float side1, float side2) {
        return (side1 * side2) / 2;
    }
}
