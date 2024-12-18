package com.example.effectivejavacode._03.item10._04_composition;

public class Point {
    private final int x;
    private final int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Point)) return false;
        Point p = (Point) o;
        return p.x == this.x && p.y == this.y;
    }
}
