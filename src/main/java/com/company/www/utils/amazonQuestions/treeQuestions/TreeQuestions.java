package com.company.www.utils.amazonQuestions.treeQuestions;

import com.company.www.utils.TreeNode;

import java.util.ArrayList;

public class TreeQuestions {



























    /**
   * In a binary tree, chain is sum of length of the left node series, right node series, and 1.
   * Find the length of longest chain in the tree.*
   */

 /* int count = 0;

  int max = 0;

  public boolean isLeaf(TreeNode root) {
    return (root != null && (root.left == null && root.right == null));
  }

    int height(TreeNode root) {
        if (root == null) return 0;
        else return 1 + Math.max(height(root.left), height(root.right));
    }

    void maxChain(TreeNode root) {
        int h = height(root);
        int c = 0;
        for (int i = 0; i < h; i++) {
            //getleftSum(root, i);
            getrightSum(root, i);
        }
    System.out.println(c);
    }

     int getrightSum(TreeNode root, int level) {
         ArrayList<Integer> list = new ArrayList<>();
      if(root != null)
       if(level == 1) list.add((Integer) root.data);
        getleftSum(root.right,level-1);
        return list.size();

    }

    private void getleftSum(TreeNode root, int level) {
        if(root == null) return;
        if(level == 1) count = count + 1;
        else getleftSum(root.left,level-1);

    }
    *//* if(root == null) return 0;
    if (root != null) {
      if (isLeaf(root)) {
        max = Math.max(count, max);
        return count;
      } else count++;
      maximumChain(root.left);
      maximumChain(root.right);
      return max + 1;
    }
    return 0;
  }*/
}
