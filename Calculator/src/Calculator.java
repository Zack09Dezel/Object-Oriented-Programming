import javax.swing.JOptionPane;
//! Need to beautify the UI for fancier navigation.
public class Calculator {
    public static void main(String[] args) {

        String option = JOptionPane.showInputDialog("What do you want to do? \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Divition");
        double x = Double.parseDouble(JOptionPane.showInputDialog("First number: ")), y = Double.parseDouble(JOptionPane.showInputDialog("Second Number: ")), result = 0;
        Operations Addition = new Operations(), Subtraction = new Operations(), Multiplication = new Operations(), Divition = new Operations();
        
        //TODO: Need to find a way to integrate N variable into the operations, possible through Object Overload.
        switch (option) {
            case "1":
            case "Addition":
                result = Addition.Addition(x, y);
                JOptionPane.showMessageDialog(null, "The result is: "+result);
                break;
            case "2":
            case "Subtraction:":
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