public class Biodata {
    String name;
    int age;
    long nim;
    String[] hobbies;

    void scan(String name, int age, long nim, String[] hobbies) {
        this.name = name;
        this.age = age;
        this.nim = nim;
        this.hobbies = hobbies;
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student Identification Number: " + nim);
        System.out.print("Hobbies: ");
        for(int i = 0; i < hobbies.length; i++){
            if(i < hobbies.length - 1){
                System.out.print(hobbies[i] + ", ");
            }else{
                System.out.print(hobbies[i]);
            }
        }
        System.out.println();
    }
}
