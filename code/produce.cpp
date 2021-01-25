#include <iostream>

using namespace std;

bool isEven(int number);

// If the number is even, produce a twenty row multiplication table for the numbe
void rowMultiplication(int number);

//the entered value is odd,
// then produce a table containing the first thirty integers NOT divisible by the entered value
void notDivisiblebythenumber(int number);


int main()
{
    int number;
    cout << "This is number the third question. " << endl;
    cout << "Please enter a number: " << endl;

    cin >> number;

    if(isEven(number))
    {
        cout << "___________________________________________________________________" << endl;
        rowMultiplication(number);
    }else
    {
        cout << "___________________________________________________________________odd" << endl;
        notDivisiblebythenumber(number);
    }
    
    return 0;

}

bool isEven(int number)
{
    if(number % 2 == 0) return true;

    return false;
}

void rowMultiplication(int number)
{
    for(int i=1;i<=20;i++)
    {
        cout << i << " x " << number << " = " << i*number << endl; 
    }
}

void notDivisiblebythenumber(int number)
{
    cout << "jfshjd" << endl;
    int delimiter=1;
    int start=0;
    while(delimiter <=5)
    {
        if(start % number != 0)
        {
            cout << start << endl;
            delimiter++;
            cout << delimiter << endl;
            start++;
        }
    }
    
}