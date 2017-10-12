/**
 * Created by tracysaber on 2017-10-12.
 * Divide two integers without using multiplication, division and mod operator.

 If it is overflow, return MAX_INT.
 */
public class Leet_29 {
    public int divide(int dividend, int divisor) {
        if(((dividend>0)&&(divisor<0))||(dividend < 0) && (divisor>0))
            return -divide(-dividend,divisor);
        if(Math.abs(dividend)<Math.abs(divisor))
            return 0;
        else
            return 1+divide(Math.abs(dividend-divisor),Math.abs(divisor));
    }
    public static void main(String args[]){
        int a = new Leet_29().divide(1,-1);
        System.out.println(5/-2);
    }
}
