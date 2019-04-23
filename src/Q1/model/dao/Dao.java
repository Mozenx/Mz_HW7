package Q1.model.dao;

import Q1.model.Student;
import Q1.model.Teacher;

import java.sql.SQLException;
import java.util.List;

public interface Dao {

    void insert(Student student) throws SQLException;

    Student findById(int id) throws SQLException;

    void update (Student student) throws SQLException;

    void deleteById(int id) throws SQLException;

    List<Object> findAll() throws SQLException;

    List<Teacher> findTeachers () throws SQLException;

}
