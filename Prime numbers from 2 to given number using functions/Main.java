#include<stdio.h>
int checkPrimeNumber(int n);
int main()
{
    int n, i, flag;
    scanf("%d %d",&n);
    
    for(i=2; i<n; ++i)
    {
        // i is a prime number, flag will be equal to 1
        flag = checkPrimeNumber(i);
        if(flag == 1)
            printf("%d\n",i);
    }
    return 0;
}
// user-defined function to check prime number
int checkPrimeNumber(int n)
{
    int j, flag = 1;
    for(j=2; j <= n/2; ++j)
    {
        if (n%j == 0)
        {
            flag =0;
            break;
        }
    }
    return flag;
}