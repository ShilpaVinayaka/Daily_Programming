/*
A matrix is said to be row dominant if the sum of the elements along any row in the matrix is greater than the sum of the elements along every column in the matrix. Write an algorithm to determine whether the given matrix is row dominant or not.
*/

#include <iostream>
using namespace std;

int main()
{
    int r,c,index;
    cout<<"Enter total num of rowsand columns:"<<endl;
    cin>>r>>c;

    int a[r][c];int sum[r]={0}, sumC[c]={0};
    cout<<"Enter Scores: "<<endl;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<r;j++)
        {
            cin>>a[i][j];
            sum[i] = sum[i]+a[i][j];
        }
    }
                
    for(int i=0;i<c;i++)
        for(int j=0;j<r;j++)
          sumC[i] = sumC[i] + a[j][i];
          
    for(int i=0;i<r;i++)
    {
        int count=0;
        for(int j=0; j<c; j++)
        {
            if(sum[i]>sumC[j])
                count++;
        }
        if(count==c)
        {
            cout<<"Row Dominant"<<endl;
            return 0;
        }
    }
    
    cout<<"Not Row Dominant"<<endl;
}
