import java.util.*;

public class BinaryTree {

    private static final int HEADS = 0;
    private static final int TAILS = 1;

    public static Node createBinaryTree(int levels) {
        Node root = new Node("1");
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        int currentLevel = 1;
        int nameCount = 2;
        while (currentLevel <= levels) {
            int numNodeInLevel = (int) Math.pow(2, currentLevel);
            int numCreatedNodes = 0;
            int numMissingNodes = 0;

            while (numCreatedNodes + numMissingNodes < numNodeInLevel) {
                Node currentNode = queue.poll(); //poll == pop
                Random random = new Random();

                //do the left side first
                if (random.nextInt(2) == HEADS) {
                    addNodeToTree(currentNode, queue, nameCount, false);
                    nameCount++;
                    numCreatedNodes++;
                } else {
                    numMissingNodes++;
                }

                //do the right side next
                if (numNodeInLevel == numMissingNodes + 1) {
                    addNodeToTree(currentNode, queue, nameCount, true);
                    nameCount++;
                    numCreatedNodes++;
                }
                else if (random.nextInt(2) == HEADS) {
                   addNodeToTree(currentNode, queue, nameCount, true);
                   nameCount++;
                   numCreatedNodes++;
                } else {
                    numMissingNodes++;
                }
            }

            currentLevel++;
        }

        return root;

    }




    public static void addNodeToTree(Node currentNode, Queue queue, int nameCount, boolean assignRight) {
        Node tempNode = new Node(Integer.toString(nameCount));
        if (assignRight) {
            currentNode.setRight(tempNode);
        } else {
            currentNode.setLeft(tempNode);
        }
        queue.add(tempNode);
    }



}
