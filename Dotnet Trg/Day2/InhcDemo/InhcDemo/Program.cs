using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InhcDemo
{
    class First
    {
        public First()
        {
            Console.WriteLine("Base Class Constructor...");
        }
    }

    class Second : First
    {
        public Second()
        {
            Console.WriteLine("Derived Class Constructor...");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Second obj = new Second();
        }
    }
}
