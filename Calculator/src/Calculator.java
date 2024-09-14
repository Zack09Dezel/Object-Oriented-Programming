import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option = JOptionPane.showInputDialog("What do you want to do? \n1. Addition\n2. Substraction\n3. Multiplication\n4. Divition");
        //Lmao
        switch (option) {
            case "Addition":
                double x = input.nextInt(), y = input.nextInt();
                
                break;
            case "Substraction:":
                break;
            case "Multiplication":
                break;
            case "Divition":
                break;  
            default:
                break;
        }

    }

    //*Operations
    public static double Addition(double x, double y){
        return x + y;
    }

    public static double Substraction(double x, double y){
        return x - y;
    }

    public static double Multiplication(double x, double y){
    return x * y;
    }

    public static double Divition(double x, double y){
        return x / y;
    }

}