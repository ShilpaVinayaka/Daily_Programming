/*
A big state level tournament is coming up. A sports academy is preparing their students for the same and has formed two groups, 
namely Group A and Group B. Each group contains 6 players. Both the teams are said to be compatible if they are of the same size 
and if the player in ith position in group A is greater than the player in ith position in group B, for all i. Write an algorithm for the same.

*/

#include <iostream>
using namespace std;

int main()
{
    int a,b;
    cout<<"Enter the size if Group A and B:\n";
    cin>>a>>b;
    if(a==b)
    {
        int g1[100], g2[100];
        
        cout<<"Enter the values of group A\n";
        for(int i=0;i<a;i++)
            cin>>g1[i];
            
        cout<<"Enter the values of group A\n";
        for(int i=0;i<b;i++)
            cin>>g2[i];    
            
        int flag = 0;
        for(int i=0;i<a;i++)
        {
            if(g1[i]<g2[i])
            {
                flag = 1;
                cout<<"Group A and B are not compatible\n"<<endl;
                break;
            }
        }
        if(flag==0)
            cout<<"Group A and B are compatible\n"<<endl;
    }
    else{
        cout<<"Group A and B are not compatible\n"<<endl;
        return 0;
    }
}
