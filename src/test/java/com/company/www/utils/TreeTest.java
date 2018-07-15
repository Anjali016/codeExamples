package com.company.www.utils;

import org.junit.Assert;
import org.junit.Test;

public class TreeTest {
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

  private Tree tree = new Tree();
  @Test
  public void printPaths() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    tree.printPaths(root,"");
  }

  @Test
  public void levelOrderQueue() throws Exception {

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(9);
    root.left.left = new TreeNode(4);
    root.left.left.left= new TreeNode(5);
    root.left.left.right = new TreeNode(7);
    Tree tree = new Tree();
    tree.LevelOrderQueue(root);
    }

  @Test
  public void diamter() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(8);
    /*root.right.right = new TreeNode(9);
    root.left.left = new TreeNode(4);
    root.left.left.left= new TreeNode(5);
    root.left.left.right = new TreeNode(7);*/
    Tree tree = new Tree();
    System.out.println(tree.diamter(root));

  }

  @Test
  public void boundaryTraversal() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(9);
    root.left.left = new TreeNode(4);
    root.left.left.left= new TreeNode(5);
    root.left.left.right = new TreeNode(7);
    Tree tree = new Tree();
    tree.boundaryTraversal(root);
  }

  @Test
  public void bottomView() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(9);
    root.left.left = new TreeNode(4);
    root.left.left.left= new TreeNode(5);
    root.left.left.right = new TreeNode(7);
    Tree tree = new Tree();
    tree.printBottomView(root);
  }

  @Test
  public void printSpiral() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(9);
    root.left.left = new TreeNode(4);
    root.left.left.left= new TreeNode(5);
    root.left.left.right = new TreeNode(7);
    Tree tree = new Tree();
    tree.printSpiral(root);
  }

  @Test
  public void printLeftView() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.left.right = new TreeNode(7);
    Tree tree = new Tree();
    tree.printLeftView(root);
  }

  @Test
  public void printLevel() throws Exception {

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.left.right = new TreeNode(7);
    Tree tree = new Tree();
    tree.levelOrder(root);
  }

  @Test
  public void countNodes() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.left.right = new TreeNode(7);
    System.out.println(new Tree().countNodes(root));
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
    Assert.assertEquals(3, new Tree().getMirrorNode(root, root,2));
  }

  @Test
  public void constructTree() throws Exception {
    Object[] array = {1, 2, 3, 4, 5};
    System.out.println(new Tree().constructTree(0, array).data);
  }

  @Test
  public void size() throws Exception {
    TreeNode node1 = new TreeNode(1);
    node1.left = new TreeNode(2);
    node1.right = new TreeNode(3);
    Assert.assertEquals(3, new Tree().size(node1));
  }
}
