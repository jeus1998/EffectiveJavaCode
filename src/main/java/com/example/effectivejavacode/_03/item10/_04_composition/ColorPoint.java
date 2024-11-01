package com.example.effectivejavacode._03.item10._04_composition;

public class ColorPoint {
    private final Point point;
    private final Color color;
    public ColorPoint(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = color;
    }
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof ColorPoint)) return false;
        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(this.point) && cp.color == this.color;
    }
    public static void main(String[] args) {
        ColorPoint p1 = new ColorPoint(1, 2, Color.BLUE);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.RED);

        System.out.println(p1.equals(p2)); // false
        System.out.println(p2.equals(p3)); // false
        System.out.println(p1.equals(p3)); // false
    }
}
