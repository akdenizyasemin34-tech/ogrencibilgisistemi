import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class StudentTest {

    @Test
    void testAyniDersTekrarEklenemez() {
        Student ogrenci = new Student(1, "Arda Abaci");
        Course ders = new Course("CS101", "Java", 6);

        ogrenci.registerCourse(ders);
        ogrenci.registerCourse(ders);


        assertEquals(1, ogrenci.getCourses().size(), "HATA: Aynı ders iki kere eklendi, mantık çalışmıyor!");
    }
}