package problem;
import com.bot.Point;

/**
 * Created by ivanovama.18 on 17.04.2017.
 */
import java.util.Scanner;
public class Main {
    public static void main(String args[ ]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point [] a = new com.bot.Point[n];
        for(int i=0;i<n;i++) {
            a[i] = new com.bot.Point(sc.nextInt(), sc.nextInt());
        }
        double maxPerimeter = 0;
        Point max1=new com.bot.Point();
        Point max2=new com.bot.Point();
        Point max3=new com.bot.Point();
        Point max4=new com.bot.Point();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int t = k + 1; t < n; t++) {

                        Square s = new Square(a[i], a[j], a[k], a[t]);
                        if ( s.areSidesEqual1() ||  s.areSidesEqual2() || s.areSidesEqual3()
                                && ((s.b.x-s.a.x)*(s.c.y-s.a.y)!= (s.b.y-s.a.y)*(s.c.x-s.a.x))
                                && ((s.d.x-s.a.x)*(s.b.y-s.a.y)!= (s.d.y-s.a.y)*(s.b.x-s.a.x))
                                && ((s.b.x-s.c.x)*(s.c.y-s.d.y)!= (s.b.y-s.c.y)*(s.c.x-s.d.x))
                                && ((s.d.x-s.c.x)*(s.d.y-s.a.y)!= (s.d.y-s.c.y)*(s.d.x-s.a.x))){
                            if (s.getPerimeter() > maxPerimeter) {
                                maxPerimeter = s.getPerimeter();
                                max1 = new com.bot.Point(s.a.x, s.a.y);
                                max2 = new com.bot.Point(s.b.x, s.b.y);
                                max3 = new com.bot.Point(s.c.x, s.c.y);
                                max4 = new com.bot.Point(s.d.x, s.d.y);
                            }
                        }

                    }

                }

            }
        }

        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
        System.out.println(max4);
        System.out.println(maxPerimeter);
    }}