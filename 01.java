class 01 {

    private int studentID;
    private String name;
    private int daysAttended;
    
    public Student (int studentID, String name, int daysAttended) {
        setStudentID(studentID);
        setName(name);
        setDaysAttended(daysAttended);
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getDaysAttended() {
        return daysAttended;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDaysAttended(int daysAttended) {
        this.daysAttended = daysAttended;
    }

    public static void main (String[] args) {

    }
}
