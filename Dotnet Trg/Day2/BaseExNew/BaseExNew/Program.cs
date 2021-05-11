using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BaseExNew
{
    class Employ
    {
        int empno;
        string name;
        double basic;

        public Employ(int empno, string name, double basic)
        {
            this.empno = empno;
            this.name = name;
            this.basic = basic;
        }

        public override string ToString()
        {
            return "Employ No " + empno + " Employ Name  " + name + " Basic  " + basic;
        }
    }

    class Nandana : Employ
    {
        public Nandana(int empno, string name, double basic) : base(empno, name, basic)
        {

        }
    }

    class Raji : Employ
    {
        public Raji(int empno, string name, double basic)  : base(empno, name, basic)
        {

        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Employ e1 = new Nandana(1, "Nandana", 88234);
            Employ e2 = new Raji(3, "Raji", 88266);
            Console.WriteLine(e1);
            Console.WriteLine(e2);
        }
    }
}
