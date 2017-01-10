package it.dibek.bitandpieces;

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
        binaryTree.addNode(null,1,"Root");
        binaryTree.addNode(binaryTree.findNode(1), 2,"A");

        assertTrue(binaryTree.findNode(2).name.equals("rightOf1"));

    }


    @Test
    public void canTreaverseTreeInOrder() {
        // given
        BinaryTree<String> binaryTree = new BinaryTree<>();
        binaryTree.addNode(null,-1,"Root");
        Node root = binaryTree.findNode(-1);
        binaryTree.addNode(root,10,"B");
        binaryTree.addNode(root,40,"G");
        binaryTree.addNode(root,30,"F");
        binaryTree.addNode(root,20, "D");
        binaryTree.addNode(root,25,"E");
        binaryTree.addNode(root,15,"C");
        binaryTree.addNode(root,5,"A");

        Node nodeToVisit = binaryTree.findNode(-1);



        assertThat("The result of traverse is" ,binaryTree.inOrderTraverseTree(nodeToVisit,"") ,
                equalTo(" " +
                        "-> Root " +
                        "-> A " +
                        "-> B " +
                        "-> C " +
                        "-> D " +
                        "-> E " +
                        "-> F " +
                        "-> G"));
    }
    @Test
    public void canGetAReverseIndex() {
        // given
        BinaryTree<String> binaryTree = new BinaryTree<>();
        binaryTree.addNode(null,1,"Root");
        binaryTree.addNode(binaryTree.root, 2,"A");
        binaryTree.addNode(binaryTree.root,3,"B");

        binaryTree.addNode(binaryTree.root,4,"C");
        binaryTree.addNode(binaryTree.root,5,"D");

        Node<String> nodeToVisit = binaryTree.findNode(1);

        String[] sortArray = new String[5];

        String firstElement = binaryTree.getIndexReverseSorted(nodeToVisit,sortArray,4,"")[0];

        assertThat("The result of traverse is" ,firstElement ,
                equalTo("D"));
    }



}