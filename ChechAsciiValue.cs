using System;

using System.Collections.Generic;

using System.Linq;

using System.Text;

using System.Threading.Tasks;

 

namespace VP_Assignment1

{

classProblem1

    {

staticvoid Main(string[] args)

        {

char a;

int b;

Console.WriteLine("\t\tName: Ehtesham Mehmood\n\t\tRoll No: 11014119-131\n\t\tSection: AE\n \t\t        UOG\n");

Console.WriteLine("Enter A Letter Between a-z:");

            a = Convert.ToChar(Console.ReadLine());

            b = (int)a;

if (b >= 97 && b <= 122)

            {

                b = b - 32;

 

                a = (char)b;

Console.WriteLine("In Upper Case Letter:" + a);

            }

else

            {

 

Console.WriteLine("You Enter Wrong Letter, Please Enter Letter Between a-z....!");

            }

Console.ReadKey();

 

 

        }

    }

}