/*
Raj wants to convert binary number to decimal number system. 
Binary number system is a base 2 number system.  
It uses only 2 symbols to represent all its numbers i.e. 0 and 1. Build an algorithm for this conversion.
*/

#include <iostream>
#include <math.h>
using namespace std;

int main()
{
    int n, d=0, rem, i=0;
    cout<<"Enter Binary Number: \n";
    cin>>n;
    
    while(n!=0)
    {
        rem = n % 10;
        n = n/10;
        d = d + rem * pow(2,i);
        i++;
    }
    
    cout<<"Decimal Value = "<<d<<endl;
}
