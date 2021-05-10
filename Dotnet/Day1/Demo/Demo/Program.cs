using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Demo
{
    class Data
    {
        public void Nandana()
        {
            Console.WriteLine("Hi I am Nandana...");
        }
        private void Raj()
        {
            Console.WriteLine("Hi I am Raj...");
        }
        internal void Prasanna()
        {
            Console.WriteLine("Hi I am Prasanna...");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Data obj = new Data();
            obj.Prasanna();
            obj.Nandana();
        }
    }
}
