public class Biodata {
    String name;
    int age;
    long nim;
    String[] hobbies;

    void scan(String name, int age, long nim) {
        this.name = name;
        this.age = age;
        this.nim = nim;
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student Identification Number: " + nim);
        System.out.println();
    }
}
