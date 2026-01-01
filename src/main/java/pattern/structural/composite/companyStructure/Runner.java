package pattern.structural.composite.companyStructure;

import pattern.structural.composite.companyStructure.composite.Manager;
import pattern.structural.composite.companyStructure.leap.Developer;

public class Runner {
    public static void main(String[] args) {
        Manager manager = new Manager("Olga", "Team Lead");
        Developer developer1 = new Developer("Max", "Junior");
        Developer developer2 = new Developer("Ivan", "Middle");
        manager.addEmployee(developer1);
        manager.addEmployee(developer2);
        manager.showDetails();
    }
}
