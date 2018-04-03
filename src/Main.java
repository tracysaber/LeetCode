import java.util.*;

public class Main{
    public void subSet(Set<List<Integer>> re,int num[],int index){
        if(index ==num.length){
            return ;
        }
        else{
            Set<List<Integer>> temp = new TreeSet<List<Integer>>(new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> o1, List<Integer> o2) {
                    return o1.size()-o2.size();
                }
            });
            for(List<Integer> element:re){
                //temp.add(element);
                List<Integer> a = new LinkedList<Integer>(element);
                a.add(num[index]);
                temp.add(a);
            }
            re.addAll(temp);
            List<Integer> a = new LinkedList<Integer>();
            a.add(num[index]);
            re.add(a);
            subSet(re, num, ++index);
        }

    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        //int  n = scan.nextInt();
        int a[] ={123,456,789};
        Set<List<Integer>> result = new TreeSet<List<Integer>>(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.size()-o2.size();
            }
        });
        new Main().subSet(result,a,0);
        System.out.println();
    }
}