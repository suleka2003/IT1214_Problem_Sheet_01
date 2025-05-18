class Student {
    private int studentId;
    private String name;
    private int daysAttended;

    public Student(int studentId, String name, int daysAttended) {
        setStudentID(studentId);
        setName(name);
        setDaysAttended(daysAttended);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getDaysAttended() {
        return daysAttended;
    }

    public void setDaysAttended(int daysAttended) {
        this.daysAttended = daysAttended;
    }

    public void setStudentID (int studentID) {
        this.studentId = studentID;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void displayStudentDetails() {
        System.out.println("ID: " + studentId + ", Name: " + name + ", Days Attended: " + daysAttended);
    }
}

class Classroom {
    private Student[] students;
    private int studentCount;

    public Classroom() {
        students = new Student[10];
        studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("Classroom is full!");
        }
    }

    public void updateAttendance(int studentId, int newDaysAttended) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId() == studentId) {
                students[i].setDaysAttended(newDaysAttended);
                return;
            }
        }
        System.out.println("Student ID " + studentId + " not found.");
    }

    public void displayAllStudents() {
        for (int i = 0; i < studentCount; i++) {
            students[i].displayStudentDetails();
        }
    }
}

public class Question_01 {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        
        classroom.addStudent(new Student(101, "Alice Smith", 12));
        classroom.addStudent(new Student(102, "Bob Jones", 15));
        classroom.addStudent(new Student(103, "Carol Lee", 10));

        classroom.updateAttendance(102, 16);
        classroom.updateAttendance(104, 5); // Invalid ID test case

        classroom.displayAllStudents();
    }
}