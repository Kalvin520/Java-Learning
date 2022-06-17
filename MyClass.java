public class MyClass {
    public static void main(String[] args) {
        DogClass dg = new DogClass();
        System.out.println("dog age = " + dg.age);
        System.out.println("dog name = " + dg.Name());
    }
}

class DogClass {
    // int Variable member
    public int age = 10;

    // string function member
    public String Name() {
        return "Tom";
    }
}
