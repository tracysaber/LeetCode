/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.
 */
public class Leet_125 {
	public boolean isPalindrome(String s) {
		if(s.length()==0)	return true;
		int i=0,j = s.length()-1;
		while(i<=j){
			char ci = Character.toLowerCase(s.charAt(i));
			char cj = Character.toLowerCase(s.charAt(j));
			if(Character.isLetter(ci)||Character.isDigit(ci)){
				if(Character.isLetter(cj)||Character.isDigit(cj)){
					if(ci!=cj)	return false;
					i++;
					j--;
				}
				else j--;
			}
			else i++;
		}
		return true;
	}
	public static void main(String args[]){
		System.out.println(new Leet_125().isPalindrome("0P"));
	}
}
