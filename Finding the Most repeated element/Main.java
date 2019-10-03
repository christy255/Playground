#include<stdio.h>
	static int mostFrequent(int arr[], int n, int freq[]) 
	{ 
	    int max_count_idx = 0; 
		int curr_count = 1; 
		
	    for(int i = 0; i < n; i++)
	    {
		    for (int j = i+1; j < n; j++) 
		    { 
	            if(arr[i] == arr[j])
	            curr_count ++;
		    }
		    freq[i] = curr_count;
		    curr_count = 1;
	    } 
	    for( int i = 0; i < n; i++)
	    {
            if(freq[i]>freq[max_count_idx])
            max_count_idx = i;
	    }
	    return arr[max_count_idx];
	}
    int main()
    {
        int n;
        scanf("%d",&n);
        int arr[10];
        for(int i = 0; i < n; i++)
        {
            scanf("%d",&arr[i]);
        }
        int freq[n];
		printf("%d",mostFrequent(arr,n,freq)); 
		return 0;
	}