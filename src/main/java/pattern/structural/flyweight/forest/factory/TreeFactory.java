package pattern.structural.flyweight.forest.factory;

import pattern.structural.flyweight.forest.intrinsic.TreeType;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + color + texture;
        treeTypes.putIfAbsent(key, new TreeType(name, color, texture));
        return treeTypes.get(key);
    }

    public void printTreeTypes(){
        System.out.println("TreeTypes: "+treeTypes.toString());
    }
}
