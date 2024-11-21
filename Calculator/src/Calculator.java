import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    public static void main(String[] args) {
        String option = JOptionPane.showInputDialog(
            "What do you want to do? \n" +
            "1. Addition\n" +
            "2. Subtraction\n" +
            "3. Multiplication\n" +
            "4. Division\n" +
            "5. Square Root\n" +
            "6. Power\n" +
            "7. Sine\n" +
            "8. Cosine\n" +
            "9. Tangent\n" +
            "10. Logarithm\n" +
            "11. Logarithm(10)\n" +
            "12. Exponential\n" +
            "13. Factorial\n" +
            "14. Inverse\n" +
            "15. Modulus\n" +
            "16. Radians to Degrees\n" +
            "17. Degrees to Radians"
        );

        double x = 0, y = 0, result = 0;
        AbstractOperations operation;

        if (Integer.parseInt(option) > 4) {
            operation = new SciOperations();
        } else {
            operation = new Operations();
        }

        List<String> singleInputOptions = Arrays.asList("5", "7", "8", "9", "10", "11", "12", "13", "14", "16", "17");

        x = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number:"));
        if (!singleInputOptions.contains(option)) {
            y = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number:"));
        }
        
        switch (option) {
            case "1":
            case "Addition":
            case "1. Addition":
                result = operation.addition(x, y);
                break;
            case "2":
            case "Substraction":
            case "2. Substraction":
                result = operation.subtraction(x, y);
                break;
            case "3":
            case "Multiplication":
            case "3. Multiplication":
                result = operation.multiplication(x, y);
                break;
            case "4":
            case "Division":
            case "4. Division":
                result = operation.division(x, y);
                break;
            case "5":
            case "Square Root":
            case "5. Square Root":
                result = ((SciOperations) operation).squareRoot(x);
                break;
            case "6":
            case "Power":
            case "6. Power":
                result = ((SciOperations) operation).power(x, y);
                break;
            case "7":
            case "Sine":
            case "7. Sine":
                result = ((SciOperations) operation).sine(x);
                break;
            case "8":
            case "Cosine":
            case "8. Cosine":
                result = ((SciOperations) operation).cosine(x);
                break;
            case "9":
            case "Tangent":
            case "9. Tangent":
                result = ((SciOperations) operation).tangent(x);
                break;
            case "10":
            case "Logarithm":
            case "10. Logarithm":
                result = ((SciOperations) operation).logarithm(x);
                break;
            case "11":
            case "Log(10)":
            case "11. Logarithm(10)":
                result = ((SciOperations) operation).logBase10(x);
                break;
            case "12":
            case "Exponential":
            case "12. Exponential":
                result = ((SciOperations) operation).exponential(x);
                break;
            case "13":
            case "Factorial":
            case "13. Factorial":
                result = ((SciOperations) operation).factorial(x);
                break;
            case "14":
            case "Inverse":
            case "14. Inverse":
                result = ((SciOperations) operation).inverse(x);
                break;
            case "15":
            case "Mod":
            case "15. Inverse":
                result = ((SciOperations) operation).mod(x, y);
                break;
            case "16":
            case "Radians to Degrees":
            case "16. Radians to Degrees":
                result = ((SciOperations) operation).radiansToDegrees(x);
                break;
            case "17":
            case "Degrees to Radians":
            case "17. Degrees to Radians":
                result = ((SciOperations) operation).degreesToRadians(x);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option selected.");
                return;
        }

        JOptionPane.showMessageDialog(null, "The result is: " + result);
    }
}
