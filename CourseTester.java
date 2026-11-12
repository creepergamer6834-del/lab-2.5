/*
 * REQ 01: answer both questions after you write the two StudentRecord
 * constructors in REQ 02.
 *
 * 1. new StudentRecord("Dana Lee") runs a constructor whose only line
 *    is this(name, new int[0]). Which constructor's body finishes
 *    first? Why does only the two-parameter constructor need to set
 *    name and scores?
 *    Answer:
 *
 * 2. StudentRecord will have both getAverage() and
 *    getAverage(int first, int last). Why does Java allow two methods
 *    with the same name? Why would it reject a third method,
 *    public int getAverage()?
 *    Answer:
 */
public class CourseTester {
    public static void main(String[] args) {
        StudentRecord john = new StudentRecord("John Doe", new int[] {80, 90, 100, 95});
        System.out.println("john.getName() (expect John Doe): " + john.getName());
        StudentRecord dana = new StudentRecord("Dana Lee");
        System.out.println("dana.getScores().length (expect 0): " + dana.getScores().length);
    }
}
