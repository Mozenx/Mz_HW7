package Q4.model.dao;

import Q4.model.Student;
import Q4.model.Teacher;

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
        String query = "insert into teachers values('"+teacher.getfName()+"','"+teacher.getlName()+"','"+teacher.gettId()+"')";
        stmt.executeUpdate(query);
        closeConn();
    }

    @Override
    public Teacher findById(String  id) throws SQLException {
        initConn();
        String query = "select * from teachers where tchId="+id;
        ResultSet rs = stmt.executeQuery(query);
        Teacher tc = null;
        while (rs.next())
            new Teacher(rs.getString("lName"),rs.getString("lName"),rs.getString("tchId"));
        return tc;
    }

    @Override
    public void update(Teacher teacher) throws SQLException {

        initConn();
        String query = "update teachers set fName='"+teacher.getfName()+"',lName='"+teacher.getlName()+
                "',tchId='"+teacher.gettId()+"'where tchId="+teacher.gettId();
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
                    rs.getString("tchId")));
        closeConn();
        return teachers;
    }

    @Override
    public List<Student> findTeachers(String  tchId) throws SQLException {

        initConn();
        String query = "select students.fName , students.lName from students join stu_tch on students.stId = stu_tch.stId where stu_tch.tchId="+tchId;
        ResultSet rs = stmt.executeQuery(query);
        List<Student> student = new ArrayList<>();
        while (rs.next()) {
            student.add(new Student(rs.getString("fName"), rs.getString("lName")));
        }
        return student;
    }

    @Override
    public void insertToStuTch(String stId,String tchId) throws SQLException{
        initConn();
        String query = "insert into stu_tch ('"+stId+"','"+tchId+"')";
        stmt.executeUpdate(query);
        closeConn();
    }
}//end of class
