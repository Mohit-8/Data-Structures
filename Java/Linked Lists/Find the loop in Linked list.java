static int loopInList(Node head) {
     if(head==null)
    {
      return 0;
    }
    Node slow=head;
    Node fast=head;
    Node n=null;
    Node common=null;
    int count=1;
    while(slow!=null && fast!=null)
    {
      slow=slow.next;
      fast=fast.next.next;
      if(slow==fast)
      {
        common=slow;
        break;
      }
    }
    if(common!=null)
    {
      n=common;
      while(n.next!=common)
      {
        count++;
        n=n.next;
      }
      return count;
    }
    return 0;
  }
