package pattern.behavioral.visitor.filesystem.unmodifiableObject;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<Object> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Object> getChildren() {
        return children;
    }

    public void add(Object child){
        children.add(child);
    }
}
