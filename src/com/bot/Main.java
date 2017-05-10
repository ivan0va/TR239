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
        Answer.setBounds(2,255,900,40);
        butPanel.add(Answer);
            final JLabel Answer1 = new JLabel(" ");
            Answer1.setBounds(2,275,900,40);
            butPanel.add(Answer1);
            final JLabel Answer2 = new JLabel(" ");
            Answer2.setBounds(2,295,900,40);
            butPanel.add(Answer2);
            final JLabel Answer3 = new JLabel(" ");
            Answer3.setBounds(2,315,900,40);
            butPanel.add(Answer3);
            final JLabel Answer4 = new JLabel(" ");
            Answer4.setBounds(2,335,900,40);
            butPanel.add(Answer4);


        final JTextField x = new JTextField();
        x.setBounds(17,25, 25,25);
        butPanel.add(x);
        final JTextField y = new JTextField();
        y.setBounds(60,25, 25,25);
        butPanel.add(y);
        final JTextField n = new JTextField();
        n.setBounds(35,70,25,25);
        butPanel.add(n);

        JButton button4 = new JButton("Решить задачу");
        button4.setBounds(2,200,160,40);
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
                                if ( s.areSidesEqual1() ||  s.areSidesEqual2() || s.areSidesEqual3()
                                        && ((s.b.x-s.a.x)*(s.c.y-s.a.y)!= (s.b.y-s.a.y)*(s.c.x-s.a.x))
                                        && ((s.d.x-s.a.x)*(s.b.y-s.a.y)!= (s.d.y-s.a.y)*(s.b.x-s.a.x))
                                        && ((s.b.x-s.c.x)*(s.c.y-s.d.y)!= (s.b.y-s.c.y)*(s.c.x-s.d.x))
                                        && ((s.d.x-s.c.x)*(s.d.y-s.a.y)!= (s.d.y-s.c.y)*(s.d.x-s.a.x))) {
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
        frame.setVisible(true);}





    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI();
            }
        });
    }}
