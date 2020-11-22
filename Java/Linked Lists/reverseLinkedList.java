Node reverseList(Node head)
    {
        
        
       Node current = head;
       Node prev = null;

while(current!=null){
head = current.next;
current.next = prev;
prev = current;
current = head;
}
return prev;
    }
