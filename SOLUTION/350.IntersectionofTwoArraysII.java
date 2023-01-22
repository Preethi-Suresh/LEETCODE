/*
350. Intersection of Two Arrays II
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
*/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0;
        while(i<n1 && j<n2)
        {
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                nums1[k++]=nums1[i];
                ++i;++j;
            }
        }        
        int arr[]=new int[k];
        for(i=0;i<k;i++){
            arr[i]=nums1[i];
        }
        return arr; 
    }
}
