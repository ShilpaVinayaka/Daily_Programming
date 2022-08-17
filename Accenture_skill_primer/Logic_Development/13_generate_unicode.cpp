/*
A passport office at Gurgaon decides to generate a Unicode for every applicant who applies for passport 
and to mail the same to the applicants. The passport service will get rendered only when an applicant provides 
his own Unicode number that was sent to him. The Unicode is generated in a tricky way. It is the year of birth 
of the applicant summed up followed by the area code reversed. 

Year entered must contain four digits; otherwise display – ‘Unable to generate Unicode’. If the year 
entered is greater than the current year or less than or equal to zero, display the message – ‘Unable 
to generate Unicode’. If the area code entered is less than or equal to zero, display the message – 
‘Invalid area code’.

Build an algorithm for the same.
*/

#include <iostream>
#include<math.h>
using namespace std;

int main()
{
    int n, area, temp, rem, rev=0, i;
    cout<<"Enter Birth Year \n";
    cin>>n;
    int currentYear = 2022;
    
    if(to_string(n).length()>4)
    {
        cout<<"Unable to generate Unicode"<<endl;
        exit (0);
    }
    else if (n>currentYear)
    {
        cout<<"Unable to generate Unicode"<<endl;
        exit (0);
    }
    cout<<"Enter area code \n";
    cin>>area;
    if(area<=0)
        cout<<"Invalid Area Code";
    else
    {
        temp = area;
        int len = to_string(area).length();
        int i = len-1;
        while(i>=0)
        {
            rem = area%10;
            rev = rev+rem*pow(10, i);
            area=area/10;
            i--;
        }
    
        int sum = rev + n;
        cout<<"Unicode= "<<sum<<endl;
    }
  
}
