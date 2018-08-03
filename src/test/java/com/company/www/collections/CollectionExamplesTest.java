package com.company.www.collections;

import org.junit.Test;

import java.util.HashSet;

public class CollectionExamplesTest {
  @Test
  public void addToMap() throws Exception {
    col.addToMap("Tom",32);
    col.addToMap("Ana",39);
    col.addToMap("Ed",34);
    col.addToMap("Rob",22);
    col.upDate("Rob",100);
    col.deleteFromMap("Ed");
    col.readFromMap();

  }

    @Test
  public void insertInToThis() throws Exception {}

  CollectionExamples col = new CollectionExamples();

  @Test
  public void create() throws Exception {
    HashSet<Integer> set = new HashSet<>();
    set.add(3);
    set.add(9);
    set.add(8);

    col.create(34);
    col.create(23);
    col.create(22);
    col.create(29);
    col.read();
    System.out.println();
    col.upDate(22, 100);
    col.read();
    System.out.println();
    col.insertInToThis(4, set);
    col.read();
  }

  @Test
  public void read() throws Exception {}

  @Test
  public void upDate() throws Exception {}

  @Test
  public void delete() throws Exception {}

  @Test
  public void main() throws Exception {}
}
