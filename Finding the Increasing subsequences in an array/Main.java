#include<stdio.h>
int increasing_sub_array(int arr_size, int arr[], int sum_arr[]);
int main()
{
    int arr_size;
	scanf("%d",&arr_size);
    int arr[arr_size];
    for(int index = 0;index < arr_size; index++)
    {
        scanf("%d", &arr[index]);   
    }
    int sum_arr[3 * arr_size];
    increasing_sub_array(arr_size, arr, sum_arr);
    return 0;
}    
int increasing_sub_array(int arr_size, int arr[], int sum_arr[])
{
	for(int index1 = 0; index1 <= arr_size - 1; index1++)
        {
            int key =  arr[index1];
            for(int index2 = index1+1; index2 <= arr_size-1; index2++)
            {       
                    if(arr[index2]>key)
                    printf("%d,%d\n", key,arr[index2]);
            }
        }
    return 0;
}