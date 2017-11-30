import java.util.LinkedList;
import java.util.List;

/**
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.

 For example:
 Given "25525511135",

 return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 */
public class Leet_93 {
	public List<String> restoreIpAddresses(String s) {
		List<String> result = new LinkedList<String>();
		int len = s.length();
		for(int i =1;i<4&&i<len-2;i++){
			for(int j =i+1;j<i+4&&j<len-1;j++){
				for(int k = j+1;k<j+4&&k<len;k++){
					String s1=s.substring(0,i),s2=s.substring(i,j),s3=s.substring(j,k),s4=s.substring(k);
					if(isIP(s1)&&isIP(s2)&&isIP(s3)&&isIP(s4)){
						result.add(s1+"."+s2+"."+s3+"."+s4);
					}
				}
			}

		}
		return result;
	}
	public boolean isIP(String ip){
		if(ip.length()<1||ip.length()>3||(ip.charAt(0)=='0'&&ip.length()>1)||Integer.parseInt(ip)>255){
			return false;
		}
		else
			return true;
	}
	public static void main(String args[]){
		List<String> r = new Leet_93().restoreIpAddresses("25525511135");
	}
}
