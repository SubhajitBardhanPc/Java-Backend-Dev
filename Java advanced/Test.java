
import java.util.HashMap;

import java.util.Map;
import java.util.Optional;

class students<k, v> {
    private Map<k, v> studentsData = new HashMap<>();

    public void set(k studentName, v marks) {
        studentsData.put(studentName, marks);
    }

    public v get(k studentName) {
        return studentsData.get(studentName);
    }
}

public class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {
        students<String, Integer> StudentMarks = new students<>();
        StudentMarks.set("Subhajit", 100);
        StudentMarks.set("Sohini", 98);
        System.out.println(StudentMarks.get("Subhajit"));
        System.out.println(StudentMarks.get("Sohini"));

        Optional<Integer> marksOfRohit = Optional.ofNullable(StudentMarks.get("rohit"));
        System.out.println(marksOfRohit);
    }

}
