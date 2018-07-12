package com.company.www.utils;

import org.junit.Assert;
import org.junit.Test;

public class TreeTest {

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
