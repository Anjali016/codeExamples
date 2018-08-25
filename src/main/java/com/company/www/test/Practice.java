package com.company.www.test;

import com.company.www.utils.TreeNode;

import java.util.*;

class Practice {

  void nLevelTraversal(TreeNode root, int level) {
    if (level == 0 || root == null) return;
    else {
      if (level == 1) System.out.println(root.data);
      nLevelTraversal(root.left, level - 1);
      nLevelTraversal(root.right, level - 1);
    }
  }

  void leftView(TreeNode root, int level) {
    if (level == 0 || root == null) return;
    else {
      System.out.println(root.data);
      leftView(root.left, level - 1);
      leftView(root.right, level - 1);
    }
  }

  void triangle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
  /** Largest of an Array * */
  int largest(int[] array) {
    return Arrays.stream(array).max().orElse(Integer.MIN_VALUE);
  }

  int sumOfArray(int[] array) {
    Arrays.stream(array).forEach(x -> System.out.print(x));
    return Arrays.stream(array).sum();
  }

  void printTable(int n) {
    for (int i = 1; i <= 10; i++) System.out.println(n + " x " + i + " = " + n * i);
  }

  void sortMap(Map<String, Integer> map) {
    List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
    Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
    //    list.sort(Comparator.comparing(Map.Entry::getValue));

    for (Map.Entry entry : list) System.out.println(entry.getKey() + " " + entry.getValue());
  }

  void inOrder(TreeNode root) {
    if (root != null) {
      inOrder(root.left);
      System.out.print(root.data + " ");
      inOrder(root.right);
    }
  }

  int countNodes(TreeNode root) {
    if (root == null) return 0;
    int left = countNodes(root.left);
    int right = countNodes(root.right);
    return left + 1 + right;
  }

  int height(TreeNode root) {
    if (root == null) return 0;
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);
    return 1 + Math.max(leftHeight, rightHeight);
  }

  void coinChange(int[] coins, int sum, String path) {
    if (sum >= 0) {
      if (sum == 0) System.out.println(path);
      else {
        for (int i = 0; i < coins.length; i++) coinChange(coins, sum - coins[i], path + coins[i]);
      }
    }
  }

  void randomize(int arr[], int n) {
    Random r = new Random();
    for (int i = n - 1; i > 0; i--) {

      int j = r.nextInt(i);

      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }

  /**
   * Print all numbers less than n, with the fact that absolute difference between any adjacent
   * digits should be 1.for e.g. 12, 21, 34, 43….121,12321. *
   */
}
