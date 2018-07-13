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

  public TreeNode printLCA(TreeNode node1, int first, int second) {
    if (node1 == null) return null;
    if ((int) node1.data == first || (int) node1.data == second) return node1;
    TreeNode left = printLCA(node1.left, first, second);
    TreeNode right = printLCA(node1.right, first, second);
    if (left != null && right != null) return left;
    else return left != null ? left : right;
  }

  /*public int countNodes(TreeNode root) {
    if (root == null) return 0;
    else {
      return countNodes(root.left) + countNodes(root.right) - 1;
    }
  }*/

  public int countNodes(TreeNode root) {
    if (root == null) return 0;
    else {
      count++;
      countNodes(root.left);
      countNodes(root.right);
      // return countNodes(root.left) + countNodes(root.right) - 1;
      return count;
    }
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

  /** Diamter of a tree **/
  int diamter(TreeNode root){
   if(root == null) return 0;
    int l = height(root.left);
    int r = height(root.right);
    return Math.max(1+l+r,Math.max(diamter(root.left),diamter(root.right)));
  }



























  public int getMirrorNode(TreeNode node1, TreeNode node2, T key) {
    if (node1 == null || node2 == null) return Integer.MIN_VALUE;
    if (node1.data == key) return (int) node2.data;
    else
      return Math.max(
          getMirrorNode(node1.left, node2.right, key), getMirrorNode(node1.right, node2.left, key));
  }

  /** Level Order Traversal* */
  int height(TreeNode root) {
    if (root == null) return 0;
    else return 1 + Math.max(height(root.left), height(root.right));
  }

  public void levelOrder(TreeNode root) {
    int h = height(root);
    for (int i = 1; i <= h; i++) {
      printLevel(root, i);
    }
  }

  void printLevel(TreeNode root, int level) {
    if (root == null) return;
    else if (level == 1) System.out.print(root.data + " ");
    else if (level > 1) printLevel(root.left, level - 1);
    printLevel(root.right, level - 1);
  }

  /** Left View of a Tree* */
  public void printLeftView(TreeNode root) {
    int h = height(root);
    for (int i = 1; i <= h; i++) {
      leftView(root, i);
    }
  }

  public void leftView(TreeNode root, int level) {
    if (root == null) return;
    else if (level == 1) System.out.print(root.data + " ");
    leftView(root.left, level - 1);
  }

  /** Right View of a Tree* */
  void rightView(TreeNode root) {
    int h = height(root);
    for (int i = 1; i <= h; i++) {
      printRightView(root, i);
    }
  }

  private void printRightView(TreeNode root, int level) {

    if (root == null) return;
    if (level == 1) System.out.println(root.data);
    printOddLevel(root.right, level - 1);
  }

  /** Bottom View of a Tree **/

  void printBottomView(TreeNode root){
    if(root == null)  return;
    if (isLeaf(root)) System.out.println(root.data);
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

  void boundaryTraversal(TreeNode root){
    if(root == null) return;
    printLeftView(root);
    printBottomView(root);
    rightView(root);
  }
}
