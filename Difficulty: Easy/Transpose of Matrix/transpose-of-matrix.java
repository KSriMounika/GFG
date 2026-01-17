class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
    
    
        int n = mat.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int r=0; r<n; r++)
        {
            ArrayList<Integer> r1 = new ArrayList<>();
            for(int c=0; c<n; c++)
            {
               r1.add(mat[c][r]);
            }
            res.add(r1);
        }
        return res;
       
    }
}