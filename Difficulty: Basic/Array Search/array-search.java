class Solution {
    public int search(int arr[], int x) {
        // code here
    
        int indx =0;
        
        for(int i :arr)
        {
            if(x == i)
            {
                return indx;
            }
            indx++;
        }
        return -1;
    }
}
