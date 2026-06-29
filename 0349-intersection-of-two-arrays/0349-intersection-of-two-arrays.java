class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList <Integer> arr = new ArrayList<>();
        int m = nums1.length;
        int n = nums2.length;
        // int a = Math.min(m,n);
        int b = Math.max(m,n);
        int i=0, j = 0;
        while(i<m && j<n){
            if(nums1[i] == nums2[j] && (arr.isEmpty() || arr.get(arr.size()-1) != nums1[i])) {
                arr.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else
            j++;
        }
        int ans[] = new int[arr.size()];
        for( i=0; i<arr.size(); i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}