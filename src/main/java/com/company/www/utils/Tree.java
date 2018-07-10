package com.company.www.utils;

import com.company.www.utils.ifaces.TreeInterface;

public class Tree<T> implements TreeInterface<T> {

  TreeNode root;
  int count = 0;

  @Override
  public TreeNode constructTree(int index,T[] array) {
    while(index <= array.length){
      if(index == 0){
        root = new TreeNode(array[index]);
      }
      while(size(root) != array.length){
        root.left= constructTree(2*index+1,array);
        root.right = constructTree(2*index+2,array);
      }
      return root;
    }

  return null;
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
  public void getInorder() {}

  @Override
  public void getPostOrder() {}

  @Override
  public void getPreOrder() {}
}
