package pattern.creational.prototype.deepCopy;

class Address {
    String city;
    public Address(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return city;
    }
}
