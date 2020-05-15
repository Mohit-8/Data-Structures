static void reverseKelementsQueue(QueueArray q, int K)
{
  int[] revArray=new int[q.SIZE];
  for(int i=K-1;i>=0;i--)
  {
    revArray[i]=q.dequeue();
  }
  int j=K;
  while(true)
  {
    int tmp=q.dequeue();
    if(tmp==-1)
      break;
    else
      revArray[j++]=tmp;
  }
  for(int i=0;i<j;i++)
  {
    q.enqueue(revArray[i]);
  }
}
