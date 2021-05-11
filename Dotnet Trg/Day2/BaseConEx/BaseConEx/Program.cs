﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BaseConEx
{
    class First
    {
        public void Show()
        {
            Console.WriteLine("Show Method from Class First...");
        }
    }

    class Second : First
    {
        public void Show()
        {
            base.Show();
            Console.WriteLine("Show Method from Class Second...");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Second obj = new Second();
            obj.Show();
        }
    }
}
