package it.dibek.bitandpieces;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by giuseppe.dibella on 05/01/2017.
 */
public class BinaryTreeTest {

    @Test
    public void canAddNodesToBinaryTree() {

        // given
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(null,1);
        binaryTree.addNode(binaryTree.findNode(1), 2);

        assertTrue(binaryTree.findNode(2).name.equals("rightOf1"));

    }

    @Test
    public void canTreaverseTreeInOrder() {
        // given
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(null,-1);
        Node root = binaryTree.findNode(-1);
        binaryTree.addNode(root,10);
        binaryTree.addNode(root,20);

        binaryTree.addNode(root,30);
        binaryTree.addNode(root,40);
        binaryTree.addNode(root,25);
        binaryTree.addNode(root,15);
        binaryTree.addNode(root,5);

        Node nodeToVisit = binaryTree.findNode(-1);



        assertThat("The result of traverse is" ,binaryTree.inOrderTraverseTree(nodeToVisit) ,
                equalTo(" " +
                        "-> Root has the key -1 " +
                        "-> leftOf10 has the key 5 " +
                        "-> rightOf-1 has the key 10 " +
                        "-> leftOf20 has the key 15 " +
                        "-> rightOf10 has the key 20 " +
                        "-> leftOf30 has the key 25 " +
                        "-> rightOf20 has the key 30 " +
                        "-> rightOf30 has the key 40"));
    }
    @Test
    @Ignore
    public void canTreaverseTreeInReverseOrder() {
        // given
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(null,1);
        binaryTree.addNode(binaryTree.root, 2);
        binaryTree.addNode(binaryTree.root,3);

        binaryTree.addNode(binaryTree.root,4);
        binaryTree.addNode(binaryTree.root,5);

        Node nodeToVisit = binaryTree.findNode(5);



        assertThat("The result of traverse is" ,binaryTree.reverseOrderTraverseTree(nodeToVisit) ,
                equalTo(" " +
                        "-> Root has the key 1 " +
                        "-> leftNode has the key 2 " +
                        "-> rightNode has the key 3 " +
                        "-> leftNode2Row has the key 4 " +
                        "-> rightNode2Row has the key 5"));
    }

}