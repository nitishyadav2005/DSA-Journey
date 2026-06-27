class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n = nums.size();
        vector<int>result(n);
        //int nums[] = new int[n];
        int left = 0, right = n-1;
        int ptr = n-1;
        while(left<=right){
            int leftsquare = nums[left]*nums[left];
            int rightsquare = nums[right]*nums[right];
            if(leftsquare>rightsquare){
                result[ptr] = leftsquare;
                left++;
            }
            else{
            result[ptr] = rightsquare;
            right--;
            }
            ptr--;


        }
        return result;

        
    }
    

};