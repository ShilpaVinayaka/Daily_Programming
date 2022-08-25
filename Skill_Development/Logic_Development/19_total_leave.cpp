/*
IMBC HR management has planned to implement a web based leave management system for their employees. 
All full-time employees shall receive 17 days of personal leave for a year, along with the leave balance of the previous year.
Assume (N) is the leave balance of the previous year and update the total number of leave days received by an
employee for the current year. The algorithm should ask a user to type an integer (N) between 0 and 20
(both included) so that he would obtain N+17 as his output. On typing a wrong integer, he must be asked to
type a right one.  This must continue until the user types in the right input. Once a right integer is typed, 
then N+17 would get processed.
*/

#include <iostream>
using namespace std;

int main()
{
    int n=0;

	cout<<"Enter leave left in last year: \n";
	do{
	  if(n<0||n>20)
	    cout<<"Enter the Right Input:\n";
	  cin>>n;
	    
	}while(n<0||n>20);

	
	int totLeave = n+17;
	cout<<"Total Leave = "<<totLeave<<endl;
}
