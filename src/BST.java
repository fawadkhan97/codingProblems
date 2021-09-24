import java.util.Scanner;

class Node {
    Integer data;
    Node left;
    Node right;

    public Node(Integer data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BST {
    // print bst
    boolean printTree(Node node, String prefix) {
        if (node == null) return false;
        else {
            System.out.println(prefix + "  " + node.data);
            printTree(node.left, prefix + " left child : ");
            printTree(node.right, prefix + "right child :  ");
        }
        return true;
    }

    // find inorder successor
    public static void inorder(Node rootNode) {
        if (rootNode == null) return;
        inorder(rootNode.left);
        System.out.print(rootNode.data + " ");
        inorder(rootNode.right);
    }

    // find minimum value in subtree
    public static Node getMinimumKey(Node curr) {
        while (curr.left != null) curr = curr.left;
        return curr;
    }

    // insert into tree
    Node insertNode(Node rootNode, int a) {

// create root node
        if (rootNode == null) {
            System.out.println("root is created");
            return new Node(a);
        }
// duplicates prevention
        if (rootNode.data == a) {
            System.out.println("already inserted try different values\n ");
            return rootNode;
        }
        // insert into left subtree
        else if (a < rootNode.data) {
            rootNode.left = insertNode(rootNode.left, a);
           // System.out.println("left child created");

        }
        // insert into right subtree
        // else if (a > rootNode.data)
        else {
            rootNode.right = insertNode(rootNode.right, a);
          //  System.out.println("right child created ");
        }

        return rootNode;
    }

    // search node
    public Node searchNode(Node rootNode, int key) {
        if (rootNode == null) {
            System.out.println("Node not found");
            return null;
        }
        if (rootNode.data == key) {
            System.out.println("Node found  " + rootNode.data);
            return rootNode;
        }
        // search right subtree or right child
        if (key > rootNode.data) return searchNode(rootNode.right, key);

        // search left subtree or left child
        return searchNode(rootNode.left, key);
    }

    // delete node
    public Node deleteNode(Node rootNode, int key) {
        Node parent = null;
        Node current = rootNode;
        // search location and parent of given node;
        while (current != null && current.data != key) {
            // make current node its parent
            parent = current;

            // if key is less than current node goto left subtree
            if (key < current.data) current = current.left;

            // if key is greater than current node goto right subtree
            else current = current.right;
        }
        // Node not found
        if (current == null) {
            System.out.println("\n \t Node doesn't exist \n");
            return null;
        } else {
            //Case1: delete leaf node

            if (current.left == null && current.right == null) {
                if (current != rootNode) {
                    current.data = null;
                    if (parent.left == current) parent.left = null;
                    else parent.right = null;
                } else{
                    rootNode = null;}

                System.out.println("\n \t \t=====>Deletion successful<===== \n");

                return rootNode;
            }
            // Case2: delete node with two childs
            else if ((current.left != null && current.right != null)) {

                // find its inorder successor node
                Node successor = getMinimumKey(current.right);
                // store successor value
                int val = successor.data;
                // recursively delete the successor.
                deleteNode(rootNode, successor.data);

                // copy value of the successor to the current node
                current.data = val;

                System.out.println("\n \t Node deleted.... new parent/root is: " + val + " \n");

                return rootNode;
            }

            // Case 3: Delete node with single child
            else {
                Node child = (current.left != null) ? current.left : current.right;

                if (current != rootNode) if (current == parent.left) parent.left = child;
                else parent.right = child;
                else rootNode = child;
                System.out.println("\n \t \t=====>Deletion successful<===== \n");
                System.out.println("new node in old node place : "+ child.data ) ;
            }
        }
        return rootNode;
    }
}


class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BST bst = new BST();
        Node currentRoot = null;
        int nodeValue;
        String choice = "";
        int searchkey;

            do {
            System.out.println("Please enter a new node to insert ");
            nodeValue = input.nextInt();
            currentRoot = bst.insertNode(currentRoot, nodeValue);
            do {
                System.out.println("would you like to insert more values? press 1 for yes or press 2 for no");
                choice = input.next();
                switch (choice) {
                    case "1":
                        choice = "-9";
                        break;
                    case "2":
                        do {
                            System.out.println("\n Please select  \n1.Search Node\n2.Delete Node\n3.Print node ");
                            choice = input.next();
                            switch (choice) {
                                // search values
                                case "1":
                                    System.out.print("\nenter value to search: ");
                                    searchkey = input.nextInt();
                                    bst.searchNode(currentRoot, searchkey);
                                    break;
                                    // delete values
                                case "2":
                                    System.out.print("\n enter value to delete:");
                                    nodeValue = input.nextInt();

                                    try {
                                        currentRoot = bst.deleteNode(currentRoot, nodeValue);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case "3":
                                    boolean printResult = bst.printTree(currentRoot, "");
                                    if (!printResult)
                                        System.out.println("\t tree is empty \n");
                                    break;
                                default:
                                    System.out.println("incorrect value was entered \n");
                            }

                        } while (!choice.equals("-1"));
                        break;
                    default:
                        System.out.println("incorrect value was enter");

                }


            } while (choice != "-9");

        } while (nodeValue != -1); while (!choice.equals("-1"));


    }


}