/*

Mr.William buys a new Audi car. During the vehicle registration,
he needs a fancy number like both the number and its reverse are the same. 
Generate an algorithm to find that fancy number.

*/

#include <iostream>
#include <math.h>
using namespace std;

int main()
{
    int n=0, rem, rev=0, i;

	cin>>n;
	
	int len = to_string(n).length();
	int temp = n;
	i = len-1;
	while(i>=0)
	{
	    rem = n%10;
	    rev = rev + rem * pow(10,i);
	    n=n/10;
	    i--;
	}
	if(rev==temp)
	    cout<<"Fancy Number\n";
	else
	    cout<<"Not Fancy\n";
}
