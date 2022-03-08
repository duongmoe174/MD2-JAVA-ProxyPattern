public class MathCalculatorProxy implements Calculator{
    private MathCalculator mathCalculator;
    public MathCalculatorProxy(){
        this.mathCalculator = new MathCalculator();
    }

    @Override
    public double add(double firstNumber, double secondNumber) {
        if (firstNumber/2 + secondNumber/2 >= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        if (firstNumber/2 + secondNumber/2 <= Double.MIN_VALUE / 2) {
            throw  new RuntimeException("Out of range");
        }
        return mathCalculator.add(firstNumber, secondNumber);
    }

    @Override
    public double sub(double firstNumber, double secondNumber) {
        return 0;
    }

    @Override
    public double mul(double firstNumber, double secondNumber) {
        return 0;
    }

    @Override
    public double div(double firstNumber, double secondNumber) {
        return 0;
    }
}
