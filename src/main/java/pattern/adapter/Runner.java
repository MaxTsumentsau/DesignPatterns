package pattern.adapter;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        XMLProcessor xmlLib = new XMLProcessor();

        DataProcessor processor = new XMLProcessorAdapter(xmlLib);

        Map<String, Object> data = Map.of(
                "name", "Максим",
                "age", 33,
                "city", "Москва"
        );

        processor.process(data);
    }
}