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

    /**
     * Вычислить полупериметр по длинам сторон.
     * (ab + ac + bc) / 2
     * @param ab расстояние между точками a b
     * @param ac расстояние между точками a c
     * @param bc расстояние между точками b c
     * @return Полупериметр.
     */
    public double period(double ab, double ac, double bc) {
        return ((ab + ac + bc) / 2);
    }

    /**
     * Вычислить площадь треугольника.
     * Если сумма длин любых двух сторон треугольника больше длины третьей стороны, треугольник существует.
     * @return Вернуть прощадь, если треугольник существует или -1, если треугольника нет.
     */
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

