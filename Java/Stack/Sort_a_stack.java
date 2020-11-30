public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		Stack<Integer> ts = new Stack<Integer>();
		while(!s.isEmpty())
		{
		    int temp = s.pop();
		    while(!ts.isEmpty() && temp<ts.peek())
		    {
		        s.push(ts.pop());
		    }
		    ts.push(temp);
		}
		return ts;
		
	}
