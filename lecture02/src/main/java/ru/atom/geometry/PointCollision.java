package ru.atom.geometry;

public class PointCollision extends Point implements Collider {
    /* check if point1 equals point2*/
    public Point point1 = new Point(x , y);
    public Point point2 = new Point(x , y);
    @Override
    public boolean isColliding(Collider other) {
        if (point1.equals(point2)) return true;
        if (point1.equals(null)) return false;
        else return false;
        }

};
