using System;

namespace SplitWords
{
    class ReferenceVar
    {
       
        static void Main(string[] args)
        {
            

            int x=5,y=6;
            Swapping(ref x, ref y);
            Console.WriteLine($" {x} and {y}");

        }

        static private void Swapping(ref int a , ref int b)
        {
            int temp=a;
            a=b;
            b=temp;

            Console.WriteLine($" {a} and {b}");
        }

        
    }
}
