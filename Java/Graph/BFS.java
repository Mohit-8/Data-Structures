static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> g, int N) {
        // add your code here
        boolean v[]=new boolean[N];
        Queue<Integer> q = new LinkedList<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        v[0]=true;
        q.add(0);
        while(q.isEmpty()==false)
        {
            int x=q.poll();
            al.add(x);
            for(int i=0;i<g.get(x).size();i++)
            {
                int e=g.get(x).get(i);
                if(v[e]==false)
                {
                    v[e]=true;
                    q.add(e);
                }
            }
        }
        return al;
    }
