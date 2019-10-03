#include <stdio.h>
int main() {
  int a,n;
   scanf("%d",&n);
  while(n>100)
  { 
  n=n/10;
  }
  a=n%10;
  printf("%d",a);
	return 0;
}