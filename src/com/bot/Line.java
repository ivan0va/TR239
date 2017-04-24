package com.bot;
import com.bot.Point;

import javax.swing.*;
import java.awt.*;

public class Line extends JPanel {
    private Point a;
    private Point b;

    public Line(Point a, Point b){
        this.a = a;
        this.b = b;
    }


    public void paint(Graphics g){
        g.setColor(Color.PINK);
            g.drawLine(a.x, a.y, b.x, b.y);
        g.setColor(Color.red);
    }

}
