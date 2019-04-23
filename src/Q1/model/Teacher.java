package Q1.model;

public class Teacher {
    private String fName, lName, tId;

    public Teacher(String fName, String lName, String tId) {
        this.fName = fName;
        this.lName = lName;
        this.tId = tId;
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
}
