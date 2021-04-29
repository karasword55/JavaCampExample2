import Business.Instructor;
import Business.Kurs;
import Business.Student;
import Business.User;
import Manager.InstructorManager;
import Manager.StudentManager;

public class Main {
    public static void main(String[] args) {
        //Instructor m1=new Instructor();
        Kurs kurs1=new Kurs();
        kurs1.setCourseName("Java-React");
        Kurs kurs2=new Kurs();
        kurs2.setCourseName("C#-Angular");
        Kurs kurs3=new Kurs();
        kurs3.setCourseName("Html-Css");
        Student mert=new Student();// öğrenci oluşturdum
        mert.setFirstName("Mert");
        mert.setId(1);
        mert.setLastName("Oğuzhan");
        mert.setSchoolName("Gazi Üniversitesi");

        Student ahmet=new Student();
        ahmet.setFirstName("Engin");
        ahmet.setId(2);
        ahmet.setLastName("Demiroğ");
        ahmet.setSchoolName("Yıldız Teknik Üniversitesi");

        StudentManager st=new StudentManager();
        st.addCourse(ahmet,kurs3);
        st.addCourse(mert,kurs1);
        st.addCourse(mert,kurs2);
        st.addCourse(mert,kurs3);
        st.kursListele(mert);
        System.out.println("*********");
        st.kursListele(ahmet);
        System.out.println("*********");

        Instructor engin=new Instructor();
        InstructorManager im=new InstructorManager();
        engin.setExpreience(5);
        engin.setFirstName("Engin");
        engin.setLastName("Demiroğ");
        engin.setId(1);
        im.addCourse(engin,kurs2);
        im.kursListele(engin);






    }
}
