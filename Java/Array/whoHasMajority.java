 public int majorityWins(int arr[],int n,int x,int y)
    {
        // code here 
        int cx=0;
        int cy=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            cx++;
            else if(arr[i]==y)
            cy++;
        }
        if(cx>cy)
        return x;
        else if(cy>cx)
        return y;
        else
        return Math.min(x,y);
    }
