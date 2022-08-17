/*
Tony crosses a street that is ‘x’ m long in 'y' minutes. 
Write an algorithm to compute his speed in km per hour, given x and y.

Hint: speed=distance/time

*/

#include <iostream>

using namespace std;

void calc_speed(float dist, float time)
{
    if (time<=0 || dist <=0)
        {
            cout<<"Invalid Input"<<endl;
            return;
        }
    float speed = dist / time;
    cout<<"Speed = " << speed << " Km/Hr";
}

int main()
{
    float x,y;
    float dist, time;
    cout<<"Enter dist in meter and time in minutes: \n";
    cin>>x>>y;
    
    //convert x to Kilometer
    dist = x/1000;
    
    //convert y to Hours
    time = y/60;
    
    calc_speed(dist,time);
    
}
