package pattern.prototype.deepCopy;

public class Runner {
    public static void main(String[] args) {
        Person original = new Person("Max", new Address("Moscow"));
        Person shallow = original.clone();
        Person deep = original.deepClone();

        shallow.address.city = "Minsk";
        deep.address.city = "Miami";

        System.out.println(original.address);
        System.out.println(shallow.address);
        System.out.println(deep.address);
    }
}
