/*
A grand discount sale is announced by 3 vendors - Flipkart, Amazon and Snapdeal for the products
- mobile, laptop, speakers, power bank and USB.  Ms. Grace wants to identify which vendor supplies each product
for the least price. For example, if a laptop is sold for 45000, 42000, and 46000 by the three vendors, then she
must be able to identify that the laptop from Amazon has the least price of Rs.42000. This has to be done for all
the 5 products. Help Grace with an algorithm that displays the least price of each product along with the vendor that sells it. 
The flow has to terminate abruptly displaying – ‘Invalid Input’, if a price entered is negative.
*/

#include <iostream>
using namespace std;

int main()
{
    int a[5][3];
    
    cout<<"Enter price of products of each company in a line:"<<endl;
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<3;j++)
        {
            cin>>a[i][j];
            if(a[i][j]<0)
            {
                cout<<"Invalid Input";
                return 0;
            }
        }
    }
    string str[3]={"Flipkart", "Amazon", "Snapdeal"};

    for(int i=0;i<5;i++)
    {
        int min = a[i][0];
        int index = 0;
        for(int j=1;j<3;j++)
        {
            if(min>a[i][j])
                {
                    min = a[i][j];
                    index = j;
                }
        }
        cout<<"Product "<<i+1<<"price: "<<min<<"\t Company: "<<str[index]<<endl;
    }

}
