static void rotateArr(int arr[], int d, int n)
    {
        int temp[]=new int[d];
    for(int i =0; i < d; i++) temp[i] = arr[i];
    // Shift original array
    for(int i=d; i < n; i++) arr[i-d] = arr[i];
    // Add values of temporary array at the end of our original array    
    int a=0;
    for(int i=n-d; i < n; i++)
    {
        arr[i] = temp[a];
        a++;
    }
    }
