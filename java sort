import java.util.*;

public class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() { return id; }
    public String getFname() { return fname; }
    public double getCgpa() { return cgpa; }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) {
            in.close();
            return;
        }
        
        int testCases = in.nextInt();
        List<Student> studentList = new ArrayList<>();
        
        while (testCases > 0 && in.hasNext()) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            
            studentList.add(new Student(id, fname, cgpa));
            testCases--;
        }

        // Sort execution
        studentList.sort((s1, s2) -> {
            if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0) {
                return Double.compare(s2.getCgpa(), s1.getCgpa());
            }
            if (!s1.getFname().equals(s2.getFname())) {
                return s1.getFname().compareTo(s2.getFname());
            }
            return Integer.compare(s1.getId(), s2.getId());
        });

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
        in.close();
    }
}
