import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Biodata person = new Biodata();
        
        System.out.println("What is your name, how old are you, and what is your Student ID number?");
        String name = input.nextLine();
        int age = input.nextInt();
        long nim = input.nextLong();
        input.nextLine();  //! Bersihin sisa nextLong & nextInt

        person.scan(name, age, nim);

        input.close();
        person.print();
    }
}
