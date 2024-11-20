import javax.swing.JOptionPane;

public class Calculator{
    public static void main(String[] args){
        String option = JOptionPane.showInputDialog(
            "What do you want to do? \n" +
            "1. Addition\n"+
            "2. Subtraction\n"+
            "3. Multiplication\n"+
            "4. Division\n"+
            "5. Square Root\n"+
            "6. Power\n"+
            "7. Sine\n"+
            "8. Cosine\n"+
            "9. Tangent\n"+
            "10. Logarithm (natural)\n"+
            "11. Logarithm (base 10)\n"+
            "12. Exponential\n"+
            "13. Factorial\n"+
            "14. Inverse\n"+
            "15. Modulus\n"+
            "16. Radians to Degrees\n"+
            "17. Degrees to Radians"
        );
        double x = 0, y = 0, result = 0;
        AbstractOperations operation;

        if(Integer.parseInt(option) > 4){
            operation = new SciOperations(); 
        }else{
            operation = new Operations(); 
        }

        if(option.equals("5")){
            x = Double.parseDouble(JOptionPane.showInputDialog("Enter the number:"));
        }else{
            x = Double.parseDouble(JOptionPane.showInputDialog("First number: "));
            if(!option.equals("5")){
                y = Double.parseDouble(JOptionPane.showInputDialog("Second number: "));
            }
        }

        switch (option) {
            case "1":
                result = operation.addition(x, y);
                break;
            case "2":
                result = operation.subtraction(x, y);
                break;
            case "3":
                result = operation.multiplication(x, y);
                break;
            case "4":
                result = operation.division(x, y);
                break;
            case "5":
                result = ((SciOperations)operation).squareRoot(x);
                break;
            case "6":
                result = ((SciOperations)operation).power(x, y);
                break;
            case "7":
                result = ((SciOperations)operation).sine(x);
                break;
            case "8":
                result = ((SciOperations)operation).cosine(x);
                break;
            case "9":
                result = ((SciOperations)operation).tangent(x);
                break;
            case "10":
                result = ((SciOperations)operation).logarithm(x);
                break;
            case "11":
                result = ((SciOperations)operation).logBase10(x);
                break;
            case "12":
                result = ((SciOperations)operation).exponential(x);
                break;
            case "13":
                result = ((SciOperations)operation).factorial(x);
                break;
            case "14":
                result = ((SciOperations)operation).inverse(x);
                break;
            case "15":
                result = ((SciOperations)operation).mod(x, y);
                break;
            case "16":
                result = ((SciOperations)operation).radiansToDegrees(x);
                break;
            case "17":
                result = ((SciOperations)operation).degreesToRadians(x);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option selected.");
                return;
        }

        JOptionPane.showMessageDialog(null, "The result is: " + result);
    }
}
