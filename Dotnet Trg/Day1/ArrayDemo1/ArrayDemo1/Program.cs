using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArrayDemo1
{
    class Demo
    {
        public void Show()
        {
            int[] a = new int[] {45,23,67,2,65 };
            //for(int i = 0; i < a.Length; i++)
            //{
            //    Console.WriteLine(a[i]);
            //}
            foreach(int i in a)
            {
                Console.WriteLine(i);
            }
        }
        static void Main(string[] args)
        {
            Demo obj = new Demo();
            obj.Show();
        }
    }
}
