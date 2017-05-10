package problem;
import com.bot.Point;
/**
 * Created by ivanovama.18 on 17.04.2017.
 */
public class Square {
    public Point  a;
    public  Point  b;
    public Point  c;
    public Point  d;
    public Square(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }


   public boolean areSidesEqual1() {
        return ((Math.sqrt((c.x - a.x)*(c.x - a.x) +(c.y - a.y)*(c.y - a.y))
                ==(Math.sqrt ((b.x - d.x)*(b.x - d.x) + (b.y - d.y)*(b.y - d.y))))
                &&(Math.sqrt((c.x - b.x)*(c.x - b.x) + (c.y - b.y)*(c.y - b.y))
                ==(Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y))))
                &&(Math.sqrt((a.x - d.x)*(a.x - d.x) + (a.y - d.y)*(a.y - d.y))
                ==(Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y))))
        ); }
    public boolean areSidesEqual2() {
       return ((Math.sqrt((c.x - a.x) * (c.x - a.x) + (c.y - a.y) * (c.y - a.y))
                   == (Math.sqrt((b.x - c.x) * (b.x - c.x) + (b.y - c.y) * (b.y - c.y))))
                   && (Math.sqrt((c.x - d.x) * (c.x - d.x) + (c.y - d.y) * (c.y - d.y))
                   == (Math.sqrt((b.x - a.x) * (b.x - a.x) + (b.y - a.y) * (b.y - a.y))))
                   &&(Math.sqrt((c.x - b.x)*(c.x - b.x) + (c.y - b.y)*(c.y - b.y))
                   ==(Math.sqrt((b.x - d.x)*(b.x - d.x) + (b.y - d.y)*(b.y - d.y)))));

       }
       public boolean areSidesEqual3() {
           return ((Math.sqrt((d.x - a.x) * (d.x - a.x) + (d.y - a.y) * (d.y - a.y))
                   == (Math.sqrt((b.x - c.x) * (b.x - c.x) + (b.y - c.y) * (b.y - c.y))))
                   && (Math.sqrt((c.x - d.x) * (c.x - d.x) + (c.y - d.y) * (c.y - d.y))
                   == (Math.sqrt((b.x - d.x) * (b.x - d.x) + (b.y - d.y) * (b.y - d.y))))
                   &&(Math.sqrt((d.x - b.x)*(d.x - b.x) + (d.y - b.y)*(d.y - b.y))
                   ==(Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y)))));
       }


    public double getPerimeter() {
        return (areSidesEqual1()? (4*(Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y)))):
                (4*(Math.sqrt((c.x - a.x)*(c.x - a.x) + (c.y - a.y)*(c.y - a.y)))));
    }



}
