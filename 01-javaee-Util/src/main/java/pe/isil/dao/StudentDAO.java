package pe.isil.dao;

import pe.isil.model.Student;
import pe.isil.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {
    public void crear(Student student){
        Connection connection = null;
        try {
            connection= DatabaseUtil.getConnection();
            final String sql=
    "INSERT INTO tbl_student (name, last_name_father, last_name_mother,age) values(?,?,?,?)";
            PreparedStatement ps= connection.prepareStatement(sql);
            ps.setString(1,student.getName());
            ps.setString(2,student.getLastnamefather());
            ps.setString(3,student.getLastnamemother());
            ps.setInt(4,student.getAge());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
