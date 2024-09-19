import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Biodata person = new Biodata();
        
        System.out.println("What is your name, how old are you, and what is your Student ID number?");
        String name = input.nextLine();
        int age = input.nextInt();
        long nim = input.nextLong();
        input.nextLine();  

        System.out.println("How many are your hobbies?");
        int totalHobbies = input.nextInt();
        input.nextLine();

        String[] hobbies = new String[totalHobbies];
        for(int i = 0; i < totalHobbies;i++){
            System.out.println("Hobby number "+(i + 1)+": ");
            hobbies[i] = input.nextLine();
        }

        person.scan(name, age, nim, hobbies);

        input.close();
        person.print();
    }
}
