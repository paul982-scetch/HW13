public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(90,120);
arithmeticCalculator.calculate(Operation.ADD);
arithmeticCalculator.calculate(Operation.SUBTRACT);
arithmeticCalculator.calculate(Operation.MULTIPLY);

    }
}