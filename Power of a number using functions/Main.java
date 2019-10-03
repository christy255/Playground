#include<stdio.h>
int main(){
       int base, exponent;
    scanf("%d%d", &base, &exponent);
    printf("%d", power_of_a_number(base, exponent));// Function call
  	return 0;
}
// Function to find the power of a number
int power_of_a_number(int base, int exponent)
{
    int power = 1;
    while(exponent >= 1)
    {
        power = power * base;
        exponent--;
    }
    return power;
}
 