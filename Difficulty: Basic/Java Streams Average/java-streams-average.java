// User function Template for Java
class Solution {
    public static double avgUsingStreams(int[] arr) {
        // Your code here
        long c=0, s=0;
        for(int val: arr)
        {
            c = c+1;
            s = s+val;
        }
        return (double) s/c;

        // Use stream().average().getAsDouble()
        // Just return and don't typecase anything.
    }
}