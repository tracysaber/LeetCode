import java.util.HashMap;

/**
 * Created by tracysaber on 2018-7-25.
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

 The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

 Example 1:

 Input: J = "aA", S = "aAAbbbb"
 Output: 3
 Example 2:

 Input: J = "z", S = "ZZ"
 Output: 0
 Note:

 S and J will consist of letters and have length at most 50.
 The characters in J are distinct.

 */
public class Leet_771 {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character,Integer> stones = new HashMap<Character,Integer>();
        for(int i=0;i<S.length();i++){
            Character now = S.charAt(i);
            if(!stones.containsKey(now)){
                stones.put(now,1);
            }
            else{
                stones.put(now,stones.get(now)+1);
            }
        }
        int result = 0;
        for(int i=0;i<J.length();i++)
        {
            Character now = J.charAt(i);
            if(stones.containsKey(now))
                result += stones.get(now);
        }
        return result;
    }
    public static void main(String args[]){
        String J = "aA", S = "aAAbbbb";
        System.out.print(new Leet_771().numJewelsInStones(J,S));
    }
}
