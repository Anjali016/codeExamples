package com.company.www.autoSuggest;

import com.company.www.utils.TrieNode;

import java.util.ArrayList;
import java.util.List;

class Trie {

  private TrieNode root = new TrieNode('$');

  void constructTrie(List<String> dictionary) {
    for (String str : dictionary) {
      TrieNode itr = root;
      for (char ch : str.toCharArray()) {
        int position = ch - 'A';
        if (itr.ptr[position] == null) {
          itr.ptr[position] = new TrieNode(ch);
          itr = itr.ptr[position];
        } else itr = itr.ptr[position];
      }
    }
  }

  List<String> autoSuggest(String input) {
    List<String> word = new ArrayList<>();
    TrieNode p = root;
    for (char c : input.toCharArray()) {
      if (p.ptr[c - 'A'] != null) p = p.ptr[c - 'A'];
      else return word;
    }
    getWord(p, input, word);
    return word;
  }

  private void getWord(TrieNode p, String soFar, List<String> result) {
    if (isLeaf(p)) result.add(soFar);
    else for (TrieNode child : p.ptr) if (child != null) getWord(child, soFar + child.data, result);
  }

  boolean isLeaf(TrieNode node) {
    for (TrieNode n : node.ptr) if (n != null) return false;
    return true;
  }
}
