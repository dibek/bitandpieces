package it.dibek.bitandpieces;

public class BinaryTree {

    Node root;



    public void addNode(Node node, int key) {

        if (this.root == null)
        {
            this.root = new Node(key,"Root");
            node = this.root;
        }

    if (key < node.key) {
      if (node.leftChild != null) {
        addNode(node.leftChild, key);
      } else {
        System.out.println("  Inserted " + key + " to left of "
            + node.key);
        node.leftChild = new Node(key, "leftOf" + node.key);
      }
    } else if (key > node.key) {
      if (node.rightChild != null) {
        addNode(node.rightChild, key);
      } else {
        System.out.println("  Inserted "  + key + " to right of "
            + node.key);
        node.rightChild = new Node(key, "rightOf" + node.key);
      }
    }
  }
/*
  public void printInOrder(Node node) {
    if (node != null) {
      printInOrder(node.left);
      System.out.println("  Traversed " + node.value);
      printInOrder(node.right);
    }
  }




    public void addNode(int key, String name) {

        // Create a new Node and initialize it

        Node newNode = new Node(key, name);

        // If there is no root this becomes root

        if (root == null) {

            root = newNode;

        } else {

            // Set root as the Node we will start
            // with as we traverse the tree

            Node focusNode = root;

            // Future parent for our new Node

            Node parent;

            while (true) {

                // root is the top parent so we start
                // there

                parent = focusNode;

                // Check if the new node should go on
                // the left side of the parent node

                if (key < focusNode.key) {

                    // Switch focus to the left child

                    focusNode = focusNode.leftChild;

                    // If the left child has no children

                    if (focusNode == null) {

                        // then place the new node on the left of it

                        parent.leftChild = newNode;
                        newNode.parent = parent;
                        return; // All Done

                    }

                } else { // If we get here put the node on the right

                    focusNode = focusNode.rightChild;

                    // If the right child has no children

                    if (focusNode == null) {

                        // then place the new node on the right of it

                        parent.rightChild = newNode;
                        newNode.parent = parent;
                        return; // All Done

                    }

                }

            }
        }

    }
    */

    // All nodes are visited in ascending order
    // Recursion is used to go to one node and
    // then go to its child nodes and so forth

    public String inOrderTraverseTree(Node focusNode) {

        String nodeVisited = "";

        if (focusNode != null) {

            // Traverse the left node

            nodeVisited+= inOrderTraverseTree(focusNode.leftChild);

            // Visit the currently focused on node

            System.out.println(focusNode);

            nodeVisited+= focusNode;

            // Traverse the right node

            nodeVisited+= inOrderTraverseTree(focusNode.rightChild);

        }

        return nodeVisited;
    }
    // All nodes are visited in ascending order
    // Recursion is used to go to one node and
    // then go to its child nodes and so forth

    public String reverseOrderTraverseTree(Node focusNode) {

        String nodeVisited = "";

        if (focusNode != null) {

            // Traverse the left node

            nodeVisited+= inOrderTraverseTree(focusNode.parent);

            // Visit the currently focused on node

            System.out.println(focusNode);

            nodeVisited+= focusNode;



        }

        return nodeVisited;
    }
    public String preorderTraverseTree(Node focusNode) {

        String nodeVisited = "";

        if (focusNode != null) {

            System.out.println(focusNode);
            nodeVisited+= focusNode;

            nodeVisited+= preorderTraverseTree(focusNode.leftChild);
            nodeVisited+= preorderTraverseTree(focusNode.rightChild);

        }
        return nodeVisited;
    }

    public void postOrderTraverseTree(Node focusNode) {

        if (focusNode != null) {

            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.rightChild);

            System.out.println(focusNode);

        }

    }

    public Node findNode(int key) {

        // Start at the top of the tree

        Node focusNode = root;

        // While we haven't found the Node
        // keep looking

        while (focusNode.key != key) {

            // If we should search to the left

            if (key < focusNode.key) {

                // Shift the focus Node to the left child

                focusNode = focusNode.leftChild;

            } else {

                // Shift the focus Node to the right child

                focusNode = focusNode.rightChild;

            }

            // The node wasn't found

            if (focusNode == null)
                return null;

        }

        return focusNode;

    }

    public static void main(String[] args) {



    }
}

class Node {

    int key;
    String name;

    Node leftChild;
    Node rightChild;
    Node parent;

    Node(int key, String name) {

        this.key = key;
        this.name = name;

    }

    public String toString() {

        return " -> " + name + " has the key " + key;

		/*
		 * return name + " has the key " + key + "\nLeft Child: " + leftChild +
		 * "\nRight Child: " + rightChild + "\n";
		 */

    }

}