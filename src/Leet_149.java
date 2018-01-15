import java.util.HashMap;

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
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        for(int i =0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){

            }
        }
    }
    public String getK(Point a,Point b){
        if(a.x==b.x)   return "=="+a.x;
        else{
            return  String.valueOf((b.y=b.x)/(a.x-b.x));
        }
    }
}
