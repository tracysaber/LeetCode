/**
 * Created by tracysaber on 2018-2-8.
 * The demons had captured the princess (P) and imprisoned her in the bottom-right corner of a dungeon. The dungeon consists of M x N rooms laid out in a 2D grid. Our valiant knight (K) was initially positioned in the top-left room and must fight his way through the dungeon to rescue the princess.

 The knight has an initial health point represented by a positive integer. If at any point his health point drops to 0 or below, he dies immediately.

 Some of the rooms are guarded by demons, so the knight loses health (negative integers) upon entering these rooms; other rooms are either empty (0's) or contain magic orbs that increase the knight's health (positive integers).

 In order to reach the princess as quickly as possible, the knight decides to move only rightward or downward in each step.


 Write a function to determine the knight's minimum initial health so that he is able to rescue the princess.

 For example, given the dungeon below, the initial health of the knight must be at least 7 if he follows the optimal path RIGHT-> RIGHT -> DOWN -> DOWN.

 -2 (K)	-3	3
 -5	-10	1
 10	30	-5 (P)

 Notes:

 The knight's health has no upper bound.
 Any room can contain threats or power-ups, even the first room the knight enters and the bottom-right room where the princess is imprisoned.
 */
public class Leet_174 {
    public int calculateMinimumHP(int[][] dungeon) {
        int result [][] = new int [dungeon.length][dungeon[0].length];
        int now [][] = new int [dungeon.length][dungeon[0].length];
        result[0][0] = now[0][0] = dungeon[0][0];
        for(int i=1;i<dungeon[0].length;i++){
            now[0][i]=dungeon[0][i-1]+dungeon[0][i];
            result[0][i] = Math.min(now[0][i],now[0][i-1]);
        }
        for(int i=1;i<dungeon.length;i++){
            now[i][0]=dungeon[i-1][0]+dungeon[i][0];
            result[i][0] = Math.min(now[i][0],now[i-1][0]);
        }
        for(int i=1;i<dungeon.length;i++){
            for(int j=1;j<dungeon[0].length;j++){
                //dungeon[i][j]=Math.max(dungeon[i][j-1],dungeon[i-1][j]);
                now[i][j] = Math.max(result[i-1][j],result[i][j-1])+dungeon[i][j];
                //result[i][j] = Math.max(Math.min(result[i-1][j],now[i-1][j]+dungeon[i][j]),);
            }
        }
        return result[result.length-1][result[0].length-1];
    }
    public static void main(String args[]){
        int a[][]={{-2,-3,3},{-5,-10,1},{10,30,-5}};
        System.out.println(new Leet_174().calculateMinimumHP(a));
    }
}
