using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StrExamples
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = "Welcome to Dotnet Programming...Nandana";
            Console.WriteLine("Length of String " +str.Length);
            Console.WriteLine("Lower Case " +str.ToLower());
            Console.WriteLine("Upper Case  " +str.ToUpper());
            Console.WriteLine("First Occurrence of Char 'o' is " +str.IndexOf("o"));
            string s1 = "Vandana", s2 = "Mallika", s3 = "Vandana";
            Console.WriteLine(s1.Equals(s2));
            Console.WriteLine(s1.Equals(s3));
            Console.WriteLine("Substring  " +str.Substring(3,8));
            Console.WriteLine("Replaced String is  " +str.Replace("Dotnet","MVC"));
        }
    }
}
