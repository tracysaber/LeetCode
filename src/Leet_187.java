import java.util.*;

/**
 * All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

 Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

 For example,

 Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",

 Return:
 ["AAAAACCCCC", "CCCCCAAAAA"].

 */
public class Leet_187 {
	public List<String> findRepeatedDnaSequences(String s) {
		List<String > result = new LinkedList<String>();
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<s.length()-9;i++){
			String temp = s.substring(i,i+10);
			if(map.containsKey(temp)){
				if(map.get(temp)==1)	result.add(temp);
				map.put(temp,map.get(temp)+1);
			}
			else	map.put(temp,1);
		}
		return result;
	}
	public static void main(String args[]){
		String s="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		List<String > a = new Leet_187().findRepeatedDnaSequences(s);
	}
}
