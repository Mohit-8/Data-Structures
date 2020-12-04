public Node pairwiseSwap(Node head)
    {
        // code here
        if(head==null || head.next==null)
        return head;
        Node curr=head.next.next;
        Node prev=head;
        head=head.next;
        head.next=prev;
        Node fwd=null;
        while(curr!=null && curr.next!=null)
        {
            fwd=curr.next.next;
            prev.next=curr.next;
            prev=curr;
            curr.next.next=curr;
            curr=fwd;
        }
        prev.next=curr;
        return head;
    }
