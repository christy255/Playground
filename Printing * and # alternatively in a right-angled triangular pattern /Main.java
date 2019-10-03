#include <stdio.h>
int main(){
	int n;
    scanf("%d",&n);
	int num = 0;
	for(int cur_row =1; cur_row <= n; cur_row++) 
       {
		 for(int cur_col=1; cur_col <= cur_row ; cur_col++)
             {
				num = num + 1;
           if(num%2==0)
				printf("#",num);
           else
             printf("*",num);
			 }
    	  printf("\n");
	   }
  	return 0;
}