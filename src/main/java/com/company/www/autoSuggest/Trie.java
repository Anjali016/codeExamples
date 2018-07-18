package com.company.www.autoSuggest;

import com.company.www.utils.TrieNode;

import java.util.ArrayList;
import java.util.List;

public class Trie {

  TrieNode node = new TrieNode();
  List<String> list = new ArrayList<>();

  TrieNode root = new TrieNode();

  // TrieNode root = new TrieNode();

  public void constructTrie() {
    List<String> dictionary = new ArrayList<>();
    dictionary.add("ABHISHEK");
    dictionary.add("ABHAY");
    dictionary.add("ANJALI");
    dictionary.add("AYUSH");

    for (String str : dictionary) {
      TrieNode p = root;
      for (char c : str.toCharArray()) {
        if (p.ptr[c - 'A'] == null) {
          p.ptr[c - 'A'] = new TrieNode();
          p.ptr[c - 'A'].data = c;
          p = p.ptr[c - 'A'];
        } else p = p.ptr[c - 'A'];
      }
      p.isEnd = true;
    }
  }

  public ArrayList<String> autoSuggest(String input) {
    ArrayList<String> word = new ArrayList<>();
    TrieNode p = root;
    for (char c : input.toCharArray()) {
      if (p.ptr[c - 'A'] != null) p = p.ptr[c - 'A'];
      else return word;
    }
    getWord(p, input, word);
    return word;
  }

  private void getWord(TrieNode p, String soFar, ArrayList<String> result) {
    if (p.isEnd) result.add(soFar);
    else for (TrieNode child : p.ptr) if (child != null) getWord(child, soFar + child.data, result);
  }

  public boolean isLeaf(TrieNode node) {
    for (TrieNode n : node.ptr) if (n != null) return false;
    return true;
  }
}
