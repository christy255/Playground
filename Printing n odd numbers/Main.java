#include <stdio.h>
int main() {
	int n,i,j;
  scanf("%d",&n);
  for(i=1,j=1;j<=n;i=i+2,j++)
    {
    printf("%d\n",i);
    }
	return 0;
}