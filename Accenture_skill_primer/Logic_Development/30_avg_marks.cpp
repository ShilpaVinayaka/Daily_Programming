/*
A new employee has joined a company. He is allocated projects during his probation. He is given a score for each project he finishes. Assume that the number of projects will not exceed 10. The project manager who is notified every project score, checks for the average of scores. If the average is above 80 he is allocated with the real project, else he is given more assignments. Write an algorithm for the same.
*/

#include <iostream>
using namespace std;

int main()
{
    int n;
    cout<<"Enter number of subjects:"<<endl;
    cin>>n;
    
    int a[n], sum=0;
    cout<<"Enter marks of each project: (Max Marks = 100)"<<endl;
    
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
        sum = sum+a[i];
    }
    
    int avg = sum/n;
    cout<<"Average = "<<avg<<endl;
    if(avg>80)
        cout<<"Real project allocated"<<endl;
    else
        cout<<"More Assignments"<<endl;
}
