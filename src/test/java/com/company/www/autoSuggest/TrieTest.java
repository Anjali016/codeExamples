package com.company.www.autoSuggest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TrieTest {

  private Trie trie = new Trie();

  @Test
  public void autoSuggest() throws Exception {
    trie.constructTrie(getDictionary());
    List<String> words = trie.autoSuggest("A");
    words.forEach(System.out::println);
  }

  @Test
  public void constructTrie() throws Exception {
    Trie trie = new Trie();
    trie.constructTrie(getDictionary());
  }

  @Test
  public void rootToAllLeaf() throws Exception {}

  private List<String> getDictionary() {
    List<String> dictionary = new ArrayList<>();
    dictionary.add("ABHISHEK");
    dictionary.add("ABHAY");
    dictionary.add("ANJALI");
    dictionary.add("AYUSH");
    return dictionary;
  }
}
