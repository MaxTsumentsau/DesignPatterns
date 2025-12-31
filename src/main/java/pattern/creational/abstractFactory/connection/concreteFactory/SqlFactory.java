package pattern.creational.abstractFactory.connection.concreteFactory;

import pattern.creational.abstractFactory.connection.AbstractFactory.ConnectionFactory;
import pattern.creational.abstractFactory.connection.abstractProduct.Command;
import pattern.creational.abstractFactory.connection.abstractProduct.Connection;
import pattern.creational.abstractFactory.connection.concreteProduct.SqlCommand;
import pattern.creational.abstractFactory.connection.concreteProduct.SqlConnection;

public class SqlFactory implements ConnectionFactory {
    @Override
    public Connection createConnection() {
        return new SqlConnection();
    }

    @Override
    public Command createCommand() {
        return new SqlCommand();
    }
}
