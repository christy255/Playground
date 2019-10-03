#include <stdio.h>
int main() {
	int a,sum=0,n;
 scanf("%d",&n);
  while(n>0)
  {
 a=n%10; 
  n=n/10;
    sum=sum+a;
  }
  printf("%d",sum);
	return 0;
}