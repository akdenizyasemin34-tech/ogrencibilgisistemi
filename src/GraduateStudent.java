public class GraduateStudent extends Student {

    private String thesis;


    public GraduateStudent(int id, String name, String thesis) {
        super(id, name);
        this.thesis = thesis;
    }


    @Override
    public double calculateTuition() {
        return 12000;
    }

    public String getThesis() {
        return thesis;
    }
}