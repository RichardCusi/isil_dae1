package pe.isil;

import pe.isil.dao.StudentDAO;
import pe.isil.model.Course;
import pe.isil.model.Student;

public class Main {
    public static void main(String[] args) {

        Student student= new Student();
        //student.setId(1);
        student.setName("Richard");
        student.setLastnamefather("Cusi");
        student.setLastnamemother("Caviedes");
        student.setAge(25);

        Course course= new Course();
        course.setId(100);
        course.setNombreCurso("Desarrollo de Aplicaciones Empresariales 1");
        course.setCredits(4);
        course.setTeacherName("Jose ventura");

        StudentDAO studentDAO= new StudentDAO();
        studentDAO.crear(student);

        System.out.println(student);
        System.out.println(course);
    }
}
