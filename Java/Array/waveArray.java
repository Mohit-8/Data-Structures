public static void convertToWave(int arr[], int n){
        
        // Your code here
        for(int i=0;i<n-1;i++)
        {
            int t=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=t;
            i++;
        }
        
    }
