/***
 * Related to question Excel Sheet Column Title

 Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 */
public class Leet_171 {
	public int titleToNumber(String s) {
		int len = s.length();
		int base =1,result=0;
		for(int i=len-1;i>=0;i--){
			int num = s.charAt(i)-'A'+1;
			result += (num*base);
			base *= 26;
		}
		return result;
	}
	public static void main(String args[]){
		System.out.print(new Leet_171().titleToNumber("AAA"));
	}
}
