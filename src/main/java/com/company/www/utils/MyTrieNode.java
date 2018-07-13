package com.company.www.utils;

public class MyTrieNode {
  public char ch;
  public MyTrieNode[] childrens;
  public boolean isEnd;

  public MyTrieNode() {
    this.childrens = new MyTrieNode[26];
  }
}
