package com.company.www.data.structures.tree;

import com.company.www.utils.Tree;
import com.company.www.utils.TreeNode;
import org.junit.Test;

public class TreeExamplesTest {
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
    System.out.println(tree.sumOfLeftLeaves(root,false));
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
    System.out.println(tree.sumOfXParent(root,10));
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
     root.left.left =  new TreeNode(3);
     root.left.right =  new TreeNode(5);
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
    root.left.left.left= new TreeNode(5);
    root.left.left.right = new TreeNode(7);
    tree.nthInorder(root, array);
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
  public void inOrder() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
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
  public void diamter() throws Exception {}

  @Test
  public void deepestNode() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.right = new TreeNode(5);
    root.left.right.right = new TreeNode(10);
    root.right = new TreeNode(3);
    System.out.println(tree.Deep(root));
  }

  @Test
  public void deepestNodeHeight() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.right = new TreeNode(5);
    root.left.right.right = new TreeNode(10);
    root.right = new TreeNode(3);
    tree.deepestNodeHeight(root);
  }

  @Test
  public void printPaths() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    tree.printPaths(root, "");
  }
}
