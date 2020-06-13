package ru.atom.geometry;

public class Bar {
    int firstCornerX;
    int firstCornerY;
    int secondCornerX;
    int secondCornerY;

    public Bar(int firstCornerX, int firstCornerY, int secondCornerX, int secondCornerY) {
        this.firstCornerX = firstCornerX;
        this.firstCornerY = firstCornerY;
        this.secondCornerX = secondCornerX;
        this.secondCornerY = secondCornerY;
    };

    public Bar() {};

    @Override
    public boolean equals(Object obj) {
        Bar bar = (Bar) obj;
        if (this.firstCornerX == bar.firstCornerX && this.firstCornerY == bar.firstCornerY &&
                this.secondCornerX == bar.secondCornerX && this.secondCornerY == bar.secondCornerY) return true;
        if (this.firstCornerX == bar.secondCornerX && this.firstCornerY == bar.secondCornerY &&
                this.secondCornerX == bar.firstCornerX && this.secondCornerY == bar.firstCornerY) return true;
        if (getClass() != bar.getClass()) return false;
        return firstCornerX == bar.firstCornerX && firstCornerY == bar.firstCornerY && secondCornerX == bar.secondCornerX && secondCornerY == bar.secondCornerY;
    };
};