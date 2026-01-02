package pattern.structural.flyweight.forest;

import pattern.structural.flyweight.forest.extrinsic.Tree;
import pattern.structural.flyweight.forest.factory.TreeFactory;

public class Runner {
    public static void main(String[] args) {
        Tree oak1 = new Tree(1, 7, TreeFactory.getTreeType("oak", "gray", "old"));
        Tree oak2 = new Tree(5, 25, TreeFactory.getTreeType("oak", "gray", "old"));
        Tree pine1 = new Tree(4, 14, TreeFactory.getTreeType("pine", "yellow", "fresh"));

        oak1.draw();
        oak2.draw();
        pine1.draw();
    }
}
