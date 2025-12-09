// User function Template for Java
class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        // Your code here
        
          if(list.contains(k))
            {
                for(int i=0; i<list.size();i++)
                {
                  return list.indexOf(k);
                 }
            }
           return -1;
        // If k in arr return 1, else return -1
    }
}