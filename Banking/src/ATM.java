import java.util.Scanner;

public class ATM {
    public static void main(String[] args) throws Exception {
        Bank_Database account = new Bank_Database();
        Scanner input = new Scanner(System.in);

        System.out.print("What is you name");
        String name = input.nextLine();
        System.out.println("Age?");

        account.scan(name, 0, 0);
        input.close();


    }
}
