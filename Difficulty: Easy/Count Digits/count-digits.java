class Solution {
    public int countDigits(int n) {
        // code here
        
        if(n==0) return 1;
        int c = 0;
        while(n!=0)
        {
            n = n/10;
            c = c+1;
        }
        return c;
    }
}
