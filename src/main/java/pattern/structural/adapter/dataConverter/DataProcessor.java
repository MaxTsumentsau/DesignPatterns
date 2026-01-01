package pattern.structural.adapter.dataConverter;

import java.util.Map;

interface DataProcessor {
    void process(Map<String, Object> data);
}
