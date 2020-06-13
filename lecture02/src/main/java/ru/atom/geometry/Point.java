package ru.atom.geometry;
/**
 * Template class for
 */
public class Point /* super class and interfaces here if necessary */ {
    // fields
    // and methods
    public int x;
    public int y;
  public Point(int x, int y) {
          this.x=x;
          this.y=y;
          }
          public Point(){};
    /**
     * @param obj - other object to check equality with
     * @return true if two points are equal and not null.
     */
    @Override
    public boolean equals(Object obj) {
        Point point = (Point) obj;
        //return x == point.x && y == point.y;
        if (this.x == point.x && this.y == point.y) return true;
        if (getClass() != point.getClass()) return false;
        /*
         cast from Object to Point
        Point point = (Point) obj;
        */
        return x == point.x && y == point.y;

        // your code here
    }
          //throw new PointCollision();
};
