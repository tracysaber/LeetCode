/**
 *Reverse digits of an integer.

 Example1: x = 123, return 321
 Example2: x = -123, return -321
 */
public class Leet_7 {
    public int reverse(int x) {
        boolean flag=false;
        String s;
        if(x<0){
            flag=true;
            s=String.valueOf(x);
            s=s.substring(1, s.length());
        }
        else{
            s=String.valueOf(x);
        }

        if(((x%10>2)||(x%10<-2))&&s.length()==10)
            return 0;
        else{
            while(s.substring(s.length()-1, s.length()-1).equals('0')){
                s=s.substring(0, s.length()-1);
            }
            StringBuffer bu=new StringBuffer();
            bu.append(s);
            bu.reverse();
            s=bu.toString();
            try{
                if(flag)
                    return -Integer.valueOf(s).intValue();
                else
                    return Integer.valueOf(s).intValue();}
            catch(NumberFormatException e){
                return 0;
            }
        }

    }
}
