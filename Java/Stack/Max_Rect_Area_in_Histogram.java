// Function to calculate max rectangular area histogram
    // hist[]: input array
    // n: size of array
    public static long getMaxArea(long hist[], long n)  {
        // your code here
     long max=0;
    int tp;
    long area;
    Stack<Integer> s = new Stack<Integer>();
    int i=0;
    while(i<n)
    {
        if(s.isEmpty() || hist[i] >= hist[s.peek()])
        s.push(i++);
        else
        {
            tp=s.pop();
            if(s.isEmpty())
            {
                area = hist[tp]*i;
            }
            else
            {
                area = hist[tp]*(i-s.peek()-1);            
                
            }
            if(area>max)
                max=area;
        }
    }
    while(!s.isEmpty())
    {
        tp=s.pop();
        if(s.isEmpty())
            {
                area = hist[tp]*i;
            }
            else
            {
                area = hist[tp]*(i-s.peek()-1);            
                
            }
            if(area>max)
                max=area;
    }
    return max;
    }
