package nikunj.madean.springapp.data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class Student{


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "Name")
    public String firstname;

    @Column(name="AGE")
    public int age;

public Student(){

}
    public Student(String firstname , int age){

        this.firstname = firstname;
        this.age = age;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getLastname() {
        return age;
    }

    public void setLastname(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", age=" + age +
                '}';
    }
}
class StudentId implements Serializable{
    public String firstname;

    public int age;

    public StudentId(String firstname , int age){
        this.firstname = firstname;
        this.age = age;
    }



}
