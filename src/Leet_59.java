/**
 * Created by tracysaber on 2017-11-3.
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

 For example,
 Given n = 3,

 You should return the following matrix:
 [
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
 ]

 */
public class Leet_59 {
    public int[][] generateMatrix(int n) {
        if(n==0)
            return new int[0][0];
        else {
            int result[][] = new int[n][n];
            genMatrix(result,0,n,1);
            return result;
        }
    }
    public void genMatrix(int a[][],int index,int num,int first){
        if(num==1) {
            a[index][index] = first;
            return ;
        }
        for(int i=0;i<num-1;i++){
            a[index][index+i]=first++;
        }
        for(int i=0;i<num-1;i++){
            a[index+i][index+num-1]=first++;
        }
        for(int i=0;i<num-1;i++){
            a[index+num-1][index+num-1-i]=first++;
        }
        for(int i=0;i<num-1;i++){
            a[index+num-1-i][index]=first++;
        }
        if(num-2>0)
            genMatrix(a,++index,num-2,first);
        else
            return;
    }
    public static void main(String args[]){
        int a[][] = new Leet_59().generateMatrix(3);
    }
}
