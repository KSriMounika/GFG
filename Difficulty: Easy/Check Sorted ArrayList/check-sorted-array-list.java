// User function Template for Java
class Solution {
    public static boolean isSorted(ArrayList<Integer> list) {
        // code here
        boolean asc = true;
        boolean desc = true;
        for(int i=0; i<list.size()-1; i++)
        {
            if(list.get(i)>list.get(i+1))
            {
                asc = false;
            }
            else if(list.get(i)<list.get(i+1))
            {
                desc = false;
            }
        }
      
        return asc || desc;
       
    }
}