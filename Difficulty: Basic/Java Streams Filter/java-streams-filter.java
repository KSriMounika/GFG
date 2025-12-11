// User function Template for Java
class Solution {
    public static int filterUsingStreams(int[] arr) {
        // Your code here
        
             return Arrays.stream(arr).filter(val -> val%2!=0).max().getAsInt();
            
              
              
            
        
       
        // Use filter() to get only odd elements then apply max().getAsInt()
    }
}