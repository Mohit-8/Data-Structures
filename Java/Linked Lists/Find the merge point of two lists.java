static Node findMergePoint(Node head1, Node head2) {
    
    Node n1=head1;
    Node n2=head2;
    while(n1!=null)
    {
      n2=head2;
      while(n2!=null)
      {
        if(n1==n2)
        {
          return n2;
        }
        n2=n2.next;
      }
      n1=n1.next;
    }
    return null;

  }
