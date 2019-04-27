package Q1.model.dao;

import Q1.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements DaoStu {

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
    public void insert(Student student) throws SQLException {

        initConn();
        String query = "insert into students values('"+student.getfName()+"','"+student.getLname()+"','"+student.getsId()+"')";
        stmt.executeUpdate(query);
        closeConn();

    }

    @Override
    public Student findById(String  id) throws SQLException {

        initConn();
        String query = "select * from students where sId="+id;
        ResultSet rs = stmt.executeQuery(query);
        Student stu = null;
        while (rs.next())
            new Student(stu.getfName(),stu.getLname(),stu.getsId());
        return stu;
    }

    @Override
    public void update(Student student) throws SQLException {

        initConn();
        String query = "update students set fName='"+student.getfName()+"',lName='"+student.getLname()+
                "',stId='"+student.getsId()+"' where stId="+student.getsId();
        stmt.executeUpdate(query);
        closeConn();

    }

    @Override
    public void deleteById(String  id) throws SQLException {

        initConn();
        String query = "delete from students where students.stId = "+id;
        stmt.executeUpdate(query);
        closeConn();

    }

    @Override
    public List<Student> findAll() throws SQLException {

        initConn();
        String query = "select * from students";
        ResultSet rs = stmt.executeQuery(query);
        List<Student> students = new ArrayList<>();
        while (rs.next())
            students.add(new Student(rs.getString("fName"),rs.getString("lName"),
                    rs.getString("stId")));
        closeConn();
        return students;
    }

    @Override
    public List<Object> findTeachers(int id) throws SQLException {

        initConn();
        List<Object> teachers = new ArrayList<>();
        String query = "select fName.teachers from students join stu_tch on students.sId=stu_tch.sId where sId="+id;
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next())
            teachers.add(new Student(rs.getString("fName"),rs.getString("lName"),
                    rs.getString("sId")));
        closeConn();
        return teachers;
    }

    @Override
    public void insertToStuTch(String stId,String tchId) throws SQLException{
        initConn();
        String query = "insert into stu_tch values('"+stId+"','"+tchId+"')";
        stmt.executeUpdate(query);
        closeConn();
    }


}//end of class
