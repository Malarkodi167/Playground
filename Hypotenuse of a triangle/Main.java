#include<stdio.h>
int main()
{
  float a,b,c;
  scanf("%f%f",&a,&b);
  c=hypotf(a,b);
  printf("%.2f",c);
  //Type your code here
  return 0;
}