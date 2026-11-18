public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[0];
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
        if (enrolledStudents != null) {
            for (int i = 0; i < enrolledStudents.length; i++) {
                full += (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
            }
        }
        return name + full;
    }

    public String findBestStudent() {
        if (enrolledStudents == null || enrolledStudents.length == 0) {
            return null;
        }
        String best = enrolledStudents[0].getName();
        int best1 = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[best1].getFinalAverage() < enrolledStudents[i].getFinalAverage()) {
                best1 = i;
                best = enrolledStudents[i].getName();
            }
        }
        return best;
    }

    public double calculateTestAverage(int testNumber) {
        if (enrolledStudents == null || enrolledStudents.length == 0) {
            return 0.0;
        }
        int students = enrolledStudents.length;
        double total = 0.0;
        double count = 0.0;

        for (int i = 0; i < students; i++) {
            total += enrolledStudents[i].getTestScore(testNumber);
            count += 1;
        }
        return total / count;
    }

    public void addStudent(StudentRecord newStudent) {
        if (newStudent == null) {
            return;
        }
        if (enrolledStudents == null) {
            enrolledStudents = new StudentRecord[1];
            enrolledStudents[0] = newStudent;
        } else {
            StudentRecord[] temp = new StudentRecord[enrolledStudents.length + 1];
            for (int i = 0; i < enrolledStudents.length; i++) {
                temp[i] = enrolledStudents[i];
            }
            temp[temp.length - 1] = newStudent;
            enrolledStudents = temp;
        }
    }

    public void addStudent(String name, int[] scores) {
        StudentRecord newStudent = new StudentRecord(name, scores);
        addStudent(newStudent);
    }
}