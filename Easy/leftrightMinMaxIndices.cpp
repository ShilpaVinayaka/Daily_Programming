/*
Given an array arr[], the task is to find the leftmost and the rightmost
indices of the minimum and the maximum element from the array where arr[] consists of non-distinct elements.

Input: arr[] = {2, 1, 1, 2, 1, 5, 6, 5} 
Output: Minimum left : 1 
Minimum right : 4 
Maximum left : 6 
Maximum right : 6 
Minimum element is 1 which is present at indices 1, 2 and 4. 
Maximum element is 6 which is present only at index 6.
Input: arr[] = {0, 1, 0, 2, 7, 5, 6, 7} 
Output: Minimum left : 0 
Minimum right : 2 
Maximum left : 4 
Maximum right : 7 
*/

#include <iostream>

using namespace std;
void findIndicies(int arr[], int n);
void findIndicies(int arr[], int n)
{
    //The following will store the indicies. Not arr values
    int leftMin = 0, rightMin = 0;
    int leftMax = 0, rightMax=0;
    
    //initializing min and max to first ele of array
    int min = arr[0], max = arr[0]; 
    for(int i=1; i<n; i++){
        if(arr[i]<min){
            leftMin = rightMin = i;
            min = arr[i];
        }
        else if (arr[i] == min)
            rightMin = i;
            
        if(arr[i]>max){
            leftMax = rightMax = i;
            max = arr[i];
        }
        else if (arr[i]==max)
            rightMax = i;
    }
    cout << "Minimum left : " <<  leftMin << "\n";
    cout <<  "Minimum right : " << rightMin <<"\n";
    cout << "Maximum left : " <<  leftMax <<"\n";
    cout << "Maximum right : " << rightMax <<"\n";
}

int main()
{
    int arr[100], n;
    cin>>n;
    for(int i=0;i<n;i++)
        cin>>arr[i];
    findIndicies(arr, n);  
}
