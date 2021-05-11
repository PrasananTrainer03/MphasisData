using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConEx
{
    class Demo
    {
        static Demo()
        {
            Console.WriteLine("Static Constructor...");
        }

        Demo()
        {
            Console.WriteLine("Default Constructor...");
        }
        static void Main(string[] args)
        {
            Demo obj = new Demo();
        }
    }
}
