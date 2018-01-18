/**
 * Given an input string, reverse the string word by word.

 For example,
 Given s = "the sky is blue",
 return "blue is sky the".

 Update (2015-02-12):
 For C programmers: Try to solve it in-place in O(1) space.
 */
public class Leet_151 {
	public String reverseWords(String s) {
		String words[] = s.trim().split("\\s+");
		StringBuilder result = new StringBuilder();
		for(int i=words.length-1;i>0;i--){
			result.append(words[i]);
			result.append(" ");
		}
		result.append(words[0]);
		return result.toString();
	}
	public static void main(String args[]){
		System.out.print(new Leet_151().reverseWords("   a   b "));
	}
}
