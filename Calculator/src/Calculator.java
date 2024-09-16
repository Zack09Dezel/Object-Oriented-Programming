import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {

        String option = JOptionPane.showInputDialog("What do you want to do? \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Divition");
        double x = Double.parseDouble(JOptionPane.showInputDialog("First number: ")), y = Double.parseDouble(JOptionPane.showInputDialog("Second Number: ")), result = 0;

        switch (option) {
            case "1":
            case "Addition":
                result = Addition(x, y);
                JOptionPane.showMessageDialog(null, "The result is: "+result);
                break;
            case "Subtraction:":
            case "2":
                result = Subtraction(x, y);
                JOptionPane.showMessageDialog(null, "The result is: "+result);
                break;
            case "3":
            case "Multiplication":
                result = Multiplication(x, y);
                JOptionPane.showMessageDialog(null, "The result is: "+result);
                break;
            case "4":
            case "Divition":
                result = Divition(x, y);
                JOptionPane.showMessageDialog(null, "The result is: "+result);
                break;  
            default:
                break;
        }

    }

    //*Operations
    public static double Addition(double x, double y){
        return x + y;
    }

    public static double Subtraction(double x, double y){
        return x - y;
    }

    public static double Multiplication(double x, double y){
    return x * y;
    }

    public static double Divition(double x, double y){
        return x / y;
    }

}