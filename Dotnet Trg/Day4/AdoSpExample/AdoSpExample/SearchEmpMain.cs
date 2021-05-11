using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;
using System.Threading.Tasks;

namespace AdoSpExample
{
    class SearchEmpMain
    {
        static void Main()
        {
            int empno;
            Console.WriteLine("Enter Employ No   ");
            empno = Convert.ToInt32(Console.ReadLine());
            EmployDao dao = new EmployDao();
            SqlDataReader dr = dao.SearchEmp(empno);
            if (dr.Read())
            {
                Console.WriteLine("Employ Name  " + dr["nam"]);
                Console.WriteLine("Department  " + dr["dept"]);
                Console.WriteLine("Designation  " + dr["desig"]);
                Console.WriteLine("Basic   " + dr["basic"]);
            } else
            {
                Console.WriteLine("*** Record Not Found ***");
            }
        }
    }
}
