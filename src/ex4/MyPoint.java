package ex4;

import static java.lang.Math.*;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getR() {
        return sqrt((x * x) + (y * y));
    }

    public double getTheta() {
        return atan2(y, x) * 180.d / PI;
    }

    public double distance(MyPoint anotherPoint) {
        int x2 = anotherPoint.getX();
        int y2 = anotherPoint.getY();
        int dx = x2 - x;
        int dy = y2 - y;
        return sqrt(dx * dx + dy * dy);
    }

    public boolean equals(MyPoint aPoint) {
        boolean ans;
        ans = (getX() == aPoint.getX()) && (getY() == aPoint.getY());
        return ans;
    }

    public String toString() {
        return "a MyPoint(" + getX() + ", " + getY() + ")";
    }
}
