using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;
using System.Threading.Tasks;

namespace AdoEmpShow
{
    class EmployDelete
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
            SqlCommandBuilder cmd = new SqlCommandBuilder(ad);
            DataSet ds = new DataSet();
            ad.Fill(ds, "Emp");
            int count = ds.Tables["Emp"].Rows.Count;
            if (count == 1)
            {
                DataRow dr = ds.Tables["Emp"].Rows[0];
                dr.Delete();
                ad.Update(ds, "Emp");
                Console.WriteLine("*** Record Deleted ***");
            }
        }
    }
}
