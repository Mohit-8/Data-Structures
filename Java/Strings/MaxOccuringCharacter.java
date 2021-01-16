public static char getMaxOccuringChar(String line){
        
        // Your code here
        char c[]=line.toCharArray();
        int a[]=new int[26];
        
        for(int i=0;i<c.length;i++)
        {
            a[c[i]-'a']++;
        }
        int max=0;
        char ch='a';
        for(int i=0;i<26;i++)
        {
            if(a[i]>max)
            {    
                ch=(char)('a'+i);
                max=a[i];
            }
        }
        return ch;
    }
