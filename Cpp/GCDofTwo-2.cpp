#include <iostream>

using namespace std;


int main()
{
    int a,b;
    cout<<"Enter first number :";
    cin>>a;
    cout<<"Enter second number :";
    cin>>b;

    int minm = (a<b)? a: b;
    int maxm = (a>b)? a: b;
    int gcd = minm;

    while(true)
    {
        minm = maxm % minm ;
        if (minm == 0)
        {
            break;
        }

        gcd = minm;
    }

    cout<<endl<<"GCD of "<<a<<" and "<<b<<" is :"<<gcd<<endl;


}
