import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {

        String option = JOptionPane.showInputDialog("What do you want to do? \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Divition");
        double x = Double.parseDouble(JOptionPane.showInputDialog("First number: ")), y = Double.parseDouble(JOptionPane.showInputDialog("Second Number: ")), result = 0;
        Operations Addition = new Operations(), Subtraction = new Operations(), Multiplication = new Operations(), Divition = new Operations();

        switch (option) {
            case "1":
            case "Addition":
                result = Addition.Addition(x, y);
                JOptionPane.showMessageDialog(null, "The result is: "+result);
                break;
            case "Subtraction:":
            case "2":
                result = Subtraction.Subtraction(x, y);
                JOptionPane.showMessageDialog(null, "The result is: "+result);
                break;
            case "3":
            case "Multiplication":
                result = Multiplication.Multiplication(x, y);
                JOptionPane.showMessageDialog(null, "The result is: "+result);
                break;
            case "4":
            case "Divition":
                result = Divition.Divition(x, y);
                JOptionPane.showMessageDialog(null, "The result is: "+result);
                break;  
            default:
                break;
        }

    }

}