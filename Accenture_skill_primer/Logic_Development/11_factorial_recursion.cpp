/* Factorial using Recursion */

#include <iostream>

using namespace std;

int factorial(int n)
{
    if(n==0||n==1)
        return 1;
    return n * factorial(n-1);
}

int main()
{
    int n, fact=1;
    cout<<"Enter a Number \n";
    cin>>n;
    
    cout<<"Factorial = "<< factorial(n)<<endl;
}
