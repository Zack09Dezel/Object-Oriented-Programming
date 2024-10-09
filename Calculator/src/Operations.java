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

    public double Logten(double x){
        return x = Math.log10(x);
        // work in progress
    }

    public double LogArbitrary(double x, double y){
        return x = Math.log(x) / Math.log(y);
        // number / base ; log2(8) 2 base 8 number
        // wokr in progress
    }

    public double LogPremium(double x, double y){
        double result = 0.0;
        double current = 1.0; // Nilai awal dari base^result
        //  y = base
         
        // Incremental untuk menghitung logaritma dengan akurasi terbatas
        while (current < x) {
            current *= y;
            result += 1.0;
        }
         
        // Menambahkan bagian desimal dengan presisi terbatas
        double fraction = 0.1;
        while (current > x) {
            current /= y;
            result -= 1.0;
        }
        while (fraction >= 1e-10) {
            while (current * y <= x) {
                current *= y;
                result += fraction;
            }
            fraction /= 10.0;
        }
         
        return result;
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
