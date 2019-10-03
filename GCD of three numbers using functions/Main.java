#include <stdio.h>
int g_cd(int n1,int n2);
int main(){
  int a,b,c;
	scanf("%d%d%d",&a,&b,&c);
  int gcd=g_cd(a,b);
  printf("%d",g_cd(gcd,c));
  	return 0;
}
int g_cd(int a,int b)
{
  int gcd,min;
  if(a>b)
  {
    min=b;
  }
  else
  {
    min=a;
  }
  if(a%min==0 && b%min==0)
  {  
  gcd=min;
  }
  return gcd;
}