import java.util.*;

/**
 * Created by tracysaber on 2018-4-1.
 */
public class Main4 {
    public static void main(String args[]){
        String s="abbcccddeefffggghh";
        int n=2;
        StringBuilder sub = new StringBuilder(s.charAt(0));
        int length = 1,i=1;
        for(;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                sub.append(s.charAt(i));
                length++;
            }
            else{
                if(length==n){
                    System.out.printf("(%d,%d,%s)",i-n+1,i,sub.toString());
                }
                sub.setLength(0);
                sub.append(s.charAt(i));
                length = 1;
            }
       }
        if(length==n){
            System.out.printf("(%d,%d,%s)",i-n+1,i,sub.toString());
        }
//        Scanner scanner = new Scanner(System.in);
//        //int n = scanner.nextInt();
//        int scoreArr[]={1,1,-1,5,-9};
//        int result = scoreArr[0];
//        int maxResult = scoreArr[0];
//        for (int i = 1; i < scoreArr.length; i++) {
//            result += scoreArr[i];
//            // ���֮����ڽ��ֵ��ע����Ҫ����ȫ�Ǹ��������
//            if (result > maxResult) {
//                // �Ƚ��Ƿ�������ֵmaxResult
//                maxResult = result;
//            }else {
//                if (result < 0) {
//                    // ���������ӵĽ��С��0������С��maxResult������Ӵ������ֵ��ȷ��������
//                    result = 0;//����
//                }
//            }
//        }
        //return maxResult;
        //System.out.print(maxResult);



    }
}
