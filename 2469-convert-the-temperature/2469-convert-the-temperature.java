class Solution {
    public double[] convertTemperature(double celsius) {
    double[] arr = new double[2];
    int i=0;
     arr[i++] =  celsius + 273.15;
      arr[i] =  celsius * 1.80 + 32.00;
      return arr;
    }
}