public class Course {
    private String code;
    private String name;
    private int credit;
    private Instructor instructor;

    public Course(String code, String name, int credit) {
        this.code = code;
        this.name = name;
        this.credit = credit;
    }



    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Ders: " + code + " - " + name + " (" + credit + " kredi)";
    }
}