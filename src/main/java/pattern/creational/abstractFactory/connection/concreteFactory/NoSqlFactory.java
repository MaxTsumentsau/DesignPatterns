package pattern.creational.abstractFactory.connection.concreteFactory;

import pattern.creational.abstractFactory.connection.AbstractFactory.ConnectionFactory;
import pattern.creational.abstractFactory.connection.abstractProduct.Command;
import pattern.creational.abstractFactory.connection.abstractProduct.Connection;
import pattern.creational.abstractFactory.connection.concreteProduct.NoSqlCommand;
import pattern.creational.abstractFactory.connection.concreteProduct.NoSqlConnection;

public class NoSqlFactory implements ConnectionFactory {
    @Override
    public Connection createConnection() {
        return new NoSqlConnection();
    }

    @Override
    public Command createCommand() {
        return new NoSqlCommand();
    }
}
