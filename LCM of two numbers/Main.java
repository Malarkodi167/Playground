#include<stdio.h>
int main()
{
  int n1,n2,minmultiple;
scanf("%d%d",&n1,&n2);
  minmultiple=(n1>n2) ? n1:n2;
  while(1)
  {
    if(minmultiple%n1==0 && minmultiple%n2==0)
    {
      printf("%d",minmultiple);
      break;
    }
    ++minmultiple;
  }
  //Type your code here
  return 0;
}