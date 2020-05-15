static String reverseString(CQStack s, String st)
{
  String rev="";
  char c;
  for(int i=0;i<st.length();i++)
  {
    s.push(st.charAt(i));
  }
  while(!s.isEmpty())
  {
    c=(char)s.pop();
    rev=rev+c;
  }
  return rev;

}
