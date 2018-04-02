import java.util.*;
public class Main3 {
	public static void num(int a,Stack<Character> result){
		if(result.size()==a){
			boolean first = true;
			for(Character c:result){
				if(first){
					if(c!='0'){
						first = !first;
						System.out.print(c);
					}
				}
				else
					System.out.print(c);
			}
			System.out.println();
			return ;
		}
		else{
			for(int i=0;i<10;i++){
				result.push((char)(i+48));
				num(a,result);
				result.pop();
			}
		}
	}
	public static void main(String args[]){
		int n=3;
		Stack<Character> re = new Stack<Character>();
		num(n,re);
	}
}
