import java.util.*;

public class Node {
    public static String name;
    public static String value;
    public static Node left;
    public static Node right;

    public Node (String name) {
        this(name, null, null, null);
    }

    public Node (String name, String value) {
        this(name, value, null, null);
    }

    public Node (String name, String value, Node left, Node right) {
        this.name = name;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Node.name = name;
    }

    public static String getValue() {
        return value;
    }

    public static void setValue(String value) {
        Node.value = value;
    }

    public static Node getLeft() {
        return left;
    }

    public static void setLeft(Node left) {
        Node.left = left;
    }

    public static Node getRight() {
        return right;
    }

    public static void setRight(Node right) {
        Node.right = right;
    }


}
