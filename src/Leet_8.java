/**
 * Implement atoi to convert a string to an integer.

 Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

 Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.

 Update (2015-02-10):
 The signature of the C++ function had been updated. If you still see your function signature accepts a const char * argument, please click the reload button  to reset your code definition.
 */
public class Leet_8 {
    public int myAtoi(String str) {
        str=str.trim();
        if(str.length()==0)
            return 0;
        int sign =1;
        int start=0;
        if(str.charAt(0)=='-') {
            sign = -1;
            start++;
        }
        else if(str.charAt(0)=='+') {
            sign=1;
            start++;
        }
        long sum=0;
        for(int i=start;i<str.length();i++){
            char a=str.charAt(i);
            if(!Character.isDigit(a)){
                return (int) sum * sign;
            }
            sum=sum*10+(a-'0') ;

            if(sum>Integer.MAX_VALUE&&sign>0){
                return Integer.MAX_VALUE;
            }
            if((-1)*sum<Integer.MIN_VALUE&&sign<0){
                return Integer.MIN_VALUE;
            }

        }
        return (int)sum * sign;
    }
    public static void main(String args[]){
        String s ="    10522545459";
        System.out.println(new Leet_8().myAtoi(s));
    }
}
