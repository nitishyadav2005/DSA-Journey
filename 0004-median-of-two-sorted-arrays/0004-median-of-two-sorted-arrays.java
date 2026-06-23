import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size=nums1.length+nums2.length;
	        int[] num=new int[size];
	        int j=0;
	        int k=0;
			int i=0;

	        while(i<size)
	        {
	            while(j<nums1.length)
	            {
	                num[i++]=nums1[j++];
	            }
	             while(k<nums2.length)
	            {
	                num[i++]=nums2[k++];
	            }
	        }
	        Arrays.sort(num);
	        int mid=(num.length)/2;
	        if(num.length%2==0)
	        {
	            return (float)(num[mid-1]+num[mid])/2;

	        }
	        else
	        {
	            return num[mid];

	        }
        
    }
}