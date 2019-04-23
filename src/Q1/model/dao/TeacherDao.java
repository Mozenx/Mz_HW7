package Q1.model.dao;

import Q1.model.Student;
import Q1.model.Teacher;
import Q1.model.UI.TeacherTable;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherDao implements DaoTeach{

    public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/universitym";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    private Connection conn;
    private Statement stmt;

    private void initConn() throws SQLException{
        conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        stmt = conn.createStatement();
    }
    private void closeConn() throws SQLException{
        stmt.close();
        conn.close();
    }

    @Override
    public void insert(Teacher teacher) throws SQLException {

        initConn();
        String query = "insert into teachers values('"+teacher.getfName()+"','"+teacher.getlName()+"','"+teacher.getsId()+"','"+teacher.gettId()+"')";
        stmt.executeUpdate(query);
        closeConn();
    }

    @Override
    public Teacher findById(int id) throws SQLException {
        initConn();
        String query = "select * from teachers where sId="+id;
        ResultSet rs = stmt.executeQuery(query);
        Teacher stu = null;
        while (rs.next())
            new Teacher(stu.getfName(),stu.getlName(),stu.getsId(),stu.gettId());
        return stu;
    }

    @Override
    public void update(Teacher teacher) throws SQLException {

        initConn();
        String query = "update teachers set fName='"+teacher.getfName()+"',lName='"+teacher.getlName()+
                "',stId='"+teacher.getsId()+"',tchId='"+ teacher.gettId()+"'where tchId="+teacher.gettId();
        stmt.executeUpdate(query);
        closeConn();
    }

    @Override
    public void deleteById(String id) throws SQLException {

        initConn();
        String query = "delete from teachers where tchId = "+id;
        stmt.executeUpdate(query);
        closeConn();

    }

    @Override
    public List<Teacher> findAll() throws SQLException {

        initConn();
        String query = "select * from teachers";
        ResultSet rs = stmt.executeQuery(query);
        List<Teacher> teachers = new ArrayList<>();
        while (rs.next())
            teachers.add(new Teacher(rs.getString("fName"),rs.getString("lName"),
                    rs.getString("tchId"),rs.getString("stId")));
        closeConn();
        return teachers;
    }

    @Override
    public List<Object> findTeachers(int id) throws SQLException {
        return null;
    }
}//end of class
