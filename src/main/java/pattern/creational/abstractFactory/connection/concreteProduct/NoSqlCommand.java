package pattern.creational.abstractFactory.connection.concreteProduct;

import pattern.creational.abstractFactory.connection.abstractProduct.Command;

public class NoSqlCommand implements Command {
    @Override
    public void execute(String query) {
        System.out.println("Execute noSql query: " + query);
    }
}
