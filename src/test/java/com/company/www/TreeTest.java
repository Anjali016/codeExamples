package com.company.www;

import com.company.www.utils.TreeNode;
import com.company.www.utils.*;
import com.company.www.utils.Tree;
import org.junit.Assert;
import org.junit.Test;

public class TreeTest {


  private Tree tree = new Tree();




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
