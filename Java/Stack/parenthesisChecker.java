 static boolean ispar(String x){
 Stack<Character> s = new Stack<Character>();
        for(int i=0;i<x.length();i++)
        {
            char c = x.charAt(i);
            if(c=='{' || c=='(' || c=='[' )
            s.push(c);
            else
            {
                if(s.isEmpty())
                return false;
                else
                {
                    if(s.peek()=='{' && c=='}' || s.peek()=='[' && c==']' || 
                    s.peek()=='(' && c==')')
                    s.pop();
                    else
                    return false;
                }
            }
        }
        if(s.isEmpty())
        return true;
        else
        return false;
    }
