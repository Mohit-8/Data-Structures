static ArrayList<Integer> rec(ArrayList<ArrayList<Integer>> adj,int s,boolean v[],ArrayList<Integer> al)
    {
        v[s]=true;
        al.add(s);
        for(int i=0;i<adj.get(s).size();i++)
        {
            if(v[adj.get(s).get(i)]==false)
            {
                rec(adj,adj.get(s).get(i),v,al);
            }
        }
        return al;
    }
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int N)
    {
       // add your code here
       boolean v[]=new boolean[N];
       ArrayList<Integer> al = new ArrayList<Integer>(N);
       return rec(g,0,v,al);
    }
