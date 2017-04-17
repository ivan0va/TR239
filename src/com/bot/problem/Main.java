package com.bot.problem;

/**
 * Created by ivanovama.18 on 17.04.2017.
 */
import java.util.Scanner;
public class Main {
    public static void main(String args[ ]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point [] a = new Point[n];
        for(int i=0;i<n;i++) {
            a[i] = new Point(sc.nextDouble(), sc.nextDouble());
        }
        double maxPerimeter = 0;
        Point max1=new Point();
        Point max2=new Point();
        Point max3=new Point();
        Point max4=new Point();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int t = k + 1; t < n; t++) {

                        Square s = new Square(a[i], a[j], a[k], a[t]);
                        if ( s.areSidesEqual() && s.areNotOnOneLine()) {
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

        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
        System.out.println(max4);      }}