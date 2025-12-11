// User function Template for Java
class Solution {
    public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
        // Your code here
        PriorityQueue<Integer> list = new PriorityQueue<>(Comparator.reverseOrder());
        for(int val: arr)
        {
            list.add(val);
        }
        return list;
    }
}