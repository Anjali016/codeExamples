package com.company.www.utils.autoCheck;

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
          System.out.println(p.data);
        } else p = p.ptr[c - 'A'];
      }
    }
  }

  public boolean isLeaf(TrieNode node) {
    for (TrieNode n : node.ptr) if (n != null) return false;
    return true;
  }

  public List<String> rootToAllLeaf(TrieNode node, String soFar) {
    if (isLeaf(node)) {
      list.add(soFar);
      return list;
    }
    for (int i = 0; i < 26; i++) {
      if (node.ptr[i] != null) {
        soFar = soFar + node.ptr[i].data;
        rootToAllLeaf(node.ptr[i], soFar);
      }
    }
    return null;
  }

  public TrieNode LevelContains(TrieNode node, int key) {
    for (int i = 0; i < 26; i++) {
      if (node.ptr[i].data == key) return node;
    }
    return null;
  }

  public void autoSuggest(String input) {

    //  autoSuggest(node,"AB");
  }

  public ArrayList<String> autoSuggest(TrieNode root, String input){

    for(char c : input.toCharArray()){
      for(TrieNode p : root.ptr)
        if(p.data == c)
          root = root.ptr[c-'A'];

    }
      /*if(input.length() == 0 || isLeaf(root))  (input + rootToAllLeaf());
      for(int i = 0 ; i<input.length();i++){
          if ( LevelContains(root, input.charAt(i)) != null )
                  root =  LevelContains(root,input.charAt(i));
          else return input;
      }*/

      return null;
  }
}
