/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.

 For example:

 1 -> A
 2 -> B
 3 -> C
 ...
 26 -> Z
 27 -> AA
 28 -> AB
 */
public class Leet_168 {
	public String convertToTitle(int n) {
//		StringBuilder result = new StringBuilder();
//		if(n<=26)	result.append((char)(n+65));
//		else{
//			int a = (n-26)/26;
//			int b = (n-26)%26;
//			while()
//		}
//
//		if(a!=0) result.append((char)(a+64));
//		result.append((char)(b+65));
//		return result.toString();
		return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
	}
	public static void main(String args[]){
		System.out.print(new Leet_168().convertToTitle(703));
	}
}
