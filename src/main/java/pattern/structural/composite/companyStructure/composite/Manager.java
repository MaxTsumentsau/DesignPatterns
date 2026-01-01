package pattern.structural.composite.companyStructure.composite;

import pattern.structural.composite.companyStructure.commonInterface.Employee;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> team = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void addEmployee(Employee employee) {
        team.add(employee);
    }

    @Override
    public void showDetails() {
        System.out.printf("Manager position: %s, name: %s%n", position, name);
        for (Employee employee : team) {
            employee.showDetails();
        }
    }
}
