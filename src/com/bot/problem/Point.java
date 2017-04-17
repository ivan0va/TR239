package com.bot.problem;

/**
 * Created by ivanovama.18 on 17.04.2017.
 */
public class Point {
    double x;
    double y;
    Point(){
        x=0;
        y=0;}


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+ x + ";" + y +')';
    } }
