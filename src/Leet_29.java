/**
 * Created by tracysaber on 2017-10-12.
 * Divide two integers without using multiplication, division and mod operator.

 If it is overflow, return MAX_INT.
 */
public class Leet_29 {
    public int divide(int dividend, int divisor) {
        if(divisor==0)
            return Integer.MAX_VALUE;
        int fuhao =0 ;
        if(((dividend>0)&&(divisor<0))||(dividend < 0) && (divisor>0))
            fuhao=-1;
        else
            fuhao=1;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        long re =fuhao>0?ldivide(ldividend,ldivisor):0-ldivide(ldividend,ldivisor);
        if(re>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(re<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else
            return (int) re;
    }
    private long ldivide(long ldividend, long ldivisor) {
        // Recursion exit condition
        if (ldividend < ldivisor) return 0;

        //  Find the largest multiple so that (divisor * multiple <= dividend),
        //  whereas we are moving with stride 1, 2, 4, 8, 16...2^n for performance reason.
        //  Think this as a binary search.
        long sum = ldivisor;
        long multiple = 1;
        while ((sum+sum) <= ldividend) {
            sum += sum;
            multiple += multiple;
        }
        //Look for additional value for the multiple from the reminder (dividend - sum) recursively.
        return multiple + ldivide(ldividend - sum, ldivisor);
    }
    public static void main(String args[]){
        int a = new Leet_29().divide(-2147483648,-1);
        System.out.println(5/-2);
    }
}
