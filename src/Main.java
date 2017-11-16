import java.util.Scanner;

/**
 * Created by tracysaber on 2017-11-15.
 */
public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            boolean flag =true;
            int i=0,j=0;
            if(str.length()>0)
                j=str.length()-1;
            while (i<j&&flag!=false){
                char chari=str.charAt(i);
                char charj=str.charAt(j);

                if(!Character.isDigit(chari)&&!Character.isLetter(chari)) {
                    i++;
                }
                if(!Character.isDigit(str.charAt(j))&&!Character.isLetter(str.charAt(j))) {
                    j--;
                }
                if((Character.isDigit(chari)||Character.isLetter(chari))&&(Character.isDigit(charj)||Character.isLetter(charj))){
                    if(Character.toLowerCase(chari)!=Character.toLowerCase(charj))
                        flag=false;
                    i++;
                    j--;
                }
            }
            System.out.println(flag);
        }
    }
}
