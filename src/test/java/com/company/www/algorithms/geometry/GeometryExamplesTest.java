package com.company.www.algorithms.geometry;

import com.company.www.utils.Coordinates;
import org.junit.Test;
import sun.plugin.dom.core.CoreConstants;


import static org.junit.Assert.*;

public class GeometryExamplesTest {
  @Test
  public void areIntersect() throws Exception {
    Coordinates a = new Coordinates(10, 0);
    Coordinates b = new Coordinates(0,10);
    Coordinates p = new Coordinates(0,0);
    Coordinates q = new Coordinates(10,10);
    System.out.println(new GeometryExamples().areIntersect(a,b,p,q));
  }

  @Test
  public void findOrientation() throws Exception {
    Coordinates a = new Coordinates(0,0);
    Coordinates b = new Coordinates(0,4);
    Coordinates c = new Coordinates(4,0);
    System.out.println(new GeometryExamples().findOrientation(a, b, c));
  }
}