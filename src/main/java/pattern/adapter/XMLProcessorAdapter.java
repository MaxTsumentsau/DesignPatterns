package pattern.adapter;

import java.util.Map;

class XMLProcessorAdapter implements DataProcessor {
    private final XMLProcessor xmlProcessor;

    public XMLProcessorAdapter(XMLProcessor xmlProcessor) {
        this.xmlProcessor = xmlProcessor;
    }

    @Override
    public void process(Map<String, Object> data) {
        String xmlData = convertToXML(data);
        xmlProcessor.parseXML(xmlData);
    }

    private String convertToXML(Map<String, Object> data) {
        StringBuilder xml = new StringBuilder();
        xml.append("<data>");
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            xml.append("<")
                    .append(entry.getKey())
                    .append(">")
                    .append(entry.getValue())
                    .append("</")
                    .append(entry.getKey())
                    .append(">");
        }
        xml.append("</data>");
        return xml.toString();
    }
}
