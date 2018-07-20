package com.company.www.utils;

import com.company.www.ifaces.TreeInterface;

import java.util.LinkedList;
import java.util.Queue;

public class Tree<T> implements TreeInterface<T> {

  TreeNode root;
  int count = 0;

  /** Tree Constructing method from a given array* */
  @Override
  public TreeNode constructTree(int index, T[] array) {
    if (index < array.length) {
      root = new TreeNode(array[index]);
      root.left = constructTree(2 * index + 1, array);
      root.right = constructTree(2 * index + 2, array);
      return root;
    } else return null;
  }

  /** Inserting an element in the given tree* */
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

  public boolean isLeaf(TreeNode root) {
    return (root != null && (root.left == null && root.right == null));
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

  @Override
  public void depth() {}

  @Override
  public int size(TreeNode root) {
    while (root != null) {
      return 1 + size(root.left) + size(root.right);
    }
    return 0;
  }

  /*public int countNodes(TreeNode root) {
    if (root == null) return 0;
    else {
      return countNodes(root.left) + countNodes(root.right) - 1;
    }
  }*/



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



  /**
   * Given the binary Tree and the two nodes say ‘p’ and ‘q’, determine whether the two nodes are
   * cousins of each other or not.
   *
   * <p>Solution: What are cousin nodes ? Two nodes are said to be cousins of each other if they are
   * at same level of the Binary Tree and have different parents.
   *
   * <p>For Example:
   *
   * <p>A / \ B C / \ / \ D E F G Say two node be D and F, result is Cousins. Say two nodes are F
   * and E, result is Cousins. Say two nodes are B and C, result is Not Cousins.
   *
   * <p>The*
   */




  /** Level Order Traversal* */
  int height(TreeNode root) {
    if (root == null) return 0;
    else return 1 + Math.max(height(root.left), height(root.right));
  }




  /** Right View of a Tree* */
  int maxLevel = -1;

  public void printRightView(TreeNode root, int level) {
    if (root != null) {
      if (level > maxLevel) {
        System.out.print(root.data + " ");
        maxLevel = level;
      }
      printRightView(root.right, level + 1);
      printRightView(root.left, level + 1);
    }
  }

  void rightView(TreeNode root) {
    int h = height(root);
    for (int i = 1; i <= h; i++) {
      printRightView(root, i);
    }
  }

  /*private void printRightView(TreeNode root, int level) {

    if (root == null) return;
    if (level == 1) System.out.print(root.data);
  }*/
  /** Bottom View of a Tree * */
  public void printBottomView(TreeNode root) {
    if (root == null) return;
    if (isLeaf(root)) System.out.print(root.data);
    printBottomView(root.left);
    printBottomView(root.right);
  }

  /** Spiral view of the tree* */
  public void printSpiral(TreeNode root) {
    int h = height(root);
    for (int i = 1; i <= h; i++) {
      if (i % 2 == 0) printEvenLevel(root, i);
      else printOddLevel(root, i);
    }
  }

  private void printEvenLevel(TreeNode root, int level) {
    if (root == null) return;
    if (level == 1) System.out.print(root.data + " ");
    printEvenLevel(root.left, level - 1);
    printEvenLevel(root.right, level - 1);
  }

  private void printOddLevel(TreeNode root, int level) {
    if (root == null) return;
    if (level == 1) System.out.print(root.data + " ");
    printOddLevel(root.right, level - 1);
    printOddLevel(root.left, level - 1);
  }

  /** Boundary Traversals of the binary tree* */
  public void boundaryTraversal(TreeNode root) {
    if (root == null) return;
    else {
      leftBounary(root);
      printBottomBoundary(root);
      rightBounary(root);
    }
  }

  void rightBounary(TreeNode root) {
    if (root != null) {
      if (root.right != null) {
        rightBounary(root.right);
        System.out.print(root.data + " ");

      } else {
        if (root.left != null) leftBounary(root.left);
        System.out.print(root.data + " ");
      }
    }
  }

  private void printBottomBoundary(TreeNode root) {
    if (isLeaf(root)) System.out.println(root.data + " ");
    else printBottomView(root.left);
    printBottomView(root.right);
  }

  void leftBounary(TreeNode root) {
    if (root != null) {
      if (root.left != null) {
        System.out.print(root.data + " ");
        leftBounary(root.left);
      } else {
        if (root.right != null) System.out.print(root.data + " ");
        leftBounary(root.right);
      }
    }
  }


}
