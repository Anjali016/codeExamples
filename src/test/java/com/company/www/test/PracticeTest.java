package com.company.www.test;

import com.company.www.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class PracticeTest {
  @Test
  public void leftView() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.right = new TreeNode(4);
    new Practice().leftView(root,3);
  }

  @Test
  public void nLevelTraversal() throws Exception {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(6);
    root.left.left = new TreeNode(8);
    root.right = new TreeNode(7);
    root.left.right = new TreeNode(9);
    new Practice().nLevelTraversal(root,3);
  }

  @Test
  public void triangle() throws Exception {
    new Practice().triangle(4);
  }

  @Test
  public void height() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.right = new TreeNode(4);
    System.out.println(new Practice().height(root));
  }

  @Test
  public void countNodes() throws Exception {
    TreeNode root = new TreeNode("root");
    root.left = new TreeNode("left");
    root.right = new TreeNode("right");
    Assert.assertEquals(3,new Practice().countNodes(root));
  }

  @Test
  public void inOrder() throws Exception {
    TreeNode root = new TreeNode("root");
    root.left = new TreeNode("left");
    root.right = new TreeNode("right");
    new Practice().inOrder(root);
  }

  @Test
  public void sortMap() throws Exception {
    Map<String, Integer> name = new HashMap<>();
    name.put("anjali", 23);
    name.put("abhay", 30);
    name.put("tom", 32);
    new Practice().sortMap(name);
  }

  @Test
  public void printTable() throws Exception {
    new Practice().printTable(15);
  }

  @Test
  public void sumOfArray() throws Exception {
    int[] array = {1, 2, 3};
    Assert.assertEquals(6, new Practice().sumOfArray(array));
  }

  @Test
  public void largest() throws Exception {
    int[] array = {1, 3, 5};
    Assert.assertEquals(3, new Practice().largest(array));
  }
}
