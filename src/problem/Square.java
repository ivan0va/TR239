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
        //if ((Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y)) < (Math.sqrt((c.x - a.x)*(c.x - a.x) + (c.y - a.y)*(c.y - a.y)))
               // && Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y)) < (Math.sqrt((d.x - b.x)*(d.x - b.x) + (d.y - b.y)*(d.y - b.y)))||
                //(Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y)) > (Math.sqrt((c.x - a.x)*(c.x - a.x) + (c.y - a.y)*(c.y - a.y)))
               // && Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y)) > (Math.sqrt((d.x - b.x)*(d.x - b.x) + (d.y - b.y)*(d.y - b.y))) )) ){
        return ((Math.sqrt((c.x - a.x)*(c.x - a.x) +(c.y - a.y)*(c.y - a.y))
                ==(Math.sqrt ((b.x - d.x)*(b.x - d.x) + (b.y - d.y)*(b.y - d.y))))
                &&(Math.sqrt((c.x - b.x)*(c.x - b.x) + (c.y - b.y)*(c.y - b.y))
                ==(Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y))))
                &&(Math.sqrt((a.x - d.x)*(a.x - d.x) + (a.y - d.y)*(a.y - d.y))
                ==(Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y))))
        ); }
    public boolean areSidesEqual2() {
      // if ((Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y)) < (Math.sqrt((d.x - a.x)*(d.x - a.x) + (d.y - a.y)*(d.y - a.y)))
              // && Math.sqrt((b.x - c.x)*(b.x - c.x) + (b.y - c.y)*(b.y - c.y)) < (Math.sqrt((a.x - b.x)*(a.x - b.x) + (a.y - b.y)*(a.y - b.y))))
              // ||Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y)) > (Math.sqrt((d.x - a.x)*(d.x - a.x) + (d.y - a.y)*(d.y - a.y)))
              // && Math.sqrt((b.x - c.x)*(b.x - c.x) + (b.y - c.y)*(b.y - c.y)) > (Math.sqrt((a.x - b.x)*(a.x - b.x) + (a.y - b.y)*(a.y - b.y))))
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

   // public boolean areNotOnOneLine () {
        //double k1 = (a.y-b.y)/(a.x-b.x);
        //double b1 = k1*a.x-a.y;
        //double k2 = (a.y-c.y)/(a.x-c.x);
       // double b2 = k2*a.x-a.y;
       // double k3 = (a.y-d.y)/(a.x-d.x);
        //double b3 = k3*a.x-a.y;
       // return (((c.x*(a.y-b.y)/(a.x-b.x)+((a.y-b.y)/(a.x-b.x))*a.x-a.y != c.y)&&(d.x*(a.y-b.y)/(a.x-b.x)+((a.y-b.y)/(a.x-b.x))*a.x-a.y != d.y)
               // &&(d.x*(a.y-c.y)/(a.x-c.x)+((a.y-c.y)/(a.x-c.x))*a.x-a.y != d.y)&&(b.x*(a.y-c.y)/(a.x-c.x)+((a.y-c.y)/(a.x-c.x))*a.x-a.y != b.y)
               // &&(b.x*(a.y-d.y)/(a.x-d.x)+((a.y-d.y)/(a.x-d.x))*a.x-a.y != b.y)&&(c.x*(a.y-d.y)/(a.x-d.x)+((a.y-d.y)/(a.x-d.x))*a.x-a.y != c.y))?true:false); }


    public double getPerimeter() {
        return (areSidesEqual1()? (4*(Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y)))):
                (4*(Math.sqrt((c.x - a.x)*(c.x - a.x) + (c.y - a.y)*(c.y - a.y)))));
    }



}
