package pattern.prototype.deepCopy;

public class Person implements Cloneable{
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    //shallow copy
    public Person clone() {
        try {
            Person clone = (Person) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    //deep copy
    public Person deepClone(){
        return new Person(this.name, new Address(this.address.city));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
