import java.util.*;

public class Node {
    public static String name;
    public static String value;
    public static Node left;
    public static Node right;

    public Node (String name, String value) {
        this(name, value, null, null);
    }

    public Node (String name, String value, Node left, Node right) {
        this.name = name;
        this.value = value;
        this.left = left;
        this.right = right;
    }


}
