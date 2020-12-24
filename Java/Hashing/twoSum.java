public boolean keypair(int[] A, int N, int X)
    {
        // code here
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<N;i++)
        {
            if(hs.contains(X-A[i]))
            return true;
            else
            hs.add(A[i]);
        }
        return false;
    }
