package com.company.www.collections;

import java.util.*;

public class CollectionExamples {

  /** Array List * */
  List<Integer> arrayList = new ArrayList<>();

  HashSet<Integer> set = new HashSet<>();

  void create(int element) {
    arrayList.add(element);
  }

  void read() {
    Iterator x = arrayList.listIterator(0);
    while (x.hasNext()) {
      System.out.print(x.next() + " ");
    }
    // arrayList.get(2);
    // for (int i : arrayList) System.out.print(i+" ");
  }

  void upDate(int value1, int value2) {
    arrayList.set(arrayList.indexOf(value1), value2);
  }

  void insertInToThis(int index, HashSet<Integer> set) {
    arrayList.addAll(4, set);
  }

  void delete(int element) {
    arrayList.remove(2);
    arrayList.remove(element);
  }

  /** Set * */
  void addToSet(int element) {
    set.add(element);
  }

  void removeFromSet(int element) {
    set.remove(element);
  }

  void filterSet(int element) {
    set.removeIf(i -> i % 2 == 0);
  }

  void readFromSet() {
    Iterator itr = set.iterator();
    while (itr.hasNext()) {
      System.out.println(itr);
    }
  }

  void deleteAll() {
    set.clear();
  }

  /** Queue.* */
  Queue<Integer> queue = new LinkedList<>();

  void addToQueue(int item) {
    queue.add(item);
  }

  /** HashMap * */
  Map<String, Integer> details = new HashMap<>();

  void addToMap(String key, int age) {
    details.put(key, age);
  }

  void readFromMap() {
    for (Map.Entry entry : details.entrySet())
      System.out.println(entry.getKey() + " " + entry.getValue());
  }

  void upDate(String updateKey, int updateValue) {
    details.put(updateKey, updateValue);
  }

  void deleteFromMap(String key) {
    details.remove(key);
  }

  void sortMapbyValue(HashMap<String, Integer> map) {
    List<Map.Entry<String, Integer>> list =
        new LinkedList<Map.Entry<String, Integer>>(map.entrySet());

    Collections.sort(
        list,
        new Comparator<Map.Entry<String, Integer>>() {
          @Override
          public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return o1.getValue().compareTo(o2.getValue());
          }
        });
  }
}
