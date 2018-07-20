package com.company.www.utils;

public class TrieNode {
  public final TrieNode[] ptr = new TrieNode[26];
  public final char data;

  public TrieNode(char c) {
    this.data = c;
  }
}
