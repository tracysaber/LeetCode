
//public class Main2 {
//	public static boolean check(String a,String sub){
//		int sub_length = sub.length();
//		if(a.length()%sub_length!=0)	return false;
//		int epoch = a.length()/sub_length;
//		for(int i=0;i<epoch;i++){
//			if(!sub.equals(a.substring(sub_length*i,sub_length*i+sub_length)))
//				return false;
//		}
//		return true;
//	}
//	public static void main(String args[]){
//		Scanner scan = new Scanner(System.in);
//		String a = scan.next();
//		//StringBuilder sub = new StringBuilder(a.charAt(0));
//		String result="";
//		boolean flag = false;
//		for(int i=0;i<(a.length()/2);i++){
//			String sub = a.substring(0,i+1);
//			if(check(a,sub)){
//				flag = true;
//				result =sub;
//			}
//		}
//		System.out.print(flag?result:"false");
//	}
//}
import java.util.*;
public class Main2 {
	public  void build(List<String> re,String now,int left,int right){
		if(left==0&&right==0){
			re.add(now);
		}
		else{
			if(left>0)	{
				now=now+"(";
				build(re,now,left-1,right);
				now=now.substring(0,now.length()-1);
			}
			if(right>0&&right>left){
				now=now+")";
				build(re,now,left,right-1);
			}

		}
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<String> result = new LinkedList<String>();
		new Main2().build(result,"",n,n);
		for(Iterator<String> it = result.iterator();it.hasNext();) {
			System.out.print(it.next());
			if(it.hasNext())
				System.out.print(",");
		}

	}
}