/*
A computer teacher wants his students to find the number of days in the month of February depending
on whether it is a leap year or not. 
Build an algorithm for the same.

*/

#include <iostream>
using namespace std;

int main()
{
    int n, numDaysFeb = 28;
    cout<<"Enter Year\n";
    cin>>n;
    
    if (n%4 == 0 || n%100 == 0 && n%400 == 0)
     {
         numDaysFeb = 29;
         cout<<n<<" is a leap year.\n";
     }

    cout<<"Number of days in Feb = "<<numDaysFeb;
}
