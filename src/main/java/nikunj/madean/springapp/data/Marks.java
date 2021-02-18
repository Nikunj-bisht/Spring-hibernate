package nikunj.madean.springapp.data;

import com.ibm.icu.impl.coll.Collation;

import javax.persistence.*;



@Entity
@Table(name = "marks")
public class Marks {

    @Id
    @Column(name = "id")
    public int id;

    @Column(name = "COMPUTER_MARKS")
  public int marks;

        @OneToOne
    @JoinColumn(name = "UID")
    public Students students;

    public Marks(int marks) {
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Marks() {
    }

    @Override
    public String toString() {
        return "Marks{" +
                "id=" + id +
                ", marks=" + marks +
                ", students=" + students +
                '}';
    }
}
