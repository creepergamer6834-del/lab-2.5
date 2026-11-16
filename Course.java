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
            full = startNum + ".) " + enrolledStudents[i].getName().toString() + "\n";
        }
        return name + full;
    }

    public String findBestStudent() {
        String best = "";
        for (int i = 0; i < enrolledStudents.length; i++) {
            best = enrolledStudents[0].getName();
            int best1 = 0;
            if (enrolledStudents[best1].getFinalAverage() < enrolledStudents[i].getFinalAverage()) {
                best1 = i;
                best = enrolledStudents[i].getName();
            }
        }
        return best;
    }

    public double calculateTestAverage(int testNumber) {
        int students = enrolledStudents.length;
        double total = 0.0;
        double count = 0.0;

        for (int i = 0; i < students; i++) {
            total += enrolledStudents[i].getTestScore(testNumber);
            count += 1;
        }
        return total / count;
    }

}
