import javax.swing.JOptionPane;

public class LoCalc {
    public static void main(String[] args) {
        String option = JOptionPane.showInputDialog("What do you want to do? \n1. Basic Logic\n2. Leap Year\n3. Grade Standard");
        LoOps operation = new LoOps();
        boolean x, y, result = false;

        switch (option) {
            case "1": 
                String logicOption = JOptionPane.showInputDialog("Choose a logic operation: \n1. AND\n2. OR\n3. NOT\n4. XOR");
                switch (logicOption) {
                    case "1":
                    case "and":
                    case "AND":
                    case "1. AND":
                        x = Boolean.parseBoolean(JOptionPane.showInputDialog("First boolean (true/false):"));
                        y = Boolean.parseBoolean(JOptionPane.showInputDialog("Second boolean (true/false):"));
                        result = operation.AND(x, y);
                        JOptionPane.showMessageDialog(null, "The result is: " + result);
                        break;

                    case "2":
                    case "or":
                    case "OR":
                    case "2. OR":
                        x = Boolean.parseBoolean(JOptionPane.showInputDialog("First boolean (true/false):"));
                        y = Boolean.parseBoolean(JOptionPane.showInputDialog("Second boolean (true/false):"));
                        result = operation.OR(x, y);
                        JOptionPane.showMessageDialog(null, "The result is: " + result);
                        break;

                    case "3":
                    case "not":
                    case "NOT":
                    case "3. NOT":
                        x = Boolean.parseBoolean(JOptionPane.showInputDialog("Boolean value (true/false):"));
                        result = operation.NOT(x);
                        JOptionPane.showMessageDialog(null, "The result is: " + result);
                        break;

                    case "4":
                    case "xor":
                    case "XOR":
                    case "4. XOR":
                        x = Boolean.parseBoolean(JOptionPane.showInputDialog("First boolean (true/false):"));
                        y = Boolean.parseBoolean(JOptionPane.showInputDialog("Second boolean (true/false):"));
                        result = operation.XOR(x, y);
                        JOptionPane.showMessageDialog(null, "The result is: " + result);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Invalid logic option selected.");
                        break;
                }
                break;

            case "2": 
                int year = Integer.parseInt(JOptionPane.showInputDialog("Enter a year:"));
                boolean isLeap = operation.isLeapYear(year);
                String leapMessage = isLeap ? "is a leap year." : "is not a leap year.";
                JOptionPane.showMessageDialog(null, "The year " + year + " " + leapMessage);
                break;

            case "3": 
                int score = Integer.parseInt(JOptionPane.showInputDialog("Enter your score (0-100):"));
                String grade;

                if (score >= 90) {
                    grade = "A";
                } else if (score >= 70) {
                    grade = "B";
                } else if (score >= 50) {
                    grade = "C";
                } else if (score >= 30) {
                    grade = "D";
                } else {
                    grade = "E";
                }

                JOptionPane.showMessageDialog(null, "Your grade is: " + grade);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Invalid option selected.");
                break;
        }
    }
}
