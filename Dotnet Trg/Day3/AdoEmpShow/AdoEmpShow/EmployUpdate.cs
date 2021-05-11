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
    class EmployUpdate
    {
        static void Main()
        {
            int empno, basic;
            string name, dept, desig;
            Console.WriteLine("Enter Employ No   ");
            empno = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Name   ");
            name = Console.ReadLine();
            Console.WriteLine("Enter Department  ");
            dept = Console.ReadLine();
            Console.WriteLine("Enter Designation  ");
            desig = Console.ReadLine();
            Console.WriteLine("Enter Basic   ");
            basic = Convert.ToInt32(Console.ReadLine());
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
                dr["nam"] = name;
                dr["dept"] = dept;
                dr["desig"] = desig;
                dr["basic"] = basic;
                ad.Update(ds, "Emp");
                Console.WriteLine("*** Record Updated ***");
            }
            else
            {
                Console.WriteLine("*** Record Not Found ***");
            }
        }
    }
}
