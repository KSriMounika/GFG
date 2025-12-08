// User function Template for Java
class Solution {
    // function should calculate and return the
    // average of all the non negative integers
    // from the arraylist provided in the
    // parameter
    public static double posAverage(ArrayList<Integer> list) {
        
        int c=0, s=0;
        for(Integer val : list)
        {
            if(val >= 0)
            {
                c = c+1;
                s = s+val;
            }
            else
            {
                s = s+0;
            }
        }
        double res = (double) s/c;
        return res;
        
        
        
        
        
    }
}