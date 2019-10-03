#include<stdio.h>
int main()
{
  int year;
  scanf("%d",&year);
    if(year%4==0)
      printf("Leap year");
  else
    printf("Not Leap year");
  return 0;
}