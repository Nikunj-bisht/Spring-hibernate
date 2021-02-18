package nikunj.madean.springapp.data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class Students {

    public Students() {
    }

    @Id
    @Column(name = "ROLLNO")
    public int rollno;

    @Column(name="NAME")
    public String name;

    @OneToMany(mappedBy = "students")
    List<Courses> courses;

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

        @OneToOne(mappedBy = "students")
    Marks marks;

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    public Students(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void add(Courses course){

        if(courses == null){

            courses = new ArrayList<>();
            courses.add(course);

        }else{
            courses.add(course);

        }
        course.setStudents(this);

    }

    @Override
    public String toString() {
        return "Students{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
