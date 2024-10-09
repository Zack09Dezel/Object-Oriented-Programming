public class Operations {

    public double Addition(double x, double y){
        return x += y;
    }

    public double Subtraction(double x, double y){
        return x -= y;
    }

    public double Multiplication(double x, double y){
    return x *= y;
    }

    public double Divition(double x, double y){
        return x /= y;
    }

    public double Modulo(double x, double y){
        return x %= y;
    }
    
    //TODO: Add more functions like Modulo, Power(N), Square Root, Log, Ln, Absolute, Trigonometry, etc.

    //! Need to implement Method overload in main class.
    // public double Addition(double... x) {
    //     double result = 0;
    //     for (double y : x) {
    //         result += y;
    //     }
    //     return result;
    // }

    // public double Subtraction(double... n) {
    //     double result = n[0];
    //     for (int i = 1; i < n.length; i++) {
    //         result -= n[i];
    //     }
    //     return result;
    // }

    // public double Multiplication(double... n) {
    //     double result = 1;
    //     for (double y : n) {
    //         result *= y;
    //     }
    //     return result;
    // }

    // public double Division(double... n) {
    //     double result = n[0];
    //     for (int i = 1; i < n.length; i++) {
    //         result /= n[i];
    //     }
    //     return result;
    // }

    // public double Modulo(double... n) {
    //     double result = n[0];
    //     for (int i = 1; i < n.length; i++) {
    //         result %= n[i];
    //     }
    //     return result;
    // }


}
