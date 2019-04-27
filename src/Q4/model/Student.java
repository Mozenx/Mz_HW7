package Q1.model;

import java.util.List;

public class Student {
    private String fName;
    private String lName;
    private String sId;
    private List<Teacher> teachersOf;

    public Student(String fName, String lName, String sId) {
        this.fName = fName;
        this.lName = lName;
        this.sId = sId;

    }

    public Student(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    private String tId;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return lName;
    }

    public void setLname(String lname) {
        this.lName = lname;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }


}// end of class
