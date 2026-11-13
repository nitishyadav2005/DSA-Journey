
class Solution {
    public int[] constructRectangle(int area) {
        int arr[] = new int[2];

        int i = (int)Math.sqrt(area);
        int j = i;

        while(i >= 1) {
            if(area % i == 0) {
                arr[0] = area / i;
                arr[1] = i;
                break;
            }
            i--;
        }

        return arr;
    }
}
