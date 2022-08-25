/*
A grocery shop gives discount of 10% on a particular product if the cost of the quantity purchased crosses 1000.  
The price of one piece of this product is Rs. 100. Write an algorithm to calculate the price a person will have 
to pay, given the quantity he purchased.
*/

#include <iostream>
using namespace std;

int main()
{
    int n;
    float totAmt;
    cout<<"Enter qunatity Number\n";
    cin>>n;
    
    //price of one piece of this product is Rs. 100.
    int amt = n * 100;
    
    if(amt>1000)
    {
        //10% discount
        totAmt = amt - (amt * 10 / 100);
        cout<<totAmt;
    }
    else
        cout<<amt<<endl;
  
}
