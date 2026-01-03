package pattern.behavioral.templateMethod.dataParser.concreteMethod;

import pattern.behavioral.templateMethod.dataParser.abstractMethod.DataParser;

public class XMLParser extends DataParser {
    @Override
    protected void readData() {
        System.out.println("Read data from XML");
    }

    @Override
    protected void processData() {
        System.out.println("Process data from XML");
    }
}
