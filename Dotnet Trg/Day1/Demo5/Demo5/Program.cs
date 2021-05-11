using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Demo5
{
    class Demo
    {
        public void Show(int n)
        {
            int i = 0;
            while(i < n)
            {
                Console.WriteLine("Hi I am Nandana...");
                i++;
            }
        }
        static void Main(string[] args)
        {
            int n = 5;
            Demo obj = new Demo();
            obj.Show(n);
        }
    }
}
