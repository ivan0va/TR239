package com.bot;

import problem.Square;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Point> points = new ArrayList<Point>();
        private static ArrayList<Line> lines;
        public static void createGUI() {
            lines = new ArrayList<Line>();
        final JFrame frame = new JFrame("Testframe");
	    frame.setPreferredSize(new Dimension(700,700));
	    JPanel panel = new JPanel(new BorderLayout());
        Panel butPanel = new Panel();
        butPanel.setLayout(null);
        butPanel.setPreferredSize(new Dimension(250,700));
        final Panel pointpane   = new Panel();
        pointpane.setLayout(null);
        //pointpane.setPreferredSize(new Dimension(350,700));

	    JLabel addPointwithCoords = new JLabel("Добавить точку по координатам");
	    addPointwithCoords.setBounds(2,2,300,25);
	    butPanel.add(addPointwithCoords);
	    JLabel addRandomPoints = new JLabel("Добавить рандомное количество точек");
	    addRandomPoints.setBounds(2,50,300,25);
	    butPanel.add(addRandomPoints);
        JLabel addPointwithCoords1 = new JLabel("Добавить точку по координатам");
        addPointwithCoords.setBounds(2,2,300,25);
        butPanel.add(addPointwithCoords1);
        JLabel addPointwithCoords2 = new JLabel("Добавить точку по координатам");
        addPointwithCoords.setBounds(2,2,300,25);
        butPanel.add(addPointwithCoords2);
        JLabel addPointwithCoords3 = new JLabel("Добавить точку по координатам");
        addPointwithCoords.setBounds(2,2,300,25);
        butPanel.add(addPointwithCoords3);
        JLabel addPointwithCoords4 = new JLabel("Добавить точку по координатам");
        addPointwithCoords.setBounds(2,2,300,25);
        butPanel.add(addPointwithCoords4);
        JLabel X = new JLabel("X:");
        X.setBounds(2,25,15,25);
        butPanel.add(X);
        JLabel Y = new JLabel("Y:");
        Y.setBounds(45,25,15,25);
        butPanel.add(Y);
        JLabel N = new JLabel("NUM:");
        N.setBounds(2,70,30,25);
        butPanel.add(N);
        final JLabel Answer = new JLabel("Ответ:");
        Answer.setBounds(2,500,900,40);
        butPanel.add(Answer);
            final JLabel Answer1 = new JLabel(" ");
            Answer1.setBounds(2,520,900,40);
            butPanel.add(Answer1);
            final JLabel Answer2 = new JLabel(" ");
            Answer2.setBounds(2,540,900,40);
            butPanel.add(Answer2);
            final JLabel Answer3 = new JLabel(" ");
            Answer3.setBounds(2,560,900,40);
            butPanel.add(Answer3);
            final JLabel Answer4 = new JLabel(" ");
            Answer4.setBounds(2,580,900,40);
            butPanel.add(Answer4);

        JLabel X1 = new JLabel("X1:");
        X1.setBounds(2,255,20,25);
        butPanel.add(X1);
        JLabel Y1 = new JLabel("Y1:");
        Y1.setBounds(50,255,20,25);
        butPanel.add(Y1);

        JLabel X2 = new JLabel("X2:");
        X2.setBounds(2,310,20,25);
        butPanel.add(X2);
        JLabel Y2 = new JLabel("Y2:");
        Y2.setBounds(50,310,20,25);
        butPanel.add(Y2);

        JLabel X3 = new JLabel("X3:");
        X3.setBounds(2,365,20,25);
        butPanel.add(X3);
        JLabel Y3 = new JLabel("Y3:");
        Y3.setBounds(50,365,20,25);
        butPanel.add(Y3);

        JLabel X4 = new JLabel("X4:");
        X4.setBounds(2,420,20,25);
        butPanel.add(X4);
        JLabel Y4 = new JLabel("Y4:");
        Y4.setBounds(50,420,20,25);
        butPanel.add(Y4);

        final JTextField x = new JTextField();
        x.setBounds(17,25, 25,25);
        butPanel.add(x);
        final JTextField y = new JTextField();
        y.setBounds(60,25, 25,25);
        butPanel.add(y);
        final JTextField n = new JTextField();
        n.setBounds(35,70,25,25);
        butPanel.add(n);
        final JTextField x1 = new JTextField();
        x1.setBounds(22,255,25,25);
        butPanel.add(x1);
        final JTextField y1 = new JTextField();
        y1.setBounds(70,255,25
                ,25);
        butPanel.add(y1);
        final JTextField x2 = new JTextField();
        x2.setBounds(22,310,25,25);
        butPanel.add(x2);
        final JTextField y2 = new JTextField();
        y2.setBounds(70,310,25,25);
        butPanel.add(y2);
        final JTextField x3 = new JTextField();
        x3.setBounds(22,365,25,25);
        butPanel.add(x3);
        final JTextField y3 = new JTextField();
        y3.setBounds(70,365,25,25);
        butPanel.add(y3);
        final JTextField x4 = new JTextField();
        x4.setBounds(22,420,25,25);
        butPanel.add(x4);
        final JTextField y4 = new JTextField();
        y4.setBounds(70,420,25,25);
        butPanel.add(y4);


        JButton button4 = new JButton("Решить задачу");
        button4.setBounds(2,200,180,40);
        butPanel.add(button4);
        button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                double maxPerimeter = 0;
                Point max1=new Point();
                Point max2=new Point();
                Point max3=new Point();
                Point max4=new Point();

                for (int i = 0; i < points.size(); i++) {
                    for (int j = i + 1; j <  points.size(); j++) {
                        for (int k = j + 1; k < points.size(); k++) {
                            for (int t = k + 1; t < points.size(); t++) {
                                Point a = points.get(i);
                                Point b = points.get(j);
                                Point c = points.get(k);
                                Point d = points.get(t);

                                Square s = new Square(a, b, c, d);
                                if ( s.areSidesEqual1() ||  s.areSidesEqual2() || s.areSidesEqual3()) { //&& ((s.b.x-s.a.x)!= (s.c.y-s.a.y))&&((s.d.x-s.a.x)!= (s.b.y-s.a.y))) {
                                    if (s.getPerimeter() > maxPerimeter) {
                                        maxPerimeter = s.getPerimeter();
                                        max1 = new Point(s.a.x, s.a.y);
                                        max2 = new Point(s.b.x, s.b.y);
                                        max3 = new Point(s.c.x, s.c.y);
                                        max4 = new Point(s.d.x, s.d.y);
                                    }
                                }

                            }

                        }

                    }
                }
                Point a = new Point(max1.x, max1.y);
                points.add(a);
                a.setBounds(a.x, a.y,a.x + 3, a.y + 3);
                pointpane.add(a);
                pointpane.revalidate();
                pointpane.repaint();

                Point b = new Point(max2.x, max2.y);
                points.add(b);
                b.setBounds(b.x, b.y, b.x + 3, b.y + 3);
                pointpane.add(b);
                pointpane.revalidate();
                pointpane.repaint();

                Point c = new Point(max3.x, max3.y);
                points.add(c);
                c.setBounds(c.x, c.y, c.x + 3, c.y + 3);
                pointpane.add(c);
                pointpane.revalidate();
                pointpane.repaint();

                Point d = new Point(max4.x, max4.y);
                points.add(d);
                d.setBounds(d.x, d.y, d.x + 3, d.y + 3);
                pointpane.add(d);
                pointpane.revalidate();
                pointpane.repaint();

                Square s = new Square (a, b, c, d);

                if (s.areSidesEqual1() ){
                Line temp = new Line(a, b);
                lines.add(temp);
                pointpane.add(temp);
                temp.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                pointpane.revalidate();
                pointpane.repaint();
                Line temp1 = new Line(b, c);
                lines.add(temp1);
                pointpane.add(temp1);
                temp1.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                pointpane.revalidate();
                pointpane.repaint();
                Line temp2 = new Line(c, d);
                lines.add(temp2);
                pointpane.add(temp2);
                temp2.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                pointpane.revalidate();
                pointpane.repaint();
                Line temp3 = new Line(a, d);
                lines.add(temp3);
                pointpane.add(temp3);
                temp3.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                pointpane.revalidate();
                pointpane.repaint();}

                if (s.areSidesEqual2()){
                    Line temp = new Line(a, c);
                    lines.add(temp);
                    pointpane.add(temp);
                    temp.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                    pointpane.revalidate();
                    pointpane.repaint();
                    Line temp1 = new Line(b, c);
                    lines.add(temp1);
                    pointpane.add(temp1);
                    temp1.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                    pointpane.revalidate();
                    pointpane.repaint();
                    Line temp2 = new Line(b, d);
                    lines.add(temp2);
                    pointpane.add(temp2);
                    temp2.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                    pointpane.revalidate();
                    pointpane.repaint();
                    Line temp3 = new Line(a, d);
                    lines.add(temp3);
                    pointpane.add(temp3);
                    temp3.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                    pointpane.revalidate();
                    pointpane.repaint();}

                if (s.areSidesEqual3()){
                    Line temp = new Line(a, c);
                    lines.add(temp);
                    pointpane.add(temp);
                    temp.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                    pointpane.revalidate();
                    pointpane.repaint();
                    Line temp1 = new Line(d, c);
                    lines.add(temp1);
                    pointpane.add(temp1);
                    temp1.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                    pointpane.revalidate();
                    pointpane.repaint();
                    Line temp2 = new Line(b, d);
                    lines.add(temp2);
                    pointpane.add(temp2);
                    temp2.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                    pointpane.revalidate();
                    pointpane.repaint();
                    Line temp3 = new Line(a, b);
                    lines.add(temp3);
                    pointpane.add(temp3);
                    temp3.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                    pointpane.revalidate();
                    pointpane.repaint();}


                Answer.setText("Ответ:" + max1);
                Answer1.setText(" " + max2);
                Answer2.setText(" " + max3);
                Answer3.setText(" " + max4);
                Answer4.setText("Периметр:" + maxPerimeter);
            }
        });



        JButton button1 = new JButton("Добавить точку");
        button1.setBounds(2,100,160,40);
        butPanel.add(button1);
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int X = (!x.getText().equals("")?Integer.parseInt(x.getText()):0);
                int Y= (!y.getText().equals("")?Integer.parseInt(y.getText()):0);
                int N = (!n.getText().equals("")?Integer.parseInt(n.getText()):0);
                if ((X>0)&&(Y>0)) {
                    Point b = new Point(X, Y);
                    points.add(b);
                    b.setBounds(b.x,b.y,b.x+3,b.y+3);
                    pointpane.add(b);
                    pointpane.revalidate();
                    pointpane.repaint();
                }
                else {
                    if (N>0){
                        for (int i=0;i<N;i++){
                            Point b = new Point((int)(Math.random()*(frame.getWidth()-250)), (int)(Math.random()*frame.getHeight()));
                            points.add(b);
                            b.setBounds(b.x,b.y,b.x+3,b.y+3);
                            pointpane.add(b);
                            pointpane.revalidate();
                            pointpane.repaint();
                        }

                    }
                }

            }
        });



        JButton button2 = new JButton("очистить");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i=0;i<points.size();i++){
                    while(points.size() > 0) {
                        int index = points.size() - 1;
                        Point point = points.remove(index);
                        pointpane.remove(point);
                        Answer.setText("Ответ:");
                        Answer1.setText("");
                        Answer3.setText("");
                        Answer2.setText("");
                        Answer4.setText("");
                        pointpane.repaint();
                        pointpane.revalidate();
                    }
                }
                for (int i=0;i<lines.size();i++){
                    while(lines.size() > 0) {
                        int index = lines.size() - 1;
                        Line line = lines.remove(index);
                        pointpane.remove(line);
                        pointpane.repaint();
                        pointpane.revalidate();
                    }
                }

            }
        });
        button2.setBounds(2,150,160,40);
        butPanel.add(button2);
        panel.add(pointpane,BorderLayout.CENTER);
        panel.add(butPanel,BorderLayout.EAST);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);





    JButton button3 = new JButton("Добавить квадрат");
        button3.setBounds(2,460,180,40);
        butPanel.add(button3);
        button3.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            int X1 = (!x1.getText().equals("")?Integer.parseInt(x1.getText()):0);
            int Y1= (!y1.getText().equals("")?Integer.parseInt(y1.getText()):0);
            int X2 = (!x2.getText().equals("")?Integer.parseInt(x2.getText()):0);
            int Y2= (!y2.getText().equals("")?Integer.parseInt(y2.getText()):0);
            int X3 = (!x3.getText().equals("")?Integer.parseInt(x3.getText()):0);
            int Y3= (!y3.getText().equals("")?Integer.parseInt(y3.getText()):0);
            int X4 = (!x4.getText().equals("")?Integer.parseInt(x4.getText()):0);
            int Y4= (!y4.getText().equals("")?Integer.parseInt(y4.getText()):0);


            Point a = new Point (X1, Y1);
            Point b = new Point (X2, Y2);
            Point c = new Point (X3, Y3);
            Point d = new Point (X4, Y4);
            Square s = new Square(a, b, c, d);
            if (s.areSidesEqual1() ||  s.areSidesEqual2() || s.areSidesEqual3() ) {
                    //if ( ((X1-X2)!= 0) && ((Y1-Y2)!= 0)  &&((X3-X1)/(X2-X1)!=(Y3-Y1)/(Y2-Y1))&&((X4-X1)/(X2-X1)!=(Y4-Y1)/(Y2-Y1))||(((X1-X2)== 0) && ((Y1-Y2)== 0) )) {
                Point b1 = new Point(X1, Y1);
                points.add(b1);
                b1.setBounds(b1.x, b1.y, b1.x + 3, b1.y + 3);
                pointpane.add(b1);
                pointpane.revalidate();
                pointpane.repaint();
                Point b2 = new Point(X2, Y2);
                points.add(b2);
                b2.setBounds(b2.x, b2.y, b2.x + 3, b2.y + 3);
                pointpane.add(b2);
                pointpane.revalidate();
                pointpane.repaint();
                Point b3 = new Point(X3, Y3);
                points.add(b3);
                b3.setBounds(b3.x, b3.y, b3.x + 3, b3.y + 3);
                pointpane.add(b3);
                pointpane.revalidate();
                pointpane.repaint();
                Point b4 = new Point(X4, Y4);
                points.add(b4);
                b4.setBounds(b4.x, b4.y, b4.x + 3, b4.y + 3);
                pointpane.add(b4);
                pointpane.revalidate();
                pointpane.repaint();
                Point b5 = new Point(X4, Y4);


                Line temp = new Line(b1, b2);
                lines.add(temp);
                pointpane.add(temp);
                temp.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                pointpane.revalidate();
                pointpane.repaint();
                Line temp1 = new Line(b3, b2);
                lines.add(temp1);
                pointpane.add(temp1);
                temp1.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                pointpane.revalidate();
                pointpane.repaint();
                Line temp2 = new Line(b4, b3);
                lines.add(temp2);
                pointpane.add(temp2);
                temp2.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                pointpane.revalidate();
                pointpane.repaint();
                Line temp3 = new Line(b1, b4);
                lines.add(temp3);
                pointpane.add(temp3);
                temp3.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                pointpane.revalidate();
                pointpane.repaint();
                Line temp4 = new Line(b1, b3);
                lines.add(temp2);
                pointpane.add(temp2);
                temp2.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                pointpane.revalidate();
                pointpane.repaint();
                Line temp5 = new Line(b2, b4);
                lines.add(temp3);
                pointpane.add(temp3);
                temp3.setBounds(2, 2, frame.getWidth(), frame.getHeight());
                pointpane.revalidate();
                pointpane.repaint();


                System.out.println("Добавлен квадрат");
                System.out.println("Точка 1: x =" + x1.getText() + ";" + "y=" + y1.getText());
                System.out.println("Точка 2: x =" + x2.getText() + ";" + "y=" + y2.getText());
                System.out.println("Точка 3: x =" + x3.getText() + ";" + "y=" + y3.getText());
                System.out.println("Точка 4: x =" + x4.getText() + ";" + "y=" + y4.getText());
                System.out.println("Периметр:" + s.getPerimeter());
            }
            else
                System.out.println ("hi");
        }
        });}




    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI();
            }
        });
    }}
