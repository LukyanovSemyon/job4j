package ru.job4j.oop;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point ap, Point bp, Point cp) {
        this.a = ap;
        this.b = bp;
        this.c = cp;
    }

    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc)/2;
    }

    public boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public double area() {
        double rsl = 1;
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        double p = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            /* написать формулу для расчета площади треугольника. */
            rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return rsl;
    }
}
