
    static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        // add your code here
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(hs.containsKey(arr[i]))
            {
                hs.put(arr[i],hs.get(arr[i])+1);
            }
            else
            {
                hs.put(arr[i],1);
            }
        }
        for(int i=0;i<n;i++)
        {
             if(hs.get(arr[i])==1)
             al.add(arr[i]);
             
        }
        return al;
    }
