package com.bot;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nurgalievtr.18 on 10.04.2017.
 */
public class Point extends JPanel {
    public int x;
    public int y;
    public Point(){
        x=0;
        y=0;}

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString() {
        return "("+ x + ";" + y +')';
    }
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,5,5);
        g.setColor(Color.red);
    }
}
