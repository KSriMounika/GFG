// User function Template for Java

class Solution {
    // Function to insert all elements of the array in deque.
    public static ArrayDeque<Integer> deque_Init(int arr[], int n) {
        // Your code here
        ArrayDeque<Integer> list = new ArrayDeque<>();
        for(int val : arr)
        {
            list.add(val);
        }
        return list;
    }
}