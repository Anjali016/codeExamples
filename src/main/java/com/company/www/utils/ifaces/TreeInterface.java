package com.company.www.utils.ifaces;

import com.company.www.utils.Tree;
import com.company.www.utils.TreeNode;

import javax.transaction.TransactionRequiredException;

public interface TreeInterface<T> {


  public TreeNode constructTree(int index,T[] array);


  public void insertion(T Object);

  public void deletion(T data);

  public void depth();

  public int size(TreeNode node);

  public void getInorder(TreeNode root);

  public void getPostOrder(TreeNode root);

  public void getPreOrder(TreeNode root);
}
