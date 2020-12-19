int findLongestConseqSubseq(int a[], int n)
    {
        
	    // Your code here
	    HashSet<Integer> hs = new HashSet<Integer>();
	    for(int i=0;i<n;i++)
	    hs.add(a[i]);
	    int res=1;
	    int curr=1;
	    for(int i=0;i<n;i++)
	    {
	        if(!hs.contains(a[i]-1))
	        {
	            curr=1;
	            while(hs.contains(a[i]+curr))
	            curr++;
	        }
	        res=Math.max(res,curr);
	    }
	    return res;
	    
    }
