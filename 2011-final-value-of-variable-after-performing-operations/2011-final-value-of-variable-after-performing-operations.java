class Solution {
    public int finalValueAfterOperations(String[] arr) {
        int X = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("--X") || arr[i].equals("X--")){
                X--;
            } else{
                X++;
            }
        }
        return X;
    }
}