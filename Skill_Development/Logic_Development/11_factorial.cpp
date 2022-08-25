/*

Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n.
Write an algorithm to find the factorial of any given number.

*/

#include <iostream>

using namespace std;


int main()
{
    int n, fact=1;
    cout<<"Enter a Number \n";
    cin>>n;
    
    
    for(int i=2;i<=n;i++)
        fact = fact * i;
    
    cout<<fact;
}
