import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
//        String ss[]=s.split(" ");
//        int m = Integer.valueOf(ss[0]).intValue();
//        int n = Integer.valueOf(ss[1]).intValue();
        int result =1;
        for(int i=0;i<n;i++){
            result *= m--;
        }
        System.out.println(result);
    }
}