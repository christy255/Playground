#include<stdio.h>
#include<math.h>
int main()
{
  int a=0,b=1,c,n;
  scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
     c=a+b;
      a=b;
      b=c;
}
   printf("%d",c); 
  return 0;
}