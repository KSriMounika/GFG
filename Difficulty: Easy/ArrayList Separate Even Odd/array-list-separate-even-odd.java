// User function Template for Java
class Solution {
    public static ArrayList<ArrayList<Integer>> evenOdd(ArrayList<Integer> list) {
        
        ArrayList <Integer> even = new ArrayList<>();
        ArrayList <Integer> odd = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
      
        for(int val : list)
        {
            if(val% 2==0)
            {
                even.add(val);
                
            }
            else
            {
                odd.add(val);
              
            }
        }
        res.add(even);
        res.add(odd);
        return res;
    }
}