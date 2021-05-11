using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Threading.Tasks;

namespace AdoEmpShow
{
    class Program
    {
        static void Main(string[] args)
        {
            string strcon = ConfigurationManager.ConnectionStrings["sqlpracticeconn"].ConnectionString;
            SqlConnection conn = new SqlConnection(strcon);
            SqlDataAdapter ad = new SqlDataAdapter("select * from Emp", conn);
            DataSet ds = new DataSet();
            ad.Fill(ds, "Emp");
            foreach(DataRow dr in ds.Tables["Emp"].Rows)
            {
                Console.WriteLine("Employ No  " +dr["empno"]);
                Console.WriteLine("Employ Name  " +dr["nam"]);
                Console.WriteLine("Department   " +dr["dept"]);
                Console.WriteLine("Designation  " +dr["desig"]);
                Console.WriteLine("Basic  " +dr["basic"]);
                Console.WriteLine("----------------------------------------");
            }
        }
    }
}
