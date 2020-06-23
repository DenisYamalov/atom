package ru.atom.geometry;
/**
 * Template class for
 */

public class Point implements Collider /* super class and interfaces here if necessary */ {
    // fields
    // and methods
    private int coordinateX;
    private int coordinateY;

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }
    /**
     * @param o - other object to check equality with
     * @return true if two points are equal and not null.
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        // cast from Object to Point
        Point point = (Point) o;
        // your code here
        return (point.coordinateX == this.coordinateX) && (point.coordinateY == this.coordinateY);
    }

    @Override
    public boolean isColliding(Collider other) {
        if (other.equals(this)) {
            return true;
        }
        return false;
    }
}
