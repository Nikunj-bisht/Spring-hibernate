package nikunj.madean.springapp;

import nikunj.madean.springapp.data.Courses;
import nikunj.madean.springapp.data.Marks;
import nikunj.madean.springapp.data.Student;
import nikunj.madean.springapp.data.Students;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Mainclass {

    public static void main(String[] args) {
        System.out.println("Hello");

        SessionFactory sessionFactory = new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Students.class)
                .addAnnotatedClass(Marks.class)
                .addAnnotatedClass(Courses.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

session.beginTransaction();


  //////////////////******------------------------------*****************//
// One to many and many to one

Students students = session.get(Students.class , 2169);

//Courses courses = new Courses("Spring boot");
//        Courses courses1 = new Courses("Spring boot");
//        Courses courses2= new Courses("Spring boot");
//
//
//
//students.add(courses);
//        students.add(courses1);
//        students.add(courses2);
//
//        session.save(courses);
//        session.save(courses1);
//        session.save(courses2);

System.out.println(students.getMarks());

/// --------------------------------------------------------------//////////////

//        Bi directional mapping from one to one

//     Students su = session.get(Students.class , 2169);
//
//        Marks marks = session.get(Marks.class , 1);
//
//    System.out.println(marks.getStudents());

  // One to One mapping
//
//Students students = new Students(2169 ,  "Nikunj bisht");
//
//Marks marks = new Marks(89);
//
//marks.setStudents(students);
//
//session.save(students);
//session.save(marks);
// fetching data query
//                List<Student> list = session
//                .createQuery("from Student s where s.age >= 20")
//                .getResultList();


//
//        for(Student s : list){
//            System.out.println(s.getFirstname());
//        }

                                                       // update data query
//session.get( Student.class , 1001 )
//        .setFirstname("Nikunj bisht");

session.getTransaction().commit();


        sessionFactory.close();







//Student student =  session.get(Student.class , 1001);

// session.getTransaction().commit();


// craeate spring container which load bean which contains all our objects
    //    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
     //  AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);

//String url = "jdbc:mysql://localhost/practice";
//
//try{
//
//    Connection connection = DriverManager.getConnection(url,"root","");
//System.out.println("Connected to db");
//}catch (Exception e){
//    e.printStackTrace();
//}

  //annotationConfigApplicationContext.
   //  get a bean

      //  annotationConfigApplicationContext.close();



    }

}
