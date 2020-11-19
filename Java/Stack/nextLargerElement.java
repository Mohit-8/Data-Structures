class solve{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
       Stack<Long> s = new Stack<>();              
        long nge[] = new long[n];                   // Unordered Map to store all the result
        for (int i = n - 1; i >= 0; i--) {          // Run a loop in reverse order
                while (!s.isEmpty() && s.peek() <= arr[i]) { // If Peek element is less than curr element then it
                    s.pop();                              // can't be the next greater element, so pop it.
                } 
 
            if(s.isEmpty())
            nge[i]=-1;
            else
            nge[i]=s.peek();
            // If some element exist in stack then the top element is next
            s.push(arr[i]);                       // greater element. Push the current element to stack.
        } 
        // for(int i = 0; i < n; i++) {
        //     System.out.print(nge[i]+" ");
        // }
        return nge;
    } 
}
