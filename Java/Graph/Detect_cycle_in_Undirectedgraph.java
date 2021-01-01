static boolean dfs_rec(ArrayList<ArrayList<Integer>> g, int s,boolean v[],int p)
    {
        v[s]=true;
        for(int x:g.get(s))
        {
            if(v[x]==false)
            {
                if(dfs_rec(g,x,v,s)==true)
                return true;
            }
            else if(x!=p)
            return true;
        }
        return false;
        
    }
    static boolean isCyclic(ArrayList<ArrayList<Integer>> g, int V)
    {
       // add your code here
       boolean v[]=new boolean[V];
       for(int i=0;i<V;i++)
       {
           if(v[i]==false)
           {
               if(dfs_rec(g,i,v,-1)==true)
               return true;
           }
       }
       return false;
    }
