package ru.atom.geometry;

public class BarPointCollision extends Exception{

    public BarPointCollision() {
    }

    public BarPointCollision(String message) {
        super(message);
    }

    public BarPointCollision(String message, Throwable cause) {
        super(message, cause);
    }

    public BarPointCollision(Throwable cause) {
        super(cause);
    }

    public BarPointCollision(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
