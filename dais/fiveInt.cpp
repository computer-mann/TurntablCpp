#include <iostream>

using namespace std;

float meanCal(int a,int b,int c,int d,int);

int modeCal(int a,int b,int c,int d,int);

int medianCal(int a,int b,int c,int d,int);


int main()
{
    int one,two,three,four,five;
    cout << "Welcome to basic Statistic. " << endl;
    cout << "Enter the numbers:" << endl ;
    cout << "First Number:" << endl;
    cin >> one;
    cout << "Second Number:" << endl;
    cin >> two;
    cout << "Third Number:" << endl;
    cin >> three;
    cout << "Fourth Number:" << endl;
    cin >> four;
    cout << "Fifth Number:" << endl;
    cin >> five;

    cout << "The mean is: " << meanCal(one,two,three,four,five) << endl;
}

 float meanCal(int a,int b,int c,int d,int e)
 {
     float mean= (a+b+c+d+e)/5;
     return mean;
 }

//The most occurring number
int modeCal(int a,int b,int c,int d,int)
{
    
}
//The middle number
int medianCal(int a,int b,int c,int d,int)
{

}