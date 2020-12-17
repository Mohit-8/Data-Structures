public static int isSumProperty(Node root)
    {
        int sum=0;
        // add your code here
        if(root==null)
        return 1;
        
        if(root.left==null && root.right ==null)
        return 1;
        
        if(root.left!=null)
        sum=sum+root.left.data;
        
        if(root.right!=null)
        sum=sum+root.right.data;
        
        if((sum==root.data) && isSumProperty(root.left)!=0&&isSumProperty(root.right)!=0)
        return 1;
        else
        return 0;
        
    }
