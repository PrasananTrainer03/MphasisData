using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AdoSpExample
{
    class AdoEmpDelete
    {
        static void Main()
        {
            int empno;
            Console.WriteLine("Enter Employ No   ");
            empno = Convert.ToInt32(Console.ReadLine());
            EmployDao dao = new EmployDao();
            string result = dao.DeleteEmp(empno);
            Console.WriteLine(result);
        }
    }
}
