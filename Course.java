public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public String toString() {
        String name = "== " + courseName + " ==\n";
        String full = "";
        for (int i = 0; i < enrolledStudents.length; i++) {
            int startNum = 1;
            full = startNum + ".) " + name.toString() + "\n";
        }
        return name + full;
    }

    public String findBestStudent() {

    }
}
