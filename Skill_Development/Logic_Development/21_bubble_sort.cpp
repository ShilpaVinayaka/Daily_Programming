/*
JeanStone an online shopping portal introduces jeans for women. 
Assume 10 model pictures are given with different sizes. Write an algorithm to arrange
them in the catalog, based on their size from big to small.
*/

#include <iostream>
#include <math.h>
using namespace std;

void bubbleSort(int arr[])
{
    int temp;
    for(int i=0; i<10; i++)
    {
        for(int j=0; j<10-i-1; j++)
        {
            if(arr[j] < arr[j+1])
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    cout<<"Arranged from big to small:\n";
    for(int i=0;i<10; i++)
        cout<<arr[i]<<" ";
}

int main()
{
    int arr[11];
    
    cout<<"Enter sizes of 10 model pictures:\n";
    for(int i=0;i<10; i++)
        cin>>arr[i];
        
    bubbleSort(arr);

}
