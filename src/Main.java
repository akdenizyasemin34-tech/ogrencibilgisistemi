import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("--- ÖĞRENCİ KAYIT SİSTEMİNE HOŞ GELDİNİZ ---");
        System.out.println("==========================================\n");

        System.out.print("Lütfen öğrencinin Adını ve Soyadını giriniz: ");
        String ogrenciAdi = scanner.nextLine();

        System.out.print("Öğrenci Numarasını giriniz: ");
        int ogrenciId = scanner.nextInt();


        scanner.nextLine();


        Student yeniOgrenci = new Student(ogrenciId, ogrenciAdi);
        System.out.println("\n Giriş Başarılı! Hoş geldin, " + yeniOgrenci.getName());


        System.out.println("\n--- DERS KAYIT EKRANI ---");
        System.out.print("Eklemek istediğiniz Dersin Kodunu giriniz : ");
        String dersKodu = scanner.nextLine();

        System.out.print("Dersin Adını giriniz: ");
        String dersAdi = scanner.nextLine();

        System.out.print("Dersin Kredisini giriniz: ");
        int dersKredi = scanner.nextInt();


        Course yeniDers = new Course(dersKodu, dersAdi, dersKredi);

        yeniOgrenci.registerCourse(yeniDers);


        System.out.println("\n==========================================");
        System.out.println("--- GÜNCEL DURUM RAPORU ---");
        yeniOgrenci.listCourses();
        System.out.println("==========================================");

        scanner.close();
    }
}