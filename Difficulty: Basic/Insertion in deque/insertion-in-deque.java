class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        Deque <Integer> list = new ArrayDeque <>();
        for(Integer val: arr)
        {
           list.add(val);
        }
        return list;
    }
}