/*
In a class room, students are seated in the form of a square matrix of order n*n. A nominee for the post of class representative is to be selected from each row. The student with the highest mark in each row is the one nominated from that row. Given the marks of the students in the row wise order of their seating, can you write an algorithm that displays the positions of the nominees in each row?
*/

#include <iostream>
using namespace std;

int main()
{
    int r,index;
    cout<<"Enter total num of rows:"<<endl;
    cin>>r;

    int a[r][r];
    cout<<"Enter Scores: "<<endl;
    for(int i=0;i<r;i++)
        for(int j=0;j<r;j++)
            cin>>a[i][j];
            
    int max[r] = {0};
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<r;j++)
        {
            if(max[i]<a[i][j])
            {
                max[i] = a[i][j];
                index = j;
            }
        }
        cout<<endl<<"Row "<<i+1<<endl;
        cout<<"Highest  Mark: "<<max[i];
        cout<<" at position "<<index+1<<endl;
    }

}
