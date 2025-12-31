package pattern.creational.abstractFactory.connection.AbstractFactory;

import pattern.creational.abstractFactory.connection.abstractProduct.Command;
import pattern.creational.abstractFactory.connection.abstractProduct.Connection;

public interface ConnectionFactory {
    Connection createConnection();

    Command createCommand();
}
