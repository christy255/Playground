#include <stdio.h>
int main() {
   	int n;
 
  scanf("%d",&n);
   int a=n;
 for(int i=1;i<=n;i++)
    {
   
      for(int j=a;j>=1;j--)
      {
        printf("%d",j);    
      }
      printf("\n");
  
   a--;
    }
	return 0;
}