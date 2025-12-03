class Solution 
{
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q,
                             ArrayList<Integer> Query) 
                             
    {
        
       if (Q==1)
       {
             
             
             A.add(Query.get(0),Query.get(1));
             
       }
       else if(Q==2)
       {
           if(A.contains(Query.get(0)))
           {
                return new ArrayList<>(Arrays.asList(A.lastIndexOf(Query.get(0))));
           }
           else
           {
               return new ArrayList<>(Arrays.asList(-1));
           }
       }
       
       return A;
        
        
    }
}