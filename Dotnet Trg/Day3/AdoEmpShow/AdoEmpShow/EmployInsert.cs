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
    class EmployInsert
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
            SqlDataAdapter ad = new SqlDataAdapter("select * from Emp", conn);
            SqlCommandBuilder cmd = new SqlCommandBuilder(ad);
            DataSet ds = new DataSet();
            ad.Fill(ds, "Emp");
            DataRow dr = ds.Tables["Emp"].NewRow();
            dr["empno"] = empno;
            dr["nam"] = name;
            dr["dept"] = dept;
            dr["desig"] = desig;
            dr["basic"] = basic;
            ds.Tables["Emp"].Rows.Add(dr);
            ad.Update(ds, "Emp");
            Console.WriteLine("*** Record Inserted ***");
        }
    }
}
