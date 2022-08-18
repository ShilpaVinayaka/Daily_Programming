/*
The captain of the ship INS Chakra wants to select someone from his crew for help. Everyone seems eligible and
so he decides to test their intelligence with a game and pick the one that wins. The members will have to stand in
a line and they will be numbered in the order in which they stand, starting from 1. The point is - in his first pass, 
the captain will remove all the members standing in the odd position. This process of removal will continue for several 
passes until there is just one person left. The captain gives them just 30 seconds to line up. Imagine yourself to be a 
crew member and design an algorithm that will help you choose the perfect place to stand in the line so that you win!

Hints :
Members are numbered in the order - 1,2,3,4,5,6,7,8
After the first pass, members in these positions are safe - 2,4,6,8
After the second pass, members in these positions are safe - 4,8
The winner is at the position - 8 !
*/

#include <iostream>
using namespace std;

int main()
{
    int n;
    cout<<"Enter Number of crew members: "<<endl;
    cin>>n; int a[100];
    
    for(int i=0;i<n;i++)
        a[i] = i+1;
    int len = n;   
    while(len>0)
    {
        int i = 0;
        for(int i=0; i<len; i++)
        {
            for(int j=i;j<len-1;j++)
               {
                   a[j] = a[j+1];
               }
               len--;
        }
    }
    cout<<"Winner: "<<a[0]<<endl;
}
