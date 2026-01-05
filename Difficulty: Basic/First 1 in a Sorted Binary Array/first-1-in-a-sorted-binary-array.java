// User function Template for Java

class Solution {

    public long firstIndex(int arr[]) {
        // Your code goes here
        int i=-1;
        int j = arr.length-1;
        while(j-i>1)
        {
            int mid = (i+j)/2;
            if(arr[mid]<1)
            {
                i = mid;
            }
            else
            {
                j=mid;
            }
           
           
        }
        if(j >= 0 && arr[j]==1)
        {
            return j;
        }
        return -1;
    }
}