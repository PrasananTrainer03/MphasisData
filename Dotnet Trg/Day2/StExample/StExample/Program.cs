using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StExample
{
    class Demo
    {
        public void Show()
        {
            Console.WriteLine("Show Method from Demo Class...");
        }

        public static void Display()
        {
            Console.WriteLine("Display Method from Demo Class...");
        }
        static void Main(string[] args)
        {
            Demo.Display();
            Demo obj = new Demo();
            obj.Show();
        }
    }
}
