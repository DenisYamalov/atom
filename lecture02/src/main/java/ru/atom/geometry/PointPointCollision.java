package ru.atom.geometry;

public class PointPointCollision extends Exception {

    public PointPointCollision() {
    }

    public PointPointCollision(String message) {
        super(message);
    }

    public PointPointCollision(String message, Throwable cause) {
        super(message, cause);
    }

    public PointPointCollision(Throwable cause) {
        super(cause);
    }

    public PointPointCollision(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
