// User function Template for Java
class Solution {

    public static ArrayList<Integer> maxNeighbour(ArrayList<Integer> arr) {
        // Your code here
        
       
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0; i< arr.size()-1; i++)
            {
                   int a = arr.get(i);
                   int b = arr.get(i+1);
                   int res = Math.max(a,b);
                   arr1.add(res);
                   
            }
     
           return arr1;
        
        
    }
}