/*
You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list. 
One of the integers is missing from the list. Write an efficient code to find the missing integer.

Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
Output: 5
Explanation: The missing number between 1 to 8 is 5

Input: arr[] = {1, 2, 3, 5}
Output: 4
Explanation: The missing number between 1 to 5 is 4
*/

#include<bits/stdc++.h>
#include <iostream>

using namespace std;

void missing(int a[], int n)
{
    int x1 = a[0];
    int x2 = 1;
    
    for(int i = 1; i<n; i++)
        x1 = x1 ^ a[i];
    
    for(int i=2; i<n+2; i++)
        x2 = x2^i;
        
    cout << (x1^x2) <<endl;
}

int main()
{
    int n, a[100];
    cin>>n;
    for(int i = 0; i<n; i++)
        cin>>a[i];
        
    missing(a,n);
}
