#include <iostream>

using namespace std;

int main()
{
    int a, b;
    cout<<"Enter first number : ";
    cin>>a;
    cout<<"Enter second number : ";
    cin>>b;

    int cond = (a<b)? a: b;

    int gcd = 1;

    for(int i =1; i<=cond ; i++)
    {
      if( (a%i == 0 ) && (b%i == 0) )
      {
          gcd = i;
      }
    }

    cout<<"GCD of "<<a<<" and "<<b<<" is : "<<gcd;

}
