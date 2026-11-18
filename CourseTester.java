/*
 * REQ 03: answer both questions after you write the two StudentRecord
 * constructors in REQ 02.
 *
 * 1. new StudentRecord("Dana Lee") runs a constructor whose only line
 *    is this(name, new int[0]). Which constructor's body finishes
 *    first? Why does only the two-parameter constructor need to set
 *    name and scores?
 *    Answer: The one-parameter constructor finishes first because it calls 
 *    the other one first. Only the two-parameter constructor sets the fields 
 *    because it holds the actual setup code.
 *
 * 2. StudentRecord will have both getAverage() and
 *    getAverage(int first, int last). Why does Java allow two methods
 *    with the same name? Why would it reject a third method,
 *    public int getAverage()?
 *    Answer: Java allows it because the parameters are different (overloading). 
 *    It rejects the third one because Java cannot tell methods apart by their 
 *    return type alone.
 */
public class CourseTester {
    public static void main(String[] args) {
        StudentRecord dana = new StudentRecord("Dana Lee");
        StudentRecord sam = new StudentRecord("Sam Ortiz", null);
        StudentRecord hana = new StudentRecord("Hana Ito", new int[] { 88, 90, 95 });
        Course art = new Course("Art", new StudentRecord[] { dana, sam, hana });
        System.out.print(art);
        System.out.println(art.findBestStudent());
        System.out.println(hana.getAverage());
        System.out.println(dana.getAverage());
    }
}