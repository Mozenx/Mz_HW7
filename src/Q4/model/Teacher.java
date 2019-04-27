package Q4.model;

import java.util.List;

public class Teacher {
    private String fName, lName, tId;
    private List<Student> studentsOf;

    public Teacher(String fName, String lName, String tId) {
        this.fName = fName;
        this.lName = lName;
        this.tId = tId;
    }

    public Teacher(){

    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public void addToList(Student student){
        studentsOf.add(student);
    }

    public void show() {
        for (Student stu : studentsOf)
            System.out.println(stu.getfName());
    }

}// end of class
