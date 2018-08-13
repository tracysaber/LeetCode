
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
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class time{
	String from;
	String to;
	public time(String f,String t){
		this.from = f;
		this.to = t;
	}
}
public class Main2 {
	public static void main(String args[]){
		Scanner scan  = new Scanner(System.in);
		int t = scan.nextInt();
		ArrayList<time> ts[] = new ArrayList[7];
		for (int i=0;i<t;i++){
			int k = scan.nextInt();
			for(int j=0;j<k;j++){
				int day = scan.nextInt();
				int nums = scan.nextInt();
				for(int jj=0;jj<nums;jj++){
					
				}
			}
		}
	}
}