/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
void largest_elem(int list[],int size);


int main() {
   int size,list[10],i;
   
   scanf("%d",&size);

   for( i = 0; i < size ; i++)
   {
       scanf("%d",&list[i]);
   }
  
   largest_elem(list,size);
  
   return 0;  
}

 void largest_elem(int list[],int size)
 {
     int i, batch1_sum = 0, batch2_sum = 0;
     
     for( i = 0; i < size/2 ; i++)
     { 
       batch1_sum = batch1_sum + list[i];
      
     }  
    
     for( i = size/2; i < size ; i++)
     { 
       batch2_sum = batch2_sum + list[i];
      
     }  
     
     if(batch1_sum == batch2_sum)
     {
         printf("Perfect Batch" );
   
     }
     else
     {
         printf("Not a Perfect Batch");
     }

}