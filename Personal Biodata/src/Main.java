import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Biodata person = new Biodata();

        System.out.println("\n============================");
        System.out.println("||    Personal Biodata    ||");
        System.out.println("============================\n");

        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("How old are you? ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("What is you student ID number? ");
        long nim = input.nextLong();
        input.nextLine();  
        System.out.print("How many are your hobbies? ");
        int totalHobbies = input.nextInt();
        input.nextLine();

        String[] hobbies = new String[totalHobbies];
        for(int i = 0; i < totalHobbies;i++){
            System.out.print("Hobby number "+(i + 1)+": ");
            hobbies[i] = input.nextLine();
            if (hobbies[i].isEmpty()) {
                hobbies[i] = "-";
            }
        }

        person.scan(name, age, nim, hobbies);
        input.close();
        person.print();
    }
}
