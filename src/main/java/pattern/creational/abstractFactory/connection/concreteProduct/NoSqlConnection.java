package pattern.creational.abstractFactory.connection.concreteProduct;

import pattern.creational.abstractFactory.connection.abstractProduct.Connection;

public class NoSqlConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connect to NoSql Database");
    }
}
