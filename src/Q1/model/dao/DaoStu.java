package Q1.model.dao;

import Q1.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface DaoStu {

    void insert(Student student) throws SQLException;

    Student findById(int id) throws SQLException;

    void update (Student student) throws SQLException;

    void deleteById(String  id) throws SQLException;

    List<Student> findAll() throws SQLException;

    List<Object> findTeachers (int id) throws SQLException;

}// end of interface
