/**
 * Given a roman numeral, convert it to an integer.

 Input is guaranteed to be within the range from 1 to 3999.
 */
public class Leet_13 {
	public int romanToInt(String s) {
		String roman[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int number[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
		int result=0;
		for(int i=0;i<roman.length;i++){
			while (s.length()>=roman[i].length()&&s.substring(0,roman[i].length()).equals(roman[i])){
				s = s.substring(roman[i].length());
				result+=number[i];
			}
		}
		return result;
	}
	public static void main(String []args){
		System.out.println(new Leet_13().romanToInt("MMI"));
	}
}
