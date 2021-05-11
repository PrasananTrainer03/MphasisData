using System;
using System.Collections.Generic;
using System.Linq;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;
using System.Text;
using System.Threading.Tasks;

namespace AdoSpExample
{
    class Program
    {
        static void Main(string[] args)
        {
            EmployDao dao = new EmployDao();
            SqlDataReader dr = dao.ShowEmp();
            while (dr.Read())
            {
                Console.WriteLine("Employ No  " +dr["empno"]);
                Console.WriteLine("Employ Name  " +dr["nam"]);
                Console.WriteLine("Department  " +dr["dept"]);
                Console.WriteLine("Designation  " +dr["desig"]);
                Console.WriteLine("Basic   " +dr["basic"]);
                Console.WriteLine("------------------------------------");
            }
        }
    }
}
