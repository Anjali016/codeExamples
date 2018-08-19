package com.company.www.data.structures.tree;

import com.company.www.utils.Tree;
import com.company.www.utils.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TreeExamplesTest {
  @Test
  public void constructTree() throws Exception {
    int[] inOrder = {4, 2, 5, 1, 6, 3, 7};
    int[] preOrder = {1, 2, 4, 5, 3, 6, 7};
    TreeNode root = tree.constructTree(inOrder,preOrder,0,preOrder.length-1);
    printTree(root);
  }

  @Test
  public void findLCA() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(5);
    root.left.left = new TreeNode(4);
    System.out.println(
    tree.findLCA(root,5,4).data);
  }

  @Test
  public void checkBST() throws Exception {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);

    System.out.println(
    tree.checkBST(root));
  }

  @Test
  public void mirrorTree() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(5);
    root.left.left = new TreeNode(4);
    tree.mirrorTree(root);
    printTree(root);
  }

  private void printTree(TreeNode root){
    if (root == null) return;
    else System.out.println(root.data);
    printTree(root.left);
    printTree(root.right);
  }

  @Test
  public void areEqual() throws Exception {
    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(3);
    root1.right = new TreeNode(4);



    TreeNode root2 = new TreeNode(1);
    root2.left = new TreeNode(2);
    root2.right = new TreeNode(3);
    root2.right = new TreeNode(4);
    System.out.println(tree.areEqual(root1,root2));
  }
  @Test
  public void hasValue() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(5);
    root.left.left = new TreeNode(4);
    System.out.println(tree.hasValue(root,11));
  }

  @Test
  public void maxSumPath() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(10);
    root.left.left = new TreeNode(4);
    System.out.println(tree.maxSumPath(root));
  }
  /*@Test
  public void deepestNode1() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(10);
    System.out.println(tree.deepestNode(root,0));
  }*/

  @Test
  public void largestValue1() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(10);
    root.left.left = new TreeNode(4);
    List<Integer> list = tree.largestValue(root);
    list.forEach(x -> System.out.println(x));
  }

  @Test
  public void findMax() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(4);
    System.out.println(tree.findMax(root));

  }

  @Test
  public void largestValue() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(4);
    tree.largestValue(root);

  }

  @Test
  public void sumOfLongestPath() throws Exception {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    root.left.right = new TreeNode(2);
    tree.sumOfLongestPath(root,0,3);
  }

  /*@Test
     void levelOrderQueue() throws Exception {
      TreeNode root = new TreeNode(1);
      root.left = new TreeNode(2);
      root.right = new TreeNode(3);
      root.right.left = new TreeNode(8);
      root.right.right = new TreeNode(9);
      root.left.left = new TreeNode(4);
      root.left.left.left= new TreeNode(5);
      root.left.left.right = new TreeNode(7);
      tree.LevelOrderQueue(root);
    }
  */
  TreeExamples tree = new TreeExamples();

  @Test
  public void hasPathSum() throws Exception {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    root.left.right = new TreeNode(2);
    root.left.left = new TreeNode(7);
    root.right.left = new TreeNode(2);
    root.right.right = new TreeNode(3);
    System.out.println(tree.hasPathSum(root, 8));
  }

  @Test
  public void heightOfNode() throws Exception {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    root.left.right = new TreeNode(2);
    root.left.left = new TreeNode(7);
    root.right.left = new TreeNode(2);
    root.right.right = new TreeNode(3);
    root.right.right.left = new TreeNode(21);
    System.out.println(tree.heightOfNode(root, 21));
  }

  @Test
  public void rootToLeavesSum() throws Exception {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    root.left.right = new TreeNode(2);
    root.left.left = new TreeNode(7);
    root.right.left = new TreeNode(2);
    tree.rootToLeavesSum(root, 0);
  }

  @Test
  public void preOrder() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.right = new TreeNode(7);
    root.right.left = new TreeNode(6);
    tree.preOrder(root);
  }

  @Test
  public void sumOfEvenNodes() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    System.out.println(tree.sumOfEvenNodes(root));
  }

  @Test
  public void printSum() throws Exception {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    System.out.println(tree.printSum(root));
  }

  @Test
  public void sumOfLeftLeaves() throws Exception {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    root.left.right = new TreeNode(2);
    root.left.left = new TreeNode(7);
    root.right.left = new TreeNode(2);
    root.right.right = new TreeNode(3);
    System.out.println(tree.sumOfLeftLeaves(root, false));
  }

  @Test
  public void sumOfXParent() throws Exception {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    root.left.right = new TreeNode(2);
    root.left.left = new TreeNode(7);
    root.right.left = new TreeNode(2);
    root.right.right = new TreeNode(3);
    System.out.println(tree.sumOfXParent(root, 10));
  }

  @Test
  public void countLeaves() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(8);
    root.right = new TreeNode(2);
    System.out.println(tree.countLeaves(root));
  }

  /* @Test
    public void largestSum() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left =  new TreeNode(4);
        root.left.right =  new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(tree.largestSum(root,0));
    }
  */
  @Test
  public void childSum() throws Exception {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(8);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(2);
    System.out.println(tree.childSum(root));
  }

  @Test
  public void nthInorder() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    int[] array = {5};
    root.right.right = new TreeNode(9);
    root.left.left = new TreeNode(4);
    root.left.left.left = new TreeNode(5);
    root.left.left.right = new TreeNode(7);
    tree.nthInorder(root, array);
  }

  @Test
  public void inOrder() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.right = new TreeNode(7);
    root.right.left = new TreeNode(6);
    TreeExamples tree = new TreeExamples();
    tree.inOrder(root);
  }

  @Test
  public void printVerticalOrder() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(10);

    root.left.left.right = new TreeNode(7);
    TreeExamples tree = new TreeExamples();
    tree.printVerticalOrder(root);
  }

  @Test
  public void printLevel() throws Exception {

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.left.right = new TreeNode(7);
    Tree tree = new Tree();
    // tree.levelOrder(root);
  }

  @Test
  public void countNodes() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.left.right = new TreeNode(7);
    // System.out.println(new Tree().countNodes(root));
  }

  @Test
  public void getMirrorNode() throws Exception {

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.left.right = new TreeNode(7);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(6);
    root.right.left.left = new TreeNode(8);
    root.right.left.right = new TreeNode(9);
    // Assert.assertEquals(3, new Tree().getMirrorNode(root, root,2));
  }



  @Test
  public void printPaths() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    tree.printPaths(root, "");
  }
}
