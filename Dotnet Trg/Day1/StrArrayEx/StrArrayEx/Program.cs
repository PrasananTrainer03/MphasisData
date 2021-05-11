using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StrArrayEx
{
    class Demo
    {
        public void Show()
        {
            string[] names = new string[]
            {
                "Nandana","Ravali","Raju","Mani","Sai"
            };
            foreach(string s in names)
            {
                Console.WriteLine(s);
            }
        }
        static void Main(string[] args)
        {
            Demo obj = new Demo();
            obj.Show();
        }
    }
}
