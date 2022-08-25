/*
To decide on an employee's work allotment, the manager asks for his/her age, sex (M or F), marital status (Y or N). 
He then applies the following rules to decide on their place of service:
If the employee is a female and is married, then she will work  in urban areas.
If the employee is a male, married and if the age is between 20 and 40, then he could be put to work anywhere.
If employee is a male, unmarried and if the age is between 40 and 60, then he will work in urban areas. 

Write an algorithm for the same.
*/

#include <iostream>
using namespace std;

int main()
{
    int age;
    char gen, stat;
    cin>>age>>gen>>stat;
    gen = toupper(gen);
    stat = toupper(stat);
    
    if(gen =='F' && stat=='Y')
        cout<<"Urban Area";
    else if(gen =='M' && stat=='Y' && age>20 && age<=40)
        cout<<"Work anywhere";
    else if(gen =='M' && stat=='N' && age>40 && age<=60)
        cout<<"Urban Area";
}
