#include<stdio.h>
int main()
{
  int year;
  scanf("%d",&year);
  if(year%400==0)
    printf("LEAP YEAR");
  else if(year%100==0)
    printf("NOT LEAP YEAR");
  else if(year%4==0)
    printf("LEAP YEAR");
  else
    printf("NOT LEAP YEAR");
  //Type your code here
  return 0;
}