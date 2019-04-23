package Q1.model.dao;

import Q1.model.Student;
import Q1.model.Teacher;

import java.sql.SQLException;
import java.util.List;

public interface DaoTeach {

    void insert(Teacher teacher) throws SQLException;

    Student findById(int id) throws SQLException;

    void update (Teacher teacher) throws SQLException;

    void deleteById(String  id) throws SQLException;

    List<Student> findAll() throws SQLException;

    List<Object> findTeachers (int id) throws SQLException;

}
