public class SciOperations extends Operations{

    public double squareRoot(double x){
        if(x < 0){
            throw new ArithmeticException("Square root of a negative number is not allowed.");
        }
        return Math.sqrt(x);
    }

    public double power(double x, double y){
        return Math.pow(x, y);
    }

    public double sine(double x){
        return Math.sin(Math.toRadians(x));
    }

    public double cosine(double x){
        return Math.cos(Math.toRadians(x));
    }

    public double tangent(double x){
        return Math.tan(Math.toRadians(x));
    }

    public double logarithm(double x){
        if(x <= 0){
            throw new ArithmeticException("Logarithm of zero or negative numbers is not allowed.");
        }
        return Math.log(x);
    }

    public double logBase10(double x){
        if(x <= 0){
            throw new ArithmeticException("Logarithm base 10 of zero or negative numbers is not allowed.");
        }
        return Math.log10(x);
    }

    public double exponential(double x){
        return Math.exp(x);
    }

    public double factorial(double x){
        if(x < 0 || x != Math.floor(x)){
            throw new ArithmeticException("Factorial is defined only for non-negative integers.");
        }
        double result = 1;
        for(int i = 1; i <= x; i++){
            result *= i;
        }
        return result;
    }

    public double inverse(double x){
        if(x == 0){
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return 1 / x;
    }

    public double mod(double x, double y){
        return x % y;
    }

    public double radiansToDegrees(double x){
        return Math.toDegrees(x);
    }

    public double degreesToRadians(double x){
        return Math.toRadians(x);
    }
}
