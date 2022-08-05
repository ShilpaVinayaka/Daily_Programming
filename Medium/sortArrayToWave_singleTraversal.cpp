/*
Given an unsorted array of integers, sort the array into a wave like array. 
An array ‘arr[0..n-1]’ is sorted in wave form if 
arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..

Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
 Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80} OR
                 {20, 5, 10, 2, 80, 6, 100, 3} OR
                 any other array that is in wave form

Time Complexity: O(n)
*/

#include <iostream>
#include <algorithm>
using namespace std;

void swap(int *x, int *y);
void sortInWave(int arr[], int n);

void swap(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

void sortInWave(int arr[], int n)
{
    sort(arr, arr+n);
    
    //i+=2 -> iterating through even indices
    for(int i=0; i<n; i+=2)
    {
        // If current ele is smaller than previous
        if(i>0 && arr[i-1]<arr[i])
            swap(&arr[i], &arr[i-1]);
            
        if(i<n-1 && arr[i]<arr[i+1])
            swap(&arr[i], &arr[i+1]);
    }
        
    //when formal parameters are pointer:
    //address(&) the array elements to be swapped 
}

int main()
{
    int arr[100], n;
    cin>>n;
    for(int i=0;i<n;i++)
        cin>>arr[i];

    sortInWave(arr, n);
    
    for(int i=0; i<n; i++)
        cout<<arr[i]<<" ";
    
    return 0;
}
