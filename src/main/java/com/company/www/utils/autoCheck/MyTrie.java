package com.company.www.utils.autoCheck;

import com.company.www.utils.MyTrieNode;

import java.util.ArrayList;

public class MyTrie {
  private MyTrieNode root;

  public MyTrie() {
    root = new MyTrieNode();
  }

  void addDictionary(ArrayList<String> dictionary) {

    for (String s : dictionary) addWordToTrie(s);
  }

  void addWordToTrie(String word) {
    MyTrieNode p = root;
    for (char c : word.toCharArray()) {
      if (p.childrens[c - 'a'] == null) {
        p.childrens[c - 'a'] = new MyTrieNode();
        p.childrens[c - 'a'].ch = c;
        p = p.childrens[c - 'a'];
      } else p = p.childrens[c - 'a'];
    }
    p.isEnd = true;
  }

  ArrayList<String> suggestWords(String prefix) {
    ArrayList<String> words = new ArrayList<>();
    MyTrieNode p = root;
    for (char c : prefix.toCharArray()) {
      if (p.childrens[c - 'a'] != null) p = p.childrens[c - 'a'];
      else return words;
    }
    getWords(p, prefix,  words);
    return words;
  }

  void getWords(MyTrieNode p, String soFar, ArrayList<String> result) {
    if (p.isEnd) result.add(soFar);
    else
      for (MyTrieNode child : p.childrens)
        if(child != null) getWords(child,soFar +child.ch, result);

  }


  boolean isContains(String word) {
    MyTrieNode p = root;
    for (char c : word.toCharArray())
      if (p.childrens[c - 'a'] != null) p = p.childrens[c - 'a'];
      else return false;

    if (p.isEnd) return true;
    else return false;
  }

}
