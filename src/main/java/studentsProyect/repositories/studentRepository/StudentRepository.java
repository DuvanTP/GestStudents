package studentsProyect.repositories.studentRepository;

import studentsProyect.models.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    Student addStudent(Student student);
    List<Student> find(String name);
}
