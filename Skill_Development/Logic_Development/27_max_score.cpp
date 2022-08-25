/*
As a result of the final year on-campus, Tekno School of Computing wants to select the students, who have performed well in the interview. The report given is in the matrix format.   Now nominees for the post “placement coordinators” are to be selected. The students with highest interview score is the one to be nominated. The total number of inputs can be calculated using (m*n+2). The first input integer corresponds to m, the number of rows in the matrix( i.e. number of students) and the second integer corresponds to n, the number of columns(number of interview rounds). The remaining integers correspond to the elements in the matrix. The elements are read in row wise order, first row first, then second row and so on. Assume that the maximum value of m and n to be 10.

For ex: Consider in a 3x3 matrix, 9 values to be filled. 

                      round1    round2    round3

student1       1                  4               5

student2       6                  4               1

student3       2                 4                3

For this scenario, the total number of inputs is 11 calculated using formula(m*n+2). Here, ((3*3+2) =11). The input integers are 3,3,1,4,5,6,4,1,2,4,3. Here, first integer represents 3 rows, second integer represents 3 columns, the remaining integers are scores. (highest scores values can be calculated as follows (1+4+5), (6+4+1), (2+4+3). Here, The nominee with highest score 11 is student 2). If two or more students with same score, then they can be the nominated.  Write a Pseudo code for this scenario.
*/

#include <iostream>
using namespace std;

int main()
{
    int r,c;
    cout<<"Enter total num of students: "<<endl;
    cin>>r;
    cout<<"Enter total num of rounds: "<<endl;
    cin>>c;
    
    int a[r][c], sum[c] = {0};
    cout<<"Enter Scores: "<<endl;
    for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
            cin>>a[i][j];
            
    int max = 0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            sum[i] = sum[i] + a[i][j];
        }
        if(max<sum[i])
            max = sum[i];
    }
    cout<<"Highesht Score: "<<max<<endl;
    cout<<"Nominated: "<<endl;
    for(int i =0; i<c; i++)
    {
        if(sum[i] == max)
            cout<<"Student "<<i+1<<endl;
    }
}

