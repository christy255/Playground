#include <stdio.h>
int main() {
int a,n;
 scanf("%d",&n);
 a=n%10; 
  while(n>10)
  {
   n=n/10;
  }
 n=n+a;
  printf("%d",n);
	return 0;
}