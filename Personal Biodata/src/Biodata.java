public class Biodata {
    String name;
    int age;

    public Biodata(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
