package com.bot.problem;

/**
 * Created by ivanovama.18 on 17.04.2017.
 */
public class Square {
    Point  a;
    Point  b;
    Point  c;
    Point  d;
    Square(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }


    boolean areSidesEqual() {
        return ((Math.sqrt((c.x - a.x)*(c.x - a.x) +(c.y - a.y)*(c.y - a.y))
                ==(Math.sqrt ((b.x - d.x)*(b.x - d.x) + (b.y - d.y)*(b.y - d.y))))
                &&(Math.sqrt((c.x - b.x)*(c.x - b.x) + (c.y - b.y)*(c.y - b.y))
                ==(Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y)))
                && (Math.sqrt((c.x - d.x)*(c.x - d.x) + (c.y - d.y)*(c.y - d.y))
                ==(Math.sqrt((a.x - b.x)*(a.x - b.x) + (a.y - b.y)*(a.y - b.y)))))?true:false); }

    boolean areNotOnOneLine () {
        double k1 = (a.y-b.y)/(a.x-b.x);
        double b1 = k1*a.x-a.y;
        double k2 = (a.y-c.y)/(a.x-c.x);
        double b2 = k2*a.x-a.y;
        double k3 = (a.y-d.y)/(a.x-d.x);
        double b3 = k3*a.x-a.y;
        return ((c.x*k1+b1 != c.y)&&(d.x*k1+b1 != d.y)
                &&(d.x*k2+b2 != d.y)&&(b.x*k2+b2 != b.y)
                &&(b.x*k3+b3 != b.y)&&(c.x*k3+b3 != c.y)?true:false); }


    double getPerimeter() {
        return (4*(Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y))));
    }



}
