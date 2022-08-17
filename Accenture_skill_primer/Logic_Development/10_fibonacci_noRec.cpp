/*
The first two terms in the Fibonacci series are 0 and 1, respectively, 
and each subsequent term is the sum of the previous two. Using this definition, 
to calculate the first several terms in the sequence, we get: 
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 
Build an algorithm for the same.
*/

#include <iostream>
using namespace std;
int main()
{
    int n, n1=0,n2=1, n3;
    cout<<"Enter a Number \n";
    cin>>n;
    cout<<n1<<","<<n2<<",";
    
    for(int i=2;i<n;i++)
    {
        n3 = n1 + n2;
        cout<<n3<<",";
        n1=n2;
        n2=n3;
    }
}
