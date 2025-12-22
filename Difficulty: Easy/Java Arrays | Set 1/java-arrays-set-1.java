
class Solution {
    public String average(int arr[]) {
        // code here
       
        int s=0;
        for(int num: arr)
        {
             s += num;
             
        }
        double res = (double) s/arr.length;
         return String.format("%.2f",res);
    }
}