package com.company.www.bst;

import com.company.www.utils.TreeNode;

public class BSTExamples {

  /** Floor Ceil Value Node: Node with smallest data larger than or equal to key value. */
  TreeNode findCeil(TreeNode root, int key){
    if (root == null) return new TreeNode(-1);
    if ((int) root.data == key) return root;
    if ((int) root.data < key) return findCeil(root.right, key);
    TreeNode result = findCeil(root.left, key);
    return ((int) result.data >= key) ? result : root;
  }
}
