package com.company.www.data.structures.tree;

import com.company.www.utils.TreeNode;

import java.util.*;

public class TreeExamples {

  int hd = 0;
  private int count = 0;
  private TreeNode root;

  /** Diamter of a tree **/
  int diameter(TreeNode root) {
    if (root == null) return 0;
    else {
      int left = diameter(root.left);
      int right = diameter(root.right);
      return Math.max(height(root) , Math.max(left, right));
    }
  }

  /** find the maximum element present in it **/
  int findMax(TreeNode root) {
    if (root == null) return 0;
    else {
      int left = findMax(root.left);
      int right = findMax(root.right);
      return Math.max((int) root.data, Math.max(left, right));
    }
  }

  /** Problem: Largest value in each level of Binary Tree. * */
  int max = Integer.MIN_VALUE;

  List<Integer> largestValue(TreeNode root) {
    java.util.Queue<TreeNode> queue = new LinkedList<>();
    List<Integer> list = new ArrayList<>();

    if (root != null) queue.add(root);
    while (!queue.isEmpty()) {
      int size = queue.size();

      while (size > 0) {
        TreeNode temp = queue.poll();
        max = Math.max(max, (int) temp.data);
        if (temp.left != null) queue.add(temp.left);
        if (temp.right != null) queue.add(temp.right);
        size--;
      }
      list.add(max);
    }
    return list;
  }

  /** Sum of nodes on the longest path from root to leaf node * */
  void sumOfLongestPath(TreeNode root, int sum, int height) {
    if (root != null) {
      if (isLeaf(root) && height == 1) System.out.println(sum + (int) root.data);
      else {
        sumOfLongestPath(root.left, sum + (int) root.data, height - 1);
        sumOfLongestPath(root.right, sum + (int) root.data, height - 1);
      }
    }
  }

  /** Root to leaf path sum equal to a given number.* */
  boolean hasPathSum(TreeNode root, int pathSum) {
    if (root != null) {
      if (isLeaf(root)) {
        if ((pathSum - (int) root.data) == 0) return true;
      } else {
        boolean left = hasPathSum(root.left, pathSum - (int) root.data);
        boolean right = hasPathSum(root.right, pathSum - (int) root.data);
        if (left == true || right == true) return true;
      }
    }
    return false;
  }

  /**
   * Check if a given Binary Tree is SumTree. A SumTree is a Binary Tree where the value of a node
   * is equal to sum of the nodes present in its left subtree and right subtree
   */
  int heightOfNode(TreeNode root, int node) {
    if (root == null) return 0;
    if ((int) root.data == node) return 1;
    int l = heightOfNode(root.left, node);
    if (l != 0) return 1 + l;
    int r = heightOfNode(root.right, node);
    if (r != 0) return 1 + r;
    return 0;
  }

  /** print sum of root to all leaf path * */
  void rootToLeavesSum(TreeNode root, int sum) {
    if (root != null) {
      if (isLeaf(root)) System.out.println(sum + (int) root.data);
      else {
        rootToLeavesSum(root.left, sum + (int) root.data);
        rootToLeavesSum(root.right, sum + (int) root.data);
      }
    }
  }

  /** Sum of all even nodes in a binary Tree* */
  int sumOfEvenNodes(TreeNode root) {
    if (root == null) return 0;
    int left = sumOfEvenNodes(root.left);
    int right = sumOfEvenNodes(root.right);
    if ((int) root.data % 2 == 0) return (int) root.data + left + right;
    else return left + right;
  }

  /** Sum of all left leaves in a binary Tree* */
  int sumOfLeftLeaves(TreeNode root, boolean isLeft) {
    if (root == null) return 0;
    int left = sumOfLeftLeaves(root.left, true);
    int right = sumOfLeftLeaves(root.right, false);
    if (isLeaf(root) && isLeft) return (int) root.data;
    else return left + right;
  }

  /** Sum of all the parent nodes having child node x * */
  int sumOfXParent(TreeNode root, int x) {
    if (root == null) return 0;
    int left = sumOfXParent(root.left, x);
    int right = sumOfXParent(root.right, x);
    if (hasChildX(root, x)) return left + right + (int) root.data;
    else return left + right;
  }

  private boolean hasChildX(TreeNode root, int x) {
    return (((root.left != null && (int) root.left.data == x)
        || (root.right != null && (int) root.right.data == x)));
  }
  /** Calculate the size of a binary tree * */
  int size(TreeNode root) {
    if (root == null) return 0;
    return size(root.left) + 1 + size(root.right);
  }

  /** print number of leaves in a binary leaf. * */
  int countLeaves(TreeNode root) {
    if (isLeaf(root)) return 1;
    else return countLeaves(root.left) + countLeaves(root.right);
  }

  /** print sum of all nodes in a tree* */
  int printSum(TreeNode root) {
    if (root == null) return 0;
    else {
      int leftsum = printSum(root.left);
      int rightsum = printSum(root.right);
      return (int) root.data + leftsum + rightsum;
    }
  }

  /** Find largest subtree sum in a tree * */
  int largestSubtreeSum(TreeNode root) {
    if (root == null) return 0;
    int result = Integer.MIN_VALUE;
    largestSum(root, result);
    return result;
  }

  private int largestSum(TreeNode root, int max) {
    if (root == null) return 0;
    int sum = (int) root.data + largestSum(root.left, max) + largestSum(root.right, max);
    max = Math.max(max, sum);
    return max;
  }

