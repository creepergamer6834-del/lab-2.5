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
        StudentRecord gleb = new StudentRecord("Gleb Shaludken", new int[] { 50, 60, 70, 80, 55, 3, 89 });
        System.out.println("gleb.getName() (expect Gleb Shaludken): " + gleb.getName());
        StudentRecord peter = new StudentRecord("Peter Gao", new int[] { 100, 99, 98, 100, 101, 97, 98 });
        System.out.println("peter.getScores().length " + peter.getScores().length);
        StudentRecord evan = new StudentRecord("Evan Li", new int[] { 100, 85, 90, 93, 92, 91, 89 });
        System.out.println("evan.getFinalAverage " + evan.getFinalAverage());
        System.out.println("");
        Course Math = new Course("Math", new StudentRecord[] { gleb, peter, evan });
        System.out.println(Math.calculateTestAverage(6));
        System.out.println(Math.findBestStudent());
        System.out.println(Math.toString());
        System.out.println(evan.toString());
    }
}
