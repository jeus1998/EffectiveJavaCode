package com.example.effectivejavacode._03.item10._03_transitivity;

public class ColorPoint extends Point{
    private final Color color;
    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Point)) return false;

        // o가 Point 타입이라면 색상을 무시한다.
        if(!(o instanceof ColorPoint)) return o.equals(this);

        return super.equals(o) && ((ColorPoint) o ).color == this.color;
    }
    public static void main(String[] args) {
        ColorPoint p1 = new ColorPoint(1, 2, Color.GREEN);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.RED);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p2.equals(p3)); // true
        System.out.println(p1.equals(p3)); // false
    }
}
