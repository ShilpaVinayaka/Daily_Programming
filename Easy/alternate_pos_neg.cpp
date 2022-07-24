/*
Given an unsorted array Arr of N positive and negative numbers. 
Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with positive number.

Input: 
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2

Input: 
N = 10
Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
Output:
5 -5 2 -2 4 -8 7 1 8 0 

*/

#include <iostream>

using namespace std;
void rearrange(int arr[], int n);
void rearrange(int arr[], int n)
{
    int i=-1, temp = 0;
    for(int  j=0; j<n ;j++)
    {
        if(arr[j]<0)
        {
            i++;
            temp = arr[i];
            arr[i] = arr[j] ;
            arr[j] = temp;
        }
    }
    
    int pos = i+1, neg = 0;
    while(pos<n && neg<pos && arr[neg]<0)
    {
        temp = arr[neg];
        arr[neg] = arr[pos];
        arr[pos] = temp;
        pos++;
        neg += 2;
    }
    
    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<<",";
    }
}

int main()
{
    int n, arr[100];
    cin>>n;
    for(int i=0; i<n;i++)
        cin>>arr[i];
        
    rearrange(arr,n);

    return 0;
}
 
