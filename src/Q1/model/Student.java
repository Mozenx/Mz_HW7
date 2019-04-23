package Q1.model;

public class Student {
    private String fName, lname, sId;

    public Student(String fName, String lname, String sId) {
        this.fName = fName;
        this.lname = lname;
        this.sId = sId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }
}
