#include <stdio.h>
int main() {
	int n,num=0;
  scanf("%d",&n);
 for(int i=1;i<=n;i++)
    {
    for(int space=n-1;space>=i;space--)
    {
      printf(" ");
    }  
      for(int j=1;j<=i;j++)
      {
        num=num+1;
        printf("%d ",num);
      }
      printf("\n");
    }
	return 0;
}