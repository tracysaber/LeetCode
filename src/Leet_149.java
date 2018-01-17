import org.jcp.xml.dsig.internal.dom.DOMUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by tracysaber on 2018-1-15.
 * Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.
 */
class Point {
         int x;
         int y;
         Point() { x = 0; y = 0; }
         Point(int a, int b) { x = a; y = b; }
     }
public class Leet_149 {
    public int maxPoints(Point[] points) {
        if(points.length==0)    return 0;
        //HashMap<String,Set<Point>> map = new HashMap<String, Set<Point>>();
        int max=1;
        for(int i =0;i<points.length;i++){
            HashMap<Double,Integer> map = new HashMap<Double, Integer>();
            int numVertical=1,local=1,duplicate=0;
            for(int j=i+1;j<points.length;j++){
                //String key = getK(points[i],points[j]);
                if(points[i].x==points[j].x){
                    if(points[i].y==points[j].y) // duplicate
                        duplicate++;
                    else // vertical
                        numVertical++;
                }
                else {
                    double slope =(double) (points[i].y-points[j].y)/(points[i].x-points[j].x);
                    map.put(slope,map.containsValue(slope)?map.get(slope)+1:2);
                    local= Math.max(local,map.get(slope));
                }
                local = Math.max(local+duplicate,numVertical+duplicate);
                max = Math.max(max,local);
            }
        }
        return max;
    }
    public String getK(Point a,Point b){
        if(a.x==b.x)   return "+"+a.x;
        else{
            double k = (double) (b.y-a.y)/(b.x-a.x);
            double h = (double) a.y- k* a.x;
            return  k+"+"+h;
        }
    }
    public String getKandB(Point a,Point b){
        if(a.x==b.x)   return "+"+a.x;
        else{
            double k = (double) (b.y-a.y)/(b.x-a.x);
            double h = (double) a.y- k* a.x;
            return  k+"+"+h;
        }
    }
    public static void main(String args[]){
        Point points[] = new Point[9];
        points[0]=new Point(0,0);
        points[1]=new Point(84,250);
        points[2]=new Point(1,0);
        points[3]=new Point(0,-70);
        points[4]=new Point(1,-1);
        points[5]=new Point(21,10);
        points[6]=new Point(42,90);
        points[7]=new Point(-42,-230);
        points[8]=new Point(0,-70);
        System.out.println(new Leet_149().maxPoints(points));
    }
}
