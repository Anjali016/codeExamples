package com.company.www.test;

import com.company.www.utils.TreeNode;

import java.util.*;

class Practice {
  /** Largest * */
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
    int left = countNodes(root.left) ;
    int right = countNodes(root.right);
    return left + 1 + right;
  }

  int height(TreeNode root){
    if(root == null) return 0;
     int leftHeight = height(root.left);
     int rightHeight = height(root.right);
     return 1 + Math.max(leftHeight,rightHeight);
  }

}
