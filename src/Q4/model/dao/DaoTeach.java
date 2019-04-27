package Q1.model.dao;

import Q1.model.Student;
import Q1.model.Teacher;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface DaoTeach {

    void insert(Teacher teacher) throws SQLException;

    Teacher findById(String  id) throws SQLException;

    void update (Teacher teacher) throws SQLException;

    void deleteById(String  id) throws SQLException;

    List<Teacher> findAll() throws SQLException;

    List<Student> findTeachers (String  tchId) throws SQLException;

    void insertToStuTch(String stId,String tchId) throws SQLException;

}
