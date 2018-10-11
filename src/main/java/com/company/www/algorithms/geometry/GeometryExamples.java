package com.company.www.algorithms.geometry;

import com.company.www.utils.Coordinates;

public class GeometryExamples {

  /** Compute the orientation of three points* */
  String findOrientation(Coordinates a, Coordinates b, Coordinates c) {
    int firstSlope = (b.y - a.y) * (c.x - a.x) - (b.x - a.x) * (c.y - a.y);
    if (firstSlope == 0) return "Clockwise";
    else if (firstSlope < 0) return " CounterClockWise";
    else return "collinear";
  }

  /** Check if two lines intersect each or other. * */
  boolean areIntersect(Coordinates a, Coordinates b, Coordinates p, Coordinates q) {
    int left = Orientation(p, q, a);
    int right = Orientation(p, q, b);
    int bottom = Orientation(a, b, p);
    int top = Orientation(a, b, q);
    return (left != right && top != bottom);
  }

  int Orientation(Coordinates a, Coordinates b, Coordinates c) {
    int firstSlope = (b.y - a.y) * (c.x - a.x) - (b.x - a.x) * (c.y - a.y);
    if (firstSlope > 0) return 1;
    else if (firstSlope < 0) return -1;
    else return 0;
  }
}
