/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.

 Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

 Example 1:
 nums1 = [1, 3]
 nums2 = [2]

 The median is 2.0
 Example 2:
 nums1 = [1, 2]
 nums2 = [3, 4]

 The median is (2 + 3)/2 = 2.5

 */
public class Leet_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count=nums1.length+nums2.length;
        int num[]=new int [count];
        int rank=0,i=0,j=0;
        if(count%2==0){
            while((rank<=(count/2))&&(i<nums1.length)&&(j<nums2.length)){
                if(nums1[i]>=nums2[j]){
                    num[rank]=nums2[j];
                    j++;
                }
                else{
                    num[rank]=nums1[i];
                    i++;
                }
                rank++;
            }
            if(i==nums1.length){
                for(;rank<=(count/2);rank++){
                    num[rank]=nums2[j];
                    j++;
                }
            }
            if(j==nums2.length){
                for(;rank<=(count/2);rank++){
                    num[rank]=nums1[i];
                    i++;
                }
            }
            return (float)(num[count/2]+num[count/2-1])/2;
        }
        else{
            while((rank<=(count/2))&&(i<nums1.length)&&(j<nums2.length)){
                if(nums1[i]>=nums2[j]){
                    num[rank]=nums2[j];
                    j++;
                }
                else{
                    num[rank]=nums1[i];
                    i++;
                }
                rank++;
            }
            if(i==nums1.length){
                for(;rank<=(count/2);rank++){
                    num[rank]=nums2[j];
                    j++;
                }
            }
            if(j==nums2.length){
                for(;rank<=(count/2);rank++){
                    num[rank]=nums1[i];
                    i++;
                }
            }
            return (float)num[count/2];
        }
    }
}
