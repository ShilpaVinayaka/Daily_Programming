/*
You are the class representative and your class adviser wants you to prepare the result analysis after every internal assessment. 
Given the scores of ‘N’ students in the class for 6 courses, one of the tasks in the analysis is to find the maximum mark scored 
in each course. Write an algorithm for the same. Marks cannot be negative or greater than 100. On such erroneous input, stop the 
flow deliberately displaying – ‘Invalid input’.
*/
#include <iostream>
using namespace std;

int main()
{
    int n;
    cout<<"Enter total num of students: "<<endl;
    cin>>n; int s[100];
    int marks;
    for(int i=0;i<6;i++)
        s[i] =0;
    
    for(int i=0;i<6;i++)
    {
        for(int j=0;j<n;j++)
        {
            cin>>marks;
            if(marks<0 || marks>100)
            {
                cout<<"Invalid Input"<<endl;
                return 0;
            }
            else{
                if(s[i]<marks)
                    s[i]=marks;
            }
        }
    }
    cout<<"High Scores of 6 subjects"<<endl;
    for(int i=0;i<6;i++)
        cout<<s[i]<<", ";
}
