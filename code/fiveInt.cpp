#include <iostream>
#include <string>

using namespace std;

float meanCal(int a,int b,int c,int d,int);

string modeCal(int a,int b,int c,int d,int);

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

    cout << "The mean is: " << meanCal(one,two,three,four,five) << endl << endl;

    cout << "The median is : " << medianCal(one,two,three,four,five) << endl << endl;

    cout << "The mode is : " << modeCal(one,two,three,four,five) << endl << endl;
}

 float meanCal(int a,int b,int c,int d,int e)
 {
     float mean= (a+b+c+d+e)/5;
     return mean;
 }

//The most occurring number
string modeCal(int a,int b,int c,int d,int e)
{
    int themode;//largest;
    int array[5]= {a,b,c,d,e};
    int noOfNumbers[5]={0};

    //Check the numbers to find the 
    for(int i=0;i <5;i++)
    {
        for(int j=1;j<4;j++)
        {
            if(array[i] == array[j] )
            {
                noOfNumbers[i] += 1;
            }
        }
    }

    //Find the most common by finding the largest of the numofnumbers variable.
    //themode is the largetsVAr
    int largest=noOfNumbers[0];
    int tempIndex = 0;
    string somethingChanged="no";
    for(int i=1;i<5;i++)
    {
        if(noOfNumbers[i] > themode)
        {
            largest=noOfNumbers[i];
            tempIndex=i;
            somethingChanged="yes";
        }
    }

    
    if(somethingChanged == "yes")
    {
        themode=array[tempIndex];
        return to_string(themode);
    }else
    {
        return "The data has no mode.";
    }


}
//The middle number
int medianCal(int a,int b,int c,int d,int e)
{
    //Since the count of the numbers are odd
    //i can just return the middle number.

    return c;
}