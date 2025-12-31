package pattern.creational.abstractFactory.connection;

import pattern.creational.abstractFactory.connection.AbstractFactory.ConnectionFactory;
import pattern.creational.abstractFactory.connection.concreteFactory.NoSqlFactory;
import pattern.creational.abstractFactory.connection.concreteFactory.SqlFactory;

public class Runner {
    public static void main(String[] args) {
        ConnectionFactory factory;

        factory= new SqlFactory();
        var connection = factory.createConnection();
        var command = factory.createCommand();
        connection.connect();
        command.execute("SELECT * FROM people");

        factory= new NoSqlFactory();
        connection = factory.createConnection();
        command = factory.createCommand();
        connection.connect();
        command.execute("db.people.find({})");
    }
}
