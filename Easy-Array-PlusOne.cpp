/*
Plus One:
Given a non-negative number represented as an array of digits, 
add 1 to the number ( increment the number represented by the digits ). 
The digits are stored such that the most significant digit is the first element of the array

Input : [1, 2, 4]
Output : [1, 2, 5]

Input : [9, 9, 9]
Output : [1, 0, 0, 0]

*/

#include <bits/stdc++.h>

using namespace std;
vector<int> increment(vector<int>& a ) {
        int n = a.size();
        a[n-1] += 1;
        int carry = a[n-1]/10;
        a[n-1] = a[n-1]%10;
        
        for (int i = n-2; i>=0; i--)
        {
            if (carry == 1){
                a[i] += 1;
                carry = a[i]/10;
                a[i] = a[i]%10;
            }
        }
        if(carry==1)
            a.insert(a.begin(),1);
            
        return a;
        
    }
int main()
{
    int n;
    cin>>n;
    vector<int> vect;
    for(int i=0; i<n; i++){
        int ele;
        cin>>ele;
        vect.push_back(ele);
    }
    increment(vect);
    
    for (int i = 0; i < vect.size(); i++)
        cout << vect[i] << " ";

    return 0;
}
