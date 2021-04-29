package Business;

import java.util.ArrayList;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Kurs> courseList=new ArrayList<>();

    public void setCourseList(ArrayList<Kurs> courseList) {
        this.courseList = courseList;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Kurs> getCourseList() {
        return courseList;
    }


}
