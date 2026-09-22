class Solution {
    public String rearrangeString(String s, char x, char y) {
        char[] arr = s.toCharArray();
        int n= arr.length;
        char[] res = new char[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i] == y){
                res[j] = arr[i];
                j++;
                
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i] != x && arr[i]!= y){
                res[j] = arr[i];
                j++;
                
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                res[j]= arr[i];
                j++;

            }
        }
        return new String(res);
    }
}