Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if(head==null)
        return null;
        
        Node n=head;
        int c=0;
        while(n!=null)
        {
            c++;
            n=n.next;
        }
        int mid=c/2;
        int i=0;
        n=head;
        while(i<mid-1)
        {
            n=n.next;
            i++;
        }
        n.next=n.next.next;
        return head;
    }
