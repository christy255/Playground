#include <stdio.h>
int main() {
int n;
  scanf("%d",&n);
 for(int i=1;i<=n;i++)
    {
    for(int space=n-1;space>=i;space--)
    {
      printf(" ");
    }  
      for(int j=1;j<=((2*i)-1);j++)
      {
        printf("*");
      }
      printf("\n");
    }
	return 0;
}