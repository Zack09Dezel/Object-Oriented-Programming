public class Operations extends AbstractOperations{
    @Override
    public double addition(double x, double y){
        return x + y;
    }

    @Override
    public double subtraction(double x, double y){
        return x - y;
    }

    @Override
    public double multiplication(double x, double y){
        return x * y;
    }

    @Override
    public double division(double x, double y){
        if(y == 0){
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return x / y;
    }
}
