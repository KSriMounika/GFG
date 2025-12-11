class Solution {
    public static int sumUsingStreams(int[] arr) {
        // code here
        int s=0;
        for(int val : arr)
        {
            s = s+val;
        }
        return s;
    }
}
