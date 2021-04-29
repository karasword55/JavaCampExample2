package Business;

import java.util.ArrayList;

public class Instructor extends User{

    int expreience; // eğitmenin tecrübe yılı
    private ArrayList<Kurs> courseList=new ArrayList<>();



    public int getExpreience() {
        return expreience;
    }

    public void setExpreience(int expreience) {
        this.expreience = expreience;
    }

    public Instructor() {
        super();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public ArrayList<Kurs> getCourseList() {
        return super.getCourseList();
    }

    @Override
    public void setCourseList(ArrayList<Kurs> courseList) {
        super.setCourseList(courseList);
    }
}
