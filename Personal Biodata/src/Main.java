import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        input.nextLine(); //! ini buat bersihin sisa dari nextInt di atas

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        input.close();
    }
}
