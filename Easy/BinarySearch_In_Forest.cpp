/*
Binary Search in forest
There are n trees in a forest. The heights of the trees is stored in array tree[], where tree[i] denotes the height of the ith tree in the forest.
If the ith tree is cut at a height H, then the wood collected is tree[i] - H, provided tree[i] > H. If the total woods that needs to be collected 
is exactly equal to k, find the height H at which every tree should be cut (all trees have to be cut at the same height). 
If it is not possible then return -1 else return H.

Input:
n = 5, k = 4
nums[] = {2, 3, 6, 2, 4}
Output: 3
Explanation: Wood collected by cutting trees
at height 3 = 0 + 0 + (6-3) + 0 + (4-3) = 4
hence 3 is to be subtracted from all numbers.
Since 2 is lesser than 3, nothing gets
subtracted from it.

*/

#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int collect_K_Wood(int h[], int n, int k)
int woodCollected(int h[], int n, int mid);

int woodCollected(int h[], int n, int mid)
{
    int sum = 0;
    for(int i=n-1; i>=0;i--)
    {
        if(h[i]-mid <= 0)
            break;
        
        //amount of logs from each tree. (Height of each log doesn't matter)
        sum += (h[i]-mid);
    }
    return sum;
}
int collect_K_Wood(int h[], int n, int k)
{
    //sort the heights of the tree. 
    //The sorted array replaces the original h[]
    //1st parameter = from where the sorting starts
    //2nd parameter = length upto which the array needs to be sorted.
    sort(h,h+n);
    
    //min and max length of the tree is initiaized.
    int low = 0, high=h[n-1];
    
    while(low<=high)
    {
        int mid = low + (high-low)/2;
        
        //Amount of wood colleced when cut at mid
        int collected = woodCollected(h,n,mid);
        
        if(collected == k)
            return mid;
            
        if(collected>k)
            low = mid+1;
        else
            high = mid-1;
    }
    return -1;
}


int main()
{
    int h[100], n, k;
    cin>>n;
    cin>>k;
    for(int i=0;i<n;i++)
        cin>>h[i];
    cout<< collect_K_Wood(h, n, k);
    
    return 0;
}
