package com.hexaware.factory;
import com.hexaware.persistence.EmployDAO;
import java.util.List;
import com.hexaware.model.Employ;
import com.hexawarae.persistence.DbConnection;

public class EmployFactory {

  public EmployFactory() {

  }

  public static String deleteEmploy(int empno) {
    dao().deleteEmploy(empno);
    return "Record Deleted Successfully...";
  }
  public static String insertEmploy(String name, String dept, String desig, int basic) {
    dao().addEmploy(name, dept, desig, basic);
    return "Employ Record Inserted...";
  }
  public static Employ show(int empno) {
    return dao().show(empno);
  }
  
  private static EmployDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(EmployDAO.class);
  }

//   public static List<Employ> showEmploy() {
//       return dao().showEmploy();
//   }
  public static Employ[] showEmploy() {
    List<Employ> employees = dao().showEmploy();
    return employees.toArray(new 
      Employ[employees.size()]);
  }
}