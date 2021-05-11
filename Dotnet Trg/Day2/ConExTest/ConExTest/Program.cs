using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConExTest
{
    class Employ
    {
        int empno;
        string name;
        double basic;

        public Employ()
        {
            empno = 1;
            name = "Raj";
            basic = 88234;
        }

        public Employ(int empno, string name, double basic)
        {
            this.empno = empno;
            this.name = name;
            this.basic = basic;
        }

        public override string ToString()
        {
            return "Employ No " + empno + " Name  " + name + " Basic  " + basic;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Employ employ1 = new Employ();
            Console.WriteLine(employ1);
            Employ employ2 = new Employ(3, "Maneesh", 88234);
            Console.WriteLine(employ2);
        }
    }
}
