/*
A three digit number is called an Armstrong number if the sum of the cube of its digits is equal to the number itself.
Write an algorithm for the same.
*/

#include <iostream>

using namespace std;

int main()
{
    int n, rem, sum=0;
    cout<<"Enter a Number \n";
    cin>>n;
    
    int temp = n;
    while(n!=0)
    {
        rem = n%10;
        sum = sum + rem*rem*rem;
        n = n/10;
    }
    if(sum==temp)
        cout<<temp<<" is Armstrong Number."<<endl;
    else
        cout<<temp<<" is not Armstrong Number."<<endl;
}
