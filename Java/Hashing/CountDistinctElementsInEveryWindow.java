ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<k;i++)
        {
            if(hm.containsKey(A[i]))
            hm.put(A[i],hm.get(A[i])+1);
            else
            hm.put(A[i],1);
        }
        //System.out.println(hm.size());
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(hm.size());
        
        for(int i=k;i<n;i++)
        {
            hm.put(A[i-k],hm.get(A[i-k])-1);
            if(hm.get(A[i-k])==0)
            hm.remove(A[i-k]);
            
            if(hm.containsKey(A[i]))
            hm.put(A[i],hm.get(A[i])+1);
            else
            hm.put(A[i],1);
            
            al.add(hm.size());
        }
        return al;
    }
