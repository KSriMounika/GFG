class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int val: arr)
        {
            list.add(val);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0; i< list.size(); i++)
        {
           int val1 = list.get(i);
           if(list.indexOf(val1) == i)
           {
               res.add(Collections.frequency(list,val1));
           }
           
           
        }
        return res;
    }
}