  /** Check for Children Sum Property in a Binary Tree.* */
  boolean childSum(TreeNode root) {
    if (root == null || root.left == null && root.right == null) return true;
    else {
      if ((int) root.data == ((int) root.left.data + (int) root.right.data)) return true;
      childSum(root.left);
      childSum(root.right);
    }
    return false;
  }

  /** Find n-th node of inorder traversal * */
  void nthInorder(TreeNode root, int[] n) {
    if (root == null) return;
    if (n[0] >= 0) {
      nthInorder(root.left, n);
      n[0]--;
      if (n[0] == 0) System.out.println(root.data);
      nthInorder(root.right, n);
    }
  }

  /** Change a tree so that the roles of the left and right pointers are swapped at every node. */
  void mirrorTree(TreeNode root) {
    if (root == null) return;
    else {
      mirrorTree(root.left);
      mirrorTree(root.right);
      swapNodes(root);
    }
  }

  private void swapNodes(TreeNode root) {
    TreeNode temp = root.right;
    root.right = root.left;
    root.left = temp;
  }

  /** InOrder Traversal * */
  void inOrder(TreeNode root) {
    if (root == null) return;
    else {
      inOrder(root.left);
      System.out.print(root.data + " ");
      inOrder(root.right);
    }
  }

  /** PreOrder Traversal * */
  void preOrder(TreeNode root) {
    if (root != null) {
      System.out.println(root.data);
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  /** find the maximum sum of all paths * */
  int maxSumPath(TreeNode root) {
    if (root == null) return 0;
    int leftSum = maxSumPath(root.left);
    int rightSum = maxSumPath(root.right);
    return Math.max(leftSum, rightSum) + (int) root.data;
  }

  /** check if a tree contains a given value* */
  boolean hasValue(TreeNode root, int key) {
    if (root == null) return false;
    return (int) root.data == key && hasValue(root.left, key) || hasValue(root.right, key);
  }

  /** determines whether or not two trees are equal: * */
  boolean areEqual(TreeNode root1, TreeNode root2) {
    if ((root1 == null && root2 != null) || (root2 == null && root1 != null)) return false;

    return (root1 == null && root2 == null)
        || (int) root1.data == (int) root2.data
            && areEqual(root1.left, root2.left)
            && areEqual(root1.right, root2.right);
  }
  /** Check for BST * */
  private boolean checkBST(TreeNode root, int low, int high) {
    if (root == null) return true;
    if (low > (int) root.data || high < (int) root.data) return false;
    return (checkBST(root.left, low, (int) root.data)
        && checkBST(root.right, (int) root.data, high));
  }

  boolean checkBST(TreeNode root) {
    if (root == null) return true;
    else return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  /** Find LCA when both keys are present. * */
  TreeNode findLCA(TreeNode root, int node1, int node2) {
    if (root == null) return null;
    if ((int) root.data == node1 || (int) root.data == node2) return root;
    else {
      TreeNode left = findLCA(root.left, node1, node2);
      TreeNode right = findLCA(root.right, node1, node2);
      if (left != null && right != null) return root;
      else return (left != null) ? left : right;
    }
  }

  /**
   * Construct Tree from given Inorder and Preorder traversals Inorder sequence: D B E A F C
   * Preorder sequence: A B D E C F
   */
  int rootIndex = 0;

  TreeNode constructTree(int[] inOrder, int[] preOrder, int start, int end) {
    if (start > end) return null;
    else {
      TreeNode root = new TreeNode(preOrder[rootIndex]);
      int inIndex = getIndex(inOrder, preOrder[rootIndex++]);
      root.left = constructTree(inOrder, preOrder, start, inIndex - 1);
      root.right = constructTree(inOrder, preOrder, inIndex + 1, end);
      return root;
    }
  }

  private int getIndex(int[] inOrder, int key) {
    for (int i = 0; i < inOrder.length; i++) if (inOrder[i] == key) return i;
    return -1;
  }

  /**
   * Vertical Order of a binary tree. While traversing the tree,recursively calculate HDs. For root
   * it is 0 . For left subtree, HD of root minus 1. For right subtree, HDroot plus 1. For every HD
   * value, we maintain a list of nodes in a hasp map. Whenever we see a node in traversal, we go to
   * the hash map entry and add the node to the hash map using HD as a key in map. *
   */
  private void verticalOrder(TreeNode root, int hd, Map<Integer, LinkedList<Integer>> map) {
    if (root == null) return;
    else {
      if (map.containsKey(hd)) {
        map.get(hd).add((int) root.data);
      } else {
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
  }

  /** Left View of a tree* */
  int maxlevel = Integer.MIN_VALUE;

  private void leftView(TreeNode root, int level) {
    if (root == null) return;
    if (maxlevel < level) {
      System.out.println(root.data);
      maxlevel = level;
    }
    leftView(root.left, level + 1);
    leftView(root.right, level + 1);
  }

  void printLeftView(TreeNode root) {
      leftView(root, 1);
    }

  /** Right View of a tree* */
  private void rightView(TreeNode root, int level) {
    if (root == null) return;
    if (maxlevel < level) System.out.println(root.data);
    maxlevel = level;
    rightView(root.right, level + 1);
    rightView(root.left, level + 1);
  }

  void printRightView() {
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

  int height(TreeNode root) {
    if (root == null) return 0;
    else return 1 + Math.max(height(root.left), height(root.right));
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

}
