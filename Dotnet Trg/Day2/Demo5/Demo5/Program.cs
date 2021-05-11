using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Demo5
{
    class Employ
    {
        internal int empno;
        internal string name;
        internal double basic;

        public override string ToString()
        {
            return "Employ No  " + empno + " Employ Name  " + name + " Basic  " + basic;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Employ employ1 = new Employ();
            employ1.empno = 1;
            employ1.name = "Nandana";
            employ1.basic = 88234;

            Employ employ2 = new Employ();
            employ2.empno = 3;
            employ2.name = "Raj";
            employ2.basic = 88235;

            Console.WriteLine(employ1);
            Console.WriteLine(employ2);
        }
    }
}
