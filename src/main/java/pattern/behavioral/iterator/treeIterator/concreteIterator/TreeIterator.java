package pattern.behavioral.iterator.treeIterator.concreteIterator;

import pattern.behavioral.iterator.treeIterator.concreteCollection.TreeNode;
import pattern.behavioral.iterator.treeIterator.iteratorInterface.Iterator;

import java.util.Stack;

public class TreeIterator implements Iterator {
    private Stack<TreeNode> stack = new Stack<>();

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Integer next() {
        TreeNode node = stack.pop();
        int result = node.value;
        if (node.right != null) {
            pushLeft(node.right);
        } return result;
    }

    public TreeIterator(TreeNode root) {
        pushLeft(root);
    }

    private void pushLeft(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}
