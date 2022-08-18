/*
A private bank comes up with a requirement to check the age of a person who wants to open an account in their bank. 
They approach you to create an algorithm to calculate the age when the birth year and the current year are given. 
Both the years should be encoded with last two digits. 

For example, if the birth year is 1990, then the user will enter only "90". You will have to determine,
if a two digit value such as "62" corresponds to a year in the 20th century ("1962”). If the user gives "00",
this will be considered as year 2000. Assume that the age should always between 18 and 100 (inclusive)  and the current year to be 2018.
*/

#include <iostream>
using namespace std;

int main()
{
    int n, curYear, age;
    cout<<"Enter Birth Year and Current Year: \n";
    cin>>n>>curYear;
    
    if(curYear<n)
    {
        n=100-n;
        age = n+curYear;
    }
    else{
        age = curYear - n;
    }
    
    if (age<18 || age>100)
        cout<<"Invalid Year Input"<<endl;
    else
        cout<<age;

    return 0;
}
