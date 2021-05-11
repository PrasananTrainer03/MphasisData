using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StaticExample
{
    class Cricket
    {
        static int score;
        public void Incr(int x)
        {
            score += x;
        }
        static void Main(string[] args)
        {
            Cricket fb = new Cricket();
            Cricket sb = new Cricket();
            Cricket ext = new Cricket();

            fb.Incr(53);
            sb.Incr(11);
            ext.Incr(8);

            Console.WriteLine("Total Score is  " +Cricket.score);
        }
    }
}
