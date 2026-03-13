public class Main {

    public static void main(String[] args) {

        Animal a1 = new Animal("Cat", "Alice", 3);
        System.out.println(a1);

        Dog d1 = new Dog("Buddy", "John", 5, "Labrador");
        Dog d2 = new Dog("Buddy", "John", 5, "Labrador");

        System.out.println(d1);

        if (d1.equals(d2)) {
            System.out.println("Dogs are equal");
        } else {
            System.out.println("Dogs are not equal");
        }
    }
}