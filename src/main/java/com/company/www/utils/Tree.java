package com.company.www.utils;

import com.company.www.utils.ifaces.TreeInterface;

public class Tree<T> implements TreeInterface<T> {

  TreeNode root;
  int count = 0;

  @Override
  public TreeNode constructTree(int index, T[] array) {
    if (index < array.length) {
      root = new TreeNode(array[index]);
      root.left = constructTree(2 * index + 1, array);
      root.right = constructTree(2 * index + 2, array);
      return root;
    } else return null;
  }

  @Override
  public void insertion(T data) {
    System.out.println(insertion(root, data).data);
  }

  private TreeNode insertion(TreeNode root, T data) {
    TreeNode newNode = new TreeNode(data);
    if (root == null) return newNode;
    else {
      insertion(root.left, data);
      insertion(root.right, data);
    }
    return root;
  }

  @Override
  public void deletion(T data) {
    deletion(root, data);
  }

  private TreeNode deletion(TreeNode root, T key) {
    if (root.left.data == key && isLeaf(root.left)) root.left = null;
    if ((root.right.data == key && isLeaf(root.right))) root.right = null;
    return root;
  }

  private boolean isLeaf(TreeNode root) {
    return (root != null && (root.left == null && root.right == null));
  }

  @Override
  public void depth() {}

  @Override
  public int size(TreeNode root) {
    while (root != null) {
      return 1 + size(root.left) + size(root.right);
    }
    return 0;
  }

  @Override
  public void getInorder(TreeNode root) {
    while (root != null) {
      getInorder(root.left);
      System.out.println(root.data);
      getInorder(root.right);
    }
  }

  @Override
  public void getPostOrder(TreeNode root) {
    while (root != null) {
      getPostOrder(root.left);
      getPostOrder(root.right);
      System.out.println(root.data);
    }
  }

  @Override
  public void getPreOrder(TreeNode root) {
    while (root != null) {
      System.out.println(root.data);
      getPreOrder(root.left);
      getPreOrder(root.right);
    }
  }

  public int getMirrorNode(TreeNode node1, TreeNode node2, T key) {
    if (node1 == null || node2 == null) return Integer.MIN_VALUE;
    if (node1.data == key) return (int)node2.data;
    else return
      Math.max(getMirrorNode(node1.left, node2.right, key),
      getMirrorNode(node1.right, node2.left, key));

  }

}
