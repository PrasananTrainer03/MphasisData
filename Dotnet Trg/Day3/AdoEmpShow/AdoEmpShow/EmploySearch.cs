using System;
using System.Collections.Generic;
using System.Linq;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Text;
using System.Threading.Tasks;

namespace AdoEmpShow
{
    class EmploySearch
    {
        static void Main()
        {
            int empno;
            Console.WriteLine("Enter Employ no  ");
            empno = Convert.ToInt32(Console.ReadLine());
            string strcon = ConfigurationManager.ConnectionStrings["sqlpracticeconn"].ConnectionString;
            SqlConnection conn = new SqlConnection(strcon);
            SqlDataAdapter ad = new SqlDataAdapter("select * from Emp where empno=@empno", conn);
            ad.SelectCommand.Parameters.AddWithValue("@empno", empno);
            DataSet ds = new DataSet();
            ad.Fill(ds, "Emp");
            int count = ds.Tables["Emp"].Rows.Count;
            if (count == 1)
            {
                Console.WriteLine("Employ Name  " +ds.Tables["Emp"].Rows[0]["nam"]);
                Console.WriteLine("Department  " +ds.Tables["Emp"].Rows[0]["dept"]);
                Console.WriteLine("Designation  " +ds.Tables["Emp"].Rows[0]["desig"]);
                Console.WriteLine("Basic  " +ds.Tables["Emp"].Rows[0]["basic"]);
            }
            else
            {
                Console.WriteLine("*** Record Not Found ***");
            }
        }
    }
}
