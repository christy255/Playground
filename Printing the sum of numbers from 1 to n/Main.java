#include <stdio.h>
int main() {
int n,j,sum=0;
  scanf("%d",&n);
  for(j=1;j<=n;j++)
    {
  sum=sum+j;
    }
    printf("%d",sum);
	return 0;
}