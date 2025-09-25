@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaMath {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;

        System.out.println("Addition: " + add.operate(10, 5));      // 15
        System.out.println("Subtraction: " + sub.operate(10, 5));  // 5
    }
}
