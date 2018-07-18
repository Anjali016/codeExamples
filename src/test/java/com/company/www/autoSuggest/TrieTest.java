package com.company.www.autoSuggest;

import org.junit.Test;

import java.util.ArrayList;

public class TrieTest {
  @Test
  public void autoSuggest() throws Exception {
    /*ArrayList<String> words = new ArrayList<>();
    words.add("abhishek");
    words.add("mongoshake");
    words.add("anjali");
    words.add("mamta");*/
    trie.constructTrie();
    ArrayList<String> result = trie.autoSuggest("AX");
    result.forEach(word -> System.out.println(word));

  }

  Trie trie = new Trie();


  @Test
  public void constructTrie() throws Exception {
    Trie trie = new Trie();
    trie.constructTrie();
  }

  @Test
  public void rootToAllLeaf() throws Exception {}
}
