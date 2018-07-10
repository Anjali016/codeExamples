package com.company.www.utils;

import com.company.www.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {



  @Test
  public void size() throws Exception {

    TreeNode node1 = new TreeNode(1);
    node1.left = new TreeNode(2);
    node1.right = new TreeNode(3);
    Assert.assertEquals(3, new Tree().size(node1));
  }
}