#include<stdio.h>
#include<string.h>
int main()
{
  char s[10],k[10],l[10];
  int i;
  scanf("%s%s%s",&s,&k,&l);
  for(i=0;s[i]!='\0';i++)
  {
    if((s[i]>='a'&& s[i]<='z') || (s[i]>='A' && s[i]<='Z'))
    {
      if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
      {
        s[i]='$';
      }
    }
    printf("%c",s[i]);
  }
  for(i=0;k[i]!='\0';i++)
  {
  if((k[i]>='a'&& k[i]<='z') || (k[i]>='A' && k[i]<='Z'))
    {
      if(k[i]=='a'||k[i]=='e'||k[i]=='i'||k[i]=='o'||k[i]=='u')
      {
        
        printf("%c",k[i]);
      }
      else
      {
          k[i]='#';
        printf("%c",k[i]);  
      }
    }
    
  }
 for(i=0;l[i]!='\0';i++)
  {
    if(l[i]>='a'&& l[i]<='z') 
    {
        l[i]=l[i]-32;
      
    }
    printf("%c",l[i]);
  }
  return 0;
}