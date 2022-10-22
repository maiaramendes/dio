package learningjavamethods.exercise1;

public class MathOperations {

    private static final String resultText = "The result is %s";

    public static void sum(Integer firstNumber, Integer secondNumber) {
        final Integer result = firstNumber + secondNumber;
        System.out.println(String.format(resultText, result));
    }

    public static void minus(Integer firstNumber, Integer secondNumber) {
        final Integer result = firstNumber - secondNumber;
        System.out.println(String.format(resultText, result));
    }

    public static void multiply(Integer firstNumber, Integer secondNumber) {
        final Integer result = firstNumber * secondNumber;
        System.out.println(String.format(resultText, result));
    }

    public static void dividedBy(Integer firstNumber, Integer secondNumber) {
        final Integer result = firstNumber / secondNumber;
        System.out.println(String.format(resultText, result));
    }

}
