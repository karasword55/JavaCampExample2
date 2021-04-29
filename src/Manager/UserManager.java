package Manager;

import Business.Kurs;
import Business.User;

import java.util.ArrayList;

public class UserManager {
    //ArrayList<Kurs> kursListesi=new ArrayList<>();
    public void addCourse(User user,Kurs kurs){
        user.getCourseList().add(kurs);
        user.setCourseList(user.getCourseList());

    }
    public void kursListele(User user){
        ArrayList<Kurs> kursArrayList=user.getCourseList();
        for (Kurs kurs:kursArrayList) {
            System.out.println(kurs.getCourseName());
        }

    }

}
