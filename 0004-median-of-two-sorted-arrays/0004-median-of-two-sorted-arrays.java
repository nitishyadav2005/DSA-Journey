class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i=0, j=0, k=0;
        int merged[] = new int[m+n];
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                merged[k++] = nums1[i];
                i++;
            }
            else{
            merged[k++] = nums2[j];
            j++;
            }
        }
        while(i<m){
            merged[k++] = nums1[i];
            i++;
        }
        while(j<n){
            merged[k++] = nums2[j];
            j++;
        }
        int len = m+n;
        if((m+n) % 2 != 0){
            return merged[(len-1)/2];
        }
        else{
            return (merged[(len-1)/2] + merged[(len/2)])/2.0;
        }
    }
}