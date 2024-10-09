public class Bank_Database {

    String name;
    int age;
    long nim;

    void scan(String name, int age, long id) {
        this.name = name;
        this.age = age;
        this.nim = id;
    }

    void print(String name, int age, long id){
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID Number: " + id);
    }


}
