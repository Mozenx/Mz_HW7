package Q1.model.dao;

import Q1.model.Object;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements Dao {

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
    public void insert(Object student) throws SQLException {

        initConn();
        String query = "insert into students values('"+student.getfName()+"','"+student.getLname()+"','"+student.getsId()+"','"+student.gettId()+"')";
        stmt.executeQuery(query);
        closeConn();

    }

    @Override
    public Object findById(int id) throws SQLException {

        initConn();
        String query = "select * from students where sId="+id;
        ResultSet rs = stmt.executeQuery(query);
        Object stu = null;
        while (rs.next())
            new Object(stu.getfName(),stu.getLname(),stu.getsId(),stu.gettId());
        return stu;
    }

    @Override
    public void update(Object object) throws SQLException {

        initConn();
        String query = "update students set fName='"+ object.getfName()+"',lName='"+ object.getLname()+
                "',sId='"+ object.getsId()+"',tId='"+ object.gettId()+"'where sId="+ object.getsId();
        stmt.executeUpdate(query);
        closeConn();

    }

    @Override
    public void deleteById(int id) throws SQLException {

        initConn();
        String query = "delete from students where sId = "+id;
        stmt.executeUpdate(query);
        closeConn();

    }

    @Override
    public List<java.lang.Object> findAll() throws SQLException {

        initConn();
        String query = "select * from students";
        ResultSet rs = stmt.executeQuery(query);
        List<java.lang.Object> students = new ArrayList<>();
        while (rs.next())
            students.add(new Object(rs.getString("fName"),rs.getString("lName"),
                    rs.getString("sId"),rs.getString("tId")));
        closeConn();
        return students;
    }

    @Override
    public List<java.lang.Object> findTeachers(int id) throws SQLException {

        initConn();
        List<java.lang.Object> teachers = new ArrayList<>();
        String query = "select fName.teachers from students join stu_tch on students.sId=stu_tch.sId where sId="+id;
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next())
            teachers.add(new Object(rs.getString("fName"),rs.getString("lName"),
                    rs.getString("sId"),rs.getString("tId")));
        closeConn();
        return teachers;
    }
}//end of class
