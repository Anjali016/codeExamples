package com.company.www.bst;

import com.company.www.utils.TreeNode;

public class BSTExamples {


  /**Find the closest element in Binary Search Tree **/
  /*int closest(TreeNode root, int k){
    TreeNode result = new TreeNode(-1);
    closest(root, k, result);
    return (int)result.data;
  }*/


  TreeNode closest(TreeNode root, int k, TreeNode currentClosest){
    if(root == null) return currentClosest ;
    if(currentClosest == null || currentClosest !=null &&
            Math.abs((int)root.data - k) < Math.abs((int)currentClosest.data - k)){
      currentClosest = root;
    }
    if(currentClosest.data == root.data) return root;
    else if((int)root.data < k)  return closest(root.right, k, currentClosest);
    else{
      currentClosest = root;
      return closest(root.left, k, currentClosest);
    }
  }






  /** Floor Ceil Value Node: Node with smallest data larger than or equal to key value. */
  TreeNode findCeil(TreeNode root, int key){
    if (root == null) return new TreeNode(-1);
    if ((int) root.data == key) return root;
    if ((int) root.data < key) return findCeil(root.right, key);
    TreeNode result = findCeil(root.left, key);
    return ((int) result.data >= key) ? result : root;
  }
}
