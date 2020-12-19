public static boolean check(long arr[],long brr[],int n)
{
    //Your code here
    HashMap<Long,Long> hm = new HashMap<Long,Long>();
    for(int i=0;i<n;i++)
    {
        if(hm.containsKey(arr[i]))
        hm.put(arr[i],hm.get(arr[i])+1);
        else
        hm.put(arr[i],(long)1);
    }
    for(int i=0;i<n;i++)
    {
        if(hm.containsKey(brr[i]) && hm.get(brr[i])>0)
        hm.put(brr[i],hm.get(brr[i])-1);
        else
        return false;
    }
    return true;
}
