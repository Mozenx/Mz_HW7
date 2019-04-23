package Q1.model;

public class Student {
    private String fName;
    private String lname;
    private String sId;

    public Student(String fName, String lname, String sId, String tId) {
        this.fName = fName;
        this.lname = lname;
        this.sId = sId;
        this.tId = tId;
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
}// end of class
