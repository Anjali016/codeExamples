package com.company.www.bst;

import com.company.www.utils.TreeNode;
import org.junit.Test;

public class BSTExamplesTest {
  @Test
  public void closest() throws Exception {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);
    System.out.println(bst.closest(root,4, null).data);
  }

    BSTExamples bst = new BSTExamples();
  @Test
    public void findCeilTest() throws Exception {
      TreeNode root = new TreeNode(2);
       root.left = new TreeNode(1);
      root.right = new TreeNode(3);
      System.out.println(bst.findCeil(root,3).data);
  }
}