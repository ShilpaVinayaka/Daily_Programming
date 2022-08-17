/*
Jane and James are friends and both are really interested in learning new aspects and new things in a  programming language.  
One day, they planned to find out the best algorithm to count the frequency of each digit in any given number. 
Help them find out the best algorithm to do the same.
*/

#include <iostream>
using namespace std;

int main()
{
    int n,rem;
    cin>>n;
    int c0=0, c1=0, c2=0, c3=0, c4=0, c5=0, c6=0, c7=0, c8=0, c9=0;
    while(n!=0)
    {
        rem = n%10;
        n=n/10;
        
        switch(rem)
        {
            case 0: c0++;
            break;
            case 1: c1++;
            break;
            case 2: c2++;
            break;
            case 3: c3++;
            break;
            case 4: c4++;
            break;
            case 5: c5++;
            break;
            case 6: c6++;
            break;
            case 7: c7++;
            break;
            case 8: c8++;
            break;
            case 9: c9++;
            break;
        }
    }
    cout<<c0<<","<<c1<<","<<c2<<","<<c3<<","<<c4<<","<<c5<<","<<c6<<","<<c7<<","<<c8<<","<<c9;
    
}
