package com.company.www.dataStructures.tree;

import com.company.www.utils.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeExamples {

  private int count = 0;
  private TreeNode root;
  int hd = 0;

  /** Vertical Order of a binary tree * */
  private void verticalOrder(TreeNode root, int hd, Map<Integer, LinkedList<Integer>> map) {
    if (root == null) return;
    else {
      if (map.containsKey(hd)) {
        map.get(hd).add((int) root.data);
      }
      else {
        LinkedList<Integer> list = new LinkedList<>();
        list.add((int) root.data);
        map.put(hd, list);
      }
    }
    verticalOrder(root.left, hd - 1, map);
    verticalOrder(root.right, hd + 1, map);

  }

  public void printVerticalOrder(TreeNode root) {
    Map<Integer, LinkedList<Integer>> map = new TreeMap<>();
    verticalOrder(root, 0, map);
    for (Integer key : map.keySet()) {
      List<Integer> list = map.get(key);
      list.forEach(v -> System.out.print(v + " "));
    }

    for (Map.Entry entry : map.entrySet()) {

    }
  }

  /** Left View of a tree* */
  int maxLevel = 0;

  void leftView(TreeNode root, int level) {
    if (root == null) return;

    if (maxLevel < level) System.out.println(root.data);
    maxLevel = level;

    leftView(root.left, level + 1);
    leftView(root.right, level + 1);
  }

  private void printLeftView() {
    leftView(root, 1);
  }

  /** Right View of a tree* */
  void rightView(TreeNode root, int level) {
    if (root == null) return;

    if (maxLevel < level) System.out.println(root.data);
    maxLevel = level;

    rightView(root.right, level + 1);
    rightView(root.left, level + 1);
  }

  private void printRightView() {
    leftView(root, 1);
  }

  /** Root to all leaf* */
  public void printPaths(TreeNode root, String soFar) {
    if (root != null) return;
    if (isLeaf(root)) System.out.println(soFar + root.data);
    else {
      printPaths(root.left, soFar + root.data);
      printPaths(root.right, soFar + root.data);
    }
  }

  public boolean isLeaf(TreeNode root) {
    return (root != null && (root.left == null && root.right == null));
  }

  /** Method to print Least Common Ancestor* */
  public TreeNode printLCA(TreeNode node1, int first, int second) {
    if (node1 == null) return null;
    if ((int) node1.data == first || (int) node1.data == second) return node1;
    TreeNode left = printLCA(node1.left, first, second);
    TreeNode right = printLCA(node1.right, first, second);
    if (left != null && right != null) return left;
    else return left != null ? left : right;
  }

  /** Diamter of a tree * */
  public int diamter(TreeNode root) {
    if (root == null) return 0;
    int l = height(root.left);
    int r = height(root.right);
    return Math.max(1 + l + r, Math.max(diamter(root.left), diamter(root.right)));
  }

  /** Finding the mirror Node of the given node in a binary tree. * */
  public int getMirrorNode(TreeNode node1, TreeNode node2, int key) {
    if (node1 == null || node2 == null) return Integer.MIN_VALUE;
    if ((int) node1.data == key) return (int) node2.data;
    else
      return Math.max(
          getMirrorNode(node1.left, node2.right, key), getMirrorNode(node1.right, node2.left, key));
  }

  /**
   * Create empty queue and pust root node to it. Do the following when queue is not empty Pop a
   * node from queue and print it Push left child of popped node to queue if not null Push right
   * child of popped node to queue if not null*
   */
  /*public void LevelOrderQueue(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode temp = queue.poll();
      System.out.println(temp.data);
      if (temp.left != null) queue.add(temp.left);
      if (temp.right != null) queue.add(temp.right);
    }
  }*/

  /** Level Order traversal* */
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

  /** Printing the Deepest node in a given binary tree * */
  int deepestlevel;

  int value;

  public int Deep(TreeNode root) {
    find(root, 0);
    return value;
  }

  public void find(TreeNode root, int level) {
    if (root != null) {
      find(root.left, ++level);
      if (level > deepestlevel) {
        value = (int) root.data;
        deepestlevel = level;
      }
      find(root.right, level);
    }
  }

  int height(TreeNode root) {
    if (root == null) return 0;
    else return 1 + Math.max(height(root.left), height(root.right));
  }

  public void deepestNodeHeight(TreeNode root) {
    int h = height(root);
    printNode(root, h);
  }

  private void printNode(TreeNode root, int h) {
    if (root == null) return;
    else if (h == 1) System.out.println(root.data);
    printNode(root.left, h - 1);
    printNode(root.right, h - 1);
  }

  /** Count number of nodes in a tree * */
  public int countNodes(TreeNode root) {
    if (root == null) return 0;
    else {
      count++;
      countNodes(root.left);
      countNodes(root.right);
      return count;
    }
  }
}
