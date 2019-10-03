#include<stdio.h>
int main()
{
  int n,a;
  scanf("%d",&n);
  a=n/100;
  n=n%10;
  n=n+a;
  printf("%d",n);
  return 0;
}