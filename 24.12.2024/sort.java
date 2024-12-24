import java.util.*;

// Student class
class Student{
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

// Comparator to compare the students as required
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // First compare by CGPA (descending order)
        if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0) {
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        }
        // If CGPA is the same, compare by first name (alphabetical order)
        if (!s1.getFname().equals(s2.getFname())) {
            return s1.getFname().compareTo(s2.getFname());
        }
        // If both CGPA and first name are the same, compare by ID (ascending order)
        return Integer.compare(s1.getId(), s2.getId());
    }
}

// Main Solution
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            
            testCases--;
        }

        // Sort the list using the custom comparator
        Collections.sort(studentList, new StudentComparator());
        
        // Output the first names of the sorted students
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
