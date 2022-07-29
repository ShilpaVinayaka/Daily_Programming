/*
Given an array arr[] of n integers, construct a Product Array prod[] (of same size) such that prod[i] 
is equal to the product of all the elements of arr[] except arr[i]. Solve it without division operator in O(n) time.

Example : 

Input: arr[]  = {10, 3, 5, 6, 2}
Output: prod[]  = {180, 600, 360, 300, 900}
3 * 5 * 6 * 2 product of other array 
elements except 10 is 180
10 * 5 * 6 * 2 product of other array 
elements except 3 is 600
10 * 3 * 6 * 2 product of other array 
elements except 5 is 360
10 * 3 * 5 * 2 product of other array 
elements except 6 is 300
10 * 3 * 6 * 5 product of other array 
elements except 2 is 900
*/

#include <iostream>
using namespace std;
void productArray(int arr[], int n);

void productArray(int arr[], int n)
{
    if (n == 1) {
        cout << 0;
        return;
    }
    int* left = new int[sizeof(int) * n];
    int* right = new int[sizeof(int) * n];
  
    int* prod = new int[sizeof(int) * n];
  
    int i, j;

    left[0] = 1;
  
    right[n - 1] = 1;
  
    for (i = 1; i < n; i++)
        left[i] = arr[i - 1] * left[i - 1];
  
    for (j = n - 2; j >= 0; j--)
        right[j] = arr[j + 1] * right[j + 1];
  
    for (i = 0; i < n; i++)
         cout << left[i] * right[i]<< " ";

    return;
}
  
int main()
{
    int n, arr[100];
    cin>>n;
    for(int i=0; i<n; i++)
        cin>>arr[i];
        
    productArray(arr, n);
}
