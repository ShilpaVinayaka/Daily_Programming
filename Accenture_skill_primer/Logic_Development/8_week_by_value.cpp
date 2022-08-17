/*
Mrs. Jessy teaches her 7-year-old daughter to tell the day of a week when Jessy tells a number between 1 to 7.  
Implement this scenario and generate an algorithm for the same.
*/

#include <iostream>

using namespace std;

int main()
{
  int x;
  cout<<"Enter Value: \n";
  cin>>x;
  
  switch(x)
  {
     case 1: cout<<"Sunday";
     break;
     case 2: cout<<"Monday";
     break;
     case 3: cout<<"Tuesday";
     break;
     case 4: cout<<"Wednesday";
     break;
     case 5: cout<<"Thursday";
     break;
     case 6: cout<<"Friday";
     break;
     case 7: cout<<"Saturday";
     break;
     default: cout<<"Invalid Input";
     break;
  }
  return 0;
}
