package pattern.behavioral.templateMethod.dataParser.concreteMethod;

import pattern.behavioral.templateMethod.dataParser.abstractMethod.DataParser;

public class CSVParser extends DataParser {
    @Override
    protected void readData() {
        System.out.println("Reading data from CSV");
    }

    @Override
    protected void processData() {
        System.out.println("Process data from CSV");
    }
}
