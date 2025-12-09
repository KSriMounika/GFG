// User function Template for Java
class Solution {
    public static int binarySearchArray(int arr[], int k) {
        // Your code here
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==k)
            {
                return i;
            }
        }
        return -1;
    }
}