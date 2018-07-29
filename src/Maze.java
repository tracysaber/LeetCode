import java.util.Scanner;

/**
 * Created by tracysaber on 2018-7-29.
 */
public class Maze {
    int m;
    int n;
    String str;
    String mazeText;
    public Maze(String input){
        mazeText = new String();
        Scanner sc = new Scanner(input);
        String mn =sc.nextLine();
        try {
            String[] num = mn.split(" ");
            if(num.length!=2) {
                System.out.println("Incorrect command format.");
                return;
            }
            if(num[0].length()>10||num[1].length()>10) {
                System.out.println("Number out of range.");
                return;
            }
            m=Integer.parseInt(num[0]);
            n=Integer.parseInt(num[1]);
            if(m<=0 || n<=0) {
                System.out.println("Number out of range.");
                return;
            }
        } catch (Exception e) {
            System.out.println("Invalid number format.");
            return;
        }
        try {
            str =sc.nextLine();
        } catch (Exception e) {
            System.out.println("Incorrect command format.");
            return;
        }
    }
    public String Render(){
        try {
            int[][] res=new int[2*m+1][2*n+1];
            for(int i=0;i<2*m+1;i++)
                for(int j=0;j<2*n+1;j++)
                    res[i][j]=0;
            for(int i=0;i<m;i++)
                for(int j=0;j<n;j++)
                    res[2*i+1][2*j+1]=1;

            int tmp=0;
            try {
                String[] fields = str.split(";");
                for(int i=0;i<fields.length;i++) {
                    String field=fields[i];
                    //field = 0,1 0,2;
                    String[] group = field.split(" ");
                    //group[0] = 0,1
                    if(group.length!=2) {
                        System.out.println("Incorrect command format.");
                        return mazeText;
                    }
                    String[] data1 = group[0].split(",");
                    //data=0,1
                    if(data1.length!=2) {
                        System.out.println("Incorrect command format.");
                        return mazeText;
                    }
                    int x1=Integer.parseInt(data1[0]);
                    int y1=Integer.parseInt(data1[1]);
                    String[] data2 = group[1].split(",");
                    int x2=Integer.parseInt(data2[0]);
                    int y2=Integer.parseInt(data2[1]);

                    if(x1<0 ||x2<0 ||y1<0 ||y2<0) {
                        System.out.println("Number out of range.");
                        return mazeText;
                    }

                    //System.out.println("x1y1x2y2   "+x1+y1+x2+y2);
                    if(x1==x2&&Math.abs(y1-y2)==1) {
                        tmp=Math.min(y1,y2);
                        res[2*x1+1][2*tmp+2]=1;
                    }else if(Math.abs(x1-x2)==1&&y1==y2) {
                        tmp=Math.min(x1,x2);
                        res[2*tmp+2][2*y1+1]=1;
                    }else {
                        System.out.println("Maze format error.");
                        return mazeText;
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid number format.");
                return mazeText;
            }

            for(int i=0;i<2*m+1;i++) {
                for(int j=0;j<2*n+1;j++) {
                    if(res[i][j]==0) {
                        if(j!=2*n)
                            System.out.print("[W] ");
                        else
                            System.out.println("[W]");
                    }

                    if(res[i][j]==1)
                        System.out.print("[R] ");
                }
            }
        } catch (Exception e) {
            System.out.println("Number out of range.");
            return mazeText;
        }
        return mazeText;
    }
    public static void main(String[] args) {
        String s="3 3\n" +
                "0,1 0,2;0,0 1,0;0,1 1,1;0,2 1,2;1,0 1,1;1,1 1,2;1,1 2,1;1,2 2,2;2,0 2,1";
        Maze mz = new Maze(s);
        System.out.print(mz.Render());
    }
}
