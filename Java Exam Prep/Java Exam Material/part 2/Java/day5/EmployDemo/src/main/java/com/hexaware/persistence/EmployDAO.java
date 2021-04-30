package com.hexaware.persistence;
import com.hexaware.model.Employ;
import java.util.List;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

public interface EmployDAO {

       @SqlUpdate("DELETE FROM EMPLOY WHERE EMPNO=:empno")
       void deleteEmploy(@Bind("empno") int empno);

       @SqlUpdate("INSERT INTO EMPLOY(Name, Dept, Desig, Basic)" 
       + "VALUES(:name,:dept,:desig,:basic)")
       void addEmploy(@Bind("name") String name, @Bind("dept") String dept,
            @Bind("desig") String desig, @Bind("basic") int basic);
        
       @SqlQuery("SELECT * FROM EMPLOY WHERE Empno=:eno")
       @Mapper(EmployMapper.class)
       Employ show(@Bind("eno") int eno);

       @SqlQuery("SELECT * FROM EMPLOY WHERE dept=:dept")
       @Mapper(EmployMapper.class)
       List<Employ> showByDept(@Bind("dept") String dept);


       @SqlQuery("SELECT * FROM EMPLOY")
       @Mapper(EmployMapper.class)
       List<Employ> showEmploy();
}