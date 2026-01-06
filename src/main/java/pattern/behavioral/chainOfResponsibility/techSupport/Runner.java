package pattern.behavioral.chainOfResponsibility.techSupport;

import pattern.behavioral.chainOfResponsibility.techSupport.concreteExecutor.LevelOneSupport;
import pattern.behavioral.chainOfResponsibility.techSupport.concreteExecutor.LevelThreeSupport;
import pattern.behavioral.chainOfResponsibility.techSupport.concreteExecutor.LevelTwoSupport;
import pattern.behavioral.chainOfResponsibility.techSupport.interfaceExecutor.SupportHandler;

public class Runner {
    public static void main(String[] args) {
        SupportHandler one = new LevelOneSupport();
        SupportHandler two = new LevelTwoSupport();
        SupportHandler three = new LevelThreeSupport();

        one.setNext(two);
        two.setNext(three);

        one.handleRequest("I can't enter the password");
        one.handleRequest("My wifi doesn't work");
        one.handleRequest(" I don't know how connect to database");
        one.handleRequest(" I want to talk with your manager!!!");
    }
}
