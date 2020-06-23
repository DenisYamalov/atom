package ru.atom.geometry;

public class Bar implements Collider {
    private Point firstCorner;
    private Point secondCorner;

    private Point topLeft;
    private Point topRight;
    private Point bottomLeft;
    private Point bottomRight;

    public Bar(int firstCornerX, int firstCornerY, int secondCornerX, int secondCornerY) {
        firstCorner = new Point(firstCornerX, firstCornerY);
        secondCorner = new Point(secondCornerX, secondCornerY);

        setCorners();
    }

    private void setCorners() {
        if (firstCorner.getCoordinateY() >= secondCorner.getCoordinateY()) { // top
            if (firstCorner.getCoordinateX() >= secondCorner.getCoordinateX()) { // topRight
                topRight = firstCorner;
                bottomLeft = secondCorner;
                topLeft = new Point(bottomLeft.getCoordinateX(), topRight.getCoordinateY());
                bottomRight = new Point(topRight.getCoordinateX(), bottomLeft.getCoordinateY());
            } else { // topLeft
                topLeft = firstCorner;
                bottomRight = secondCorner;
                topRight = new Point(bottomRight.getCoordinateX(), topLeft.getCoordinateY());
                bottomLeft = new Point(topLeft.getCoordinateX(), bottomRight.getCoordinateY());
            }
        } else { // bottom
            if (firstCorner.getCoordinateX() >= secondCorner.getCoordinateX()) { // bottomRight
                bottomRight = firstCorner;
                topLeft = secondCorner;
                bottomLeft = new Point(topLeft.getCoordinateX(), bottomRight.getCoordinateY());
                topRight = new Point(bottomRight.getCoordinateX(), topLeft.getCoordinateY());
            } else {  // bottomLeft
                bottomLeft = firstCorner;
                topRight = secondCorner;
                bottomRight = new Point(topRight.getCoordinateX(), bottomLeft.getCoordinateY());
                topLeft = new Point(bottomLeft.getCoordinateX(), topRight.getCoordinateY());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bar bar = (Bar) o;
        return (topLeft.equals(bar.topLeft) && topRight.equals(bar.topRight)
                && bottomLeft.equals(bar.bottomLeft) && bottomRight.equals(bar.bottomRight));
    }

    @Override
    public boolean isColliding(Collider other) {
        if (other.getClass() == Point.class) {
            Point point = (Point) other;
            return (point.getCoordinateX() >= topLeft.getCoordinateX()
                    && point.getCoordinateX() <= bottomRight.getCoordinateX())
                    && (point.getCoordinateY() >= bottomLeft.getCoordinateY()
                    && point.getCoordinateY() <= topLeft.getCoordinateY());
        }

        if (other.getClass() == Bar.class) {
            Bar bar = (Bar) other;

            // thanks geeksforgeeks.org!
            // if one bar is on the left side of other
            if (bar.topLeft.getCoordinateX() > bottomRight.getCoordinateX()
                    || topLeft.getCoordinateX() > bar.bottomRight.getCoordinateX()) {
                return false;
            }

            // if one bar is above other
            if (bar.topLeft.getCoordinateY() < bottomRight.getCoordinateY()
                    || topLeft.getCoordinateY() < bar.bottomRight.getCoordinateY()) {
                return false;
            }
            return true;

        } // if bar.class
        return false;
    }
}