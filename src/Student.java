import java.util.ArrayList;

public class Student implements Registrable {
    private int id;
    private String name;
    private ArrayList<Course> registeredCourses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        registeredCourses.add(course);
        System.out.println(name + ", " + course.getCode() + " dersine kayit oldu.");
    }

    public double calculateTuition() {
        return 10000.0;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }

    @Override
    public String getRegistrationInfo() {
        return "Ogrenci Kayit Bilgisi: " + name + " (ID: " + id + ")";
    }
}