/**
 * Compare two version numbers version1 and version2.
 If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

 You may assume that the version strings are non-empty and contain only digits and the . character.
 The . character does not represent a decimal point and is used to separate number sequences.
 For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

 Here is an example of version numbers ordering:

 0.1 < 1.1 < 1.2 < 13.37
 */
public class Leet_165 {
	public int compareVersion(String version1, String version2) {
		String v1s[] = version1.split("\\.");
		String v2s[] = version2.split("\\.");
		int epochs = Math.max(v1s.length,v2s.length);
		for(int i=0;i<epochs;i++){
			int v1 ,v2;
			if(i>=v1s.length )	v1=0;
			else v1=Integer.valueOf(v1s[i]);
			if(i>=v2s.length )	v2=0;
			else v2=Integer.valueOf(v2s[i]);
			if(v1>v2)	return 1;
			if(v1<v2)	return -1;
		}
		return 0;
	}
	public static void main(String args[]){
		System.out.print(new Leet_165().compareVersion("1","1.0.0.1"));
	}
}
