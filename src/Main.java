import java.util.*;
class point{
    int x;
    int y;
    public point(int x,int y){
        this.x=x;this.y=y;
    }
}
public class Main{
    public boolean isSq(point a[]){
        boolean flag = true;
        double sum = Math.pow(a[0].x-a[1].x,2)+Math.pow(a[0].y-a[1].y,2);
        for(int i=2;i<4;i++){
            if(sum!=Math.pow(a[0].x-a[i].x,2)+Math.pow(a[0].y-a[i].y,2))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int  n = scan.nextInt();
        point points[][] = new point [n][4];
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                points[i][j].x = scan.nextInt();
            }
            for(int j=0;j<4;j++){
                points[i][j].y = scan.nextInt();
            }
        }
        for(int i=0;i<n;i++){

        }

        System.out.println();
    }
}