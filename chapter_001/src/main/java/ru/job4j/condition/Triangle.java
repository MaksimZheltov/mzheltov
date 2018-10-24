package ru.job4j.condition;

/**
 * @author Maksim Zheltov (mvzheltov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double period(double ab, double ac, double bc) {
        return ((ab + ac + bc) / 2);
    }

    public double area() {
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if (ab + ac > bc) {
            return Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return -1;
    }

}

