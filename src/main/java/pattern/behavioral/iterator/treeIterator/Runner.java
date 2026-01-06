package pattern.behavioral.iterator.treeIterator;

import pattern.behavioral.iterator.treeIterator.concreteCollection.TreeNode;
import pattern.behavioral.iterator.treeIterator.concreteIterator.TreeIterator;
import pattern.behavioral.iterator.treeIterator.iteratorInterface.Iterator;

public class Runner {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        TreeIterator iterator = new TreeIterator(root);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
