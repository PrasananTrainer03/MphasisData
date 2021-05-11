using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data;
using System.Data.SqlClient;
using System.Threading.Tasks;

namespace AdoSpExample
{
    public class EmployDao
    {
        public string DeleteEmp(int empno)
        {
            SqlConnection conn = ConnectionHelper.GetConnection();
            conn.Open();
            SqlCommand cmd = new SqlCommand("prcEmpDelete", conn);
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.Parameters.AddWithValue("@empno", empno);
            cmd.ExecuteNonQuery();
            return "Record Deleted...";
        }
        public SqlDataReader SearchEmp(int empno)
        {
            SqlConnection conn = ConnectionHelper.GetConnection();
            conn.Open();
            SqlCommand cmd = new SqlCommand("prcEmpSearch", conn);
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.Parameters.AddWithValue("@empno", empno);
            SqlDataReader dr = cmd.ExecuteReader();
            return dr;
        }

        public string AddEmploy(Emp emp)
        {
            SqlConnection conn = ConnectionHelper.GetConnection();
            conn.Open();
            SqlCommand cmd = new SqlCommand("prcEmpInsert", conn);
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.Parameters.AddWithValue("@empno", emp.Empno);
            cmd.Parameters.AddWithValue("@name", emp.Name);
            cmd.Parameters.AddWithValue("@dept", emp.Dept);
            cmd.Parameters.AddWithValue("@desig", emp.Desig);
            cmd.Parameters.AddWithValue("@basic", emp.Basic);
            cmd.ExecuteNonQuery();
            return "Record Inserted...";
        }
        public SqlDataReader ShowEmp()
        {
            SqlConnection conn = ConnectionHelper.GetConnection();
            conn.Open();
            SqlCommand cmd = new SqlCommand("prcEmpShow", conn);
            cmd.CommandType = CommandType.StoredProcedure;
            SqlDataReader dr = cmd.ExecuteReader();
            return dr;
        }
    }
}
