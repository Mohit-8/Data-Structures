static Node shiftSmallLarge(Node org)
    {
      if(org==null)
      {
        return null;
      }
      Node small=org;
      Node large=org;
      Node n=org;
      while(n!=null)
      {
        if(n.data>large.data)
        {
          large=n;
        }
        if(n.data<small.data)
        {
          small=n;
        }
        n=n.next;
      }
      n=org;
      //IMPORTANT REMEMBER THIS!!!!!!!!!!!
      if(org.data!=small.data)
      {
          while(n.next!=null)
          {
              if(n.next==small)
              {
                  n.next=small.next;
                  break;
              }
            n=n.next;
          }
          small.next=org;
          org=small;
      }
      n=org;
      if(large.next!=null)
      {
          while(n.next!=null)
          {
             if(n.next==large)
              {
                n.next=large.next;
              } 
              n=n.next;
          }
          n.next=large;
          large.next=null;
      }
    
      return org;
    }
