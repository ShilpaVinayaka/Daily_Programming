/*
Find bitonic point in given bitonic sequence
A Bitonic Sequence is a sequence of numbers which is first strictly increasing then after 
a point strictly decreasing. A Bitonic Point is a point in bitonic sequence before which 
elements are strictly increasing and after which elements are strictly decreasing. 
A Bitonic point doesn’t exist if array is only decreasing or only increasing.

Input : arr[] = {6, 7, 8, 11, 9, 5, 2, 1}
Output: 11
All elements before 11 are smaller and all
elements after 11 are greater.

Input : arr[] = {-3, -2, 4, 6, 10, 8, 7, 1}
Output: 10

*/

#include <iostream>

using namespace std;
int binarySearch(int arr[], int left, int right);
int binarySearch(int arr[], int left, int right)
{
    if(left <= right)
    {
        int mid = (left+right)/2;
        
        //checking if mid point id bitonic point
        if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
            return mid;
        
        // traverse right and consider right array
        if(arr[mid]< arr[mid+1]) 
            return binarySearch(arr, mid+1, right);
            
        // traverse left and consider left array to find bitonic point
        else
            return binarySearch(arr, left, mid-1);
    }
    return -1;
}

int main()
{
    int arr[100], n, index;
    cin>>n;
    for(int i=0;i<n;i++)
        cin>>arr[i];
        
    //Not a bitonic point if index 1 has max ele 
    //Not a bitonic point if last index has the max ele.
    index = binarySearch(arr, 1, n-2);
    
    if(index != -1)
        cout << arr[index];
    else
        cout <<"No Bitonic Point";
    
    return 0;
}
