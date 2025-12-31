package pattern.creational.abstractFactory.connection.concreteProduct;

import pattern.creational.abstractFactory.connection.abstractProduct.Command;

public class SqlCommand implements Command {
    @Override
    public void execute(String query) {
        System.out.println("Execute sql query: " + query);
    }
}
