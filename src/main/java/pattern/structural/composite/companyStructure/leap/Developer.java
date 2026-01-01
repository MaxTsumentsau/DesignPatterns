package pattern.structural.composite.companyStructure.leap;

import pattern.structural.composite.companyStructure.commonInterface.Employee;

public class Developer implements Employee {
    private String name;
    private String grade;

    @Override
    public void showDetails() {
        System.out.printf("Developer position: %s, grade: %s%n", name, grade);
    }

    public Developer(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}
