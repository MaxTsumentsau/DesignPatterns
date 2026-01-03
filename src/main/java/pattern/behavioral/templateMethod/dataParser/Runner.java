package pattern.behavioral.templateMethod.dataParser;

import pattern.behavioral.templateMethod.dataParser.abstractMethod.DataParser;
import pattern.behavioral.templateMethod.dataParser.concreteMethod.CSVParser;
import pattern.behavioral.templateMethod.dataParser.concreteMethod.JSONParser;
import pattern.behavioral.templateMethod.dataParser.concreteMethod.XMLParser;

public class Runner {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParser();
        csvParser.parseFile("Epstein.csv");

        DataParser jsonParser = new JSONParser();
        jsonParser.parseFile("Epstein.json");

        DataParser xmlParser = new XMLParser();
        xmlParser.parseFile("Epstein.xml");
    }
}
