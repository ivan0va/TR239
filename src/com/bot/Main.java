package com.bot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Point> points = new ArrayList<Point>();
    public static void createGUI() {
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

        JLabel X1 = new JLabel("X1:");
        X1.setBounds(2,255,50,25);
        butPanel.add(X1);
        JLabel Y1 = new JLabel("Y1:");
        Y1.setBounds(45,255,50,25);
        butPanel.add(Y1);

        JLabel X2 = new JLabel("X2:");
        X2.setBounds(2,310,50,25);
        butPanel.add(X2);
        JLabel Y2 = new JLabel("Y2:");
        Y2.setBounds(45,310,50,25);
        butPanel.add(Y2);

        JLabel X3 = new JLabel("X3:");
        X3.setBounds(2,365,50,25);
        butPanel.add(X3);
        JLabel Y3 = new JLabel("Y3:");
        Y3.setBounds(45,365,50,25);
        butPanel.add(Y3);

        JLabel X4 = new JLabel("X4:");
        X4.setBounds(2,420,50,25);
        butPanel.add(X4);
        JLabel Y4 = new JLabel("Y4:");
        Y4.setBounds(45,420,50,25);
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
        x1.setBounds(20,255,25,25);
        butPanel.add(x1);
        final JTextField y1 = new JTextField();
        y1.setBounds(60,255,25
                ,25);
        butPanel.add(y1);
        final JTextField x2 = new JTextField();
        x2.setBounds(20,310,25,25);
        butPanel.add(x2);
        final JTextField y2 = new JTextField();
        y2.setBounds(60,310,25,25);
        butPanel.add(y2);
        final JTextField x3 = new JTextField();
        x3.setBounds(20,365,25,25);
        butPanel.add(x3);
        final JTextField y3 = new JTextField();
        y3.setBounds(60,365,25,25);
        butPanel.add(y3);
        final JTextField x4 = new JTextField();
        x4.setBounds(20,420,25,25);
        butPanel.add(x4);
        final JTextField y4 = new JTextField();
        y4.setBounds(60,420,25,25);
        butPanel.add(y4);





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
        button3.setBounds(2,200,180,40);
        butPanel.add(button3);
        button3.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("Добавлен квадрат");
            System.out.println("Точка 1: x =" + x1.getText() + ";" + "y=" + y1.getText());
            System.out.println("Точка 2: x =" + x2.getText() + ";" + "y=" + y2.getText());
            System.out.println("Точка 3: x =" + x3.getText() + ";" + "y=" + y3.getText());
            System.out.println("Точка 4: x =" + x4.getText() + ";" + "y=" + y4.getText());
        }
        }); }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI();
            }
        });
    }}
