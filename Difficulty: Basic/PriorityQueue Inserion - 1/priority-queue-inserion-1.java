// User function Template for Java
class Solution {
    public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
        // Your code here
       PriorityQueue<Integer> list = new PriorityQueue<>();
       for(Integer val : arr)
       {
           list.add(val);
       }
    //   ArrayList<Integer> arr1 = new ArrayList<>();
    //   while (!list.isEmpty()) 
    //   {
    //       arr1.add(list.poll());
        
    //     } 
 
        return list;
        
}
}