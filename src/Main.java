import java.lang.reflect.Array;
import java.util.*;

public class Main{
//    public boolean judge(String a){
//        Stack<Character> stack = new Stack<Character>();
//        stack.push('(');
//        stack.push('(');
//        for(int i=0;i<a.length();i++){
//            char now = a.charAt(i);
//            if(now=='('){
//                stack.push(now);
//            }
//            if(now==')'){
//                if(stack.isEmpty()){
//                    return false;
//                }
//                else
//                    stack.pop();
//            }
//        }
//        if(stack.size()==2)
//            return true;
//        else
//            return false;
//    }
    public static void main(String args[]){
//        Scanner scan = new Scanner(System.in);
//        int  t = scan.nextInt();
//        String s[] =new String[t];
//        for(int i=0;i<t;i++){
//            s[i]=scan.next();
//        }
//        for(int i=0;i<t;i++){
//            if(new Main().judge(s[i]))
//                System.out.println("Yes");
//            else
//                System.out.println("No");
//        }
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        String names [] ={"Alice", "Bob", "Cathy", "Dave"};
//        int max = 4;
//        while(n>max){
//            n = n-max;
//            max = max<<1;
//        }
//        max = max>>2;
//        double count = Math.ceil(n/(double)max);
//        System.out.print(names[(int)count-1]);
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int m = scan.nextInt();
//        int r[][] = new int[n][n];
//        for(int i=0;i<m;i++){
//            String vote = scan.next();
//            for(int j =0;j<n;j++){
//                for(int k=j+1;k<n;k++){
//                    if(vote.charAt(j)<vote.charAt(k)){
//                        r[j][k]++;
//                        r[k][j]--;
//                    }
//                    if(vote.charAt(j)>vote.charAt(k)){
//                        r[j][k]--;
//                        r[k][j]++;
//                    }
//                }
//                //result[j][vote.charAt(j)-'a']++;
//            }
//        }
//        boolean flag= false;
//        for(int i=0;i<n;i++){
//            boolean a =true;
//            for(int j=0;j<n;j++){
//                if(i!=j&&r[i][j]<=0) {
//                    a = false;
//                    break;
//                }
//            }
//            if(a){
//                System.out.print(i);
//                flag = true;
//                break;
//            }
//        }
//        if(!flag)
//            System.out.print("-1");

        Scanner scan = new Scanner(System.in);
        int h[] = new int[1024];
        int i=0;
        while(scan.hasNext()){
            h[i++] = scan.nextInt();
        }
        Arrays.sort(h, 0, i);
        List<int> l =Arrays.asList(h);
        List<Integer> list = new LinkedList<Integer>();
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        int low=0,high = i-1;
        int nums =0;
        while(h[low]==100){
            low++;
        }
        nums = low/3;
        low = 3*nums;
        while(low<high){
            if(h[low]+h[high]>300) {
                nums++;
                high--;
            }
            else{
                nums++;
                high--;
                low++;
            }
        }
        if(low==high)
            System.out.print(++nums);
        else
            System.out.print(nums);
    }
}