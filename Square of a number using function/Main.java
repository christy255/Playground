#include<stdio.h>
   int square(int a)
  {
   int sqr=a*a;
    return sqr;
  }
int main() {
 
 int n,sqr;
  scanf("%d",&n);
 sqr=square(n);
  printf("%d",sqr);
   return 0;
}