static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        int maxEle = arr[n-1];
		    
		    ArrayList<Integer> res = new ArrayList<Integer>();
		    for(int i=n-1; i>=0; i--) {
		        if(arr[i] >= maxEle){
		            maxEle = arr[i];
		            res.add(maxEle);
		        }
		    }
		    Collections.reverse(res);
		    return res;
    }
