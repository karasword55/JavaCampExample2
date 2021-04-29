package Manager;

import Business.Kurs;
import Business.User;

public class InstructorManager extends UserManager{
    @Override
    public void addCourse(User user, Kurs kurs) {
        super.addCourse(user, kurs);
    }

    @Override
    public void kursListele(User user) {
        super.kursListele(user);
    }
}
