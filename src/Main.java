public class Main {
    public static void main(String[] args) {

        Course ders1 = new Course("LBLM201", "Veri Yapilari", 4);
        Course ders2 = new Course("LBLM203", "Nesne Tabanlı Programlama", 4);

        System.out.println(ders1.toString());
        System.out.println(ders2.toString());
    }
}