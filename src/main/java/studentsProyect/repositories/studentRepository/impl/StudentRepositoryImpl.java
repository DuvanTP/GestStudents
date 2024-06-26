package studentsProyect.repositories.studentRepository.impl;

import studentsProyect.models.Student;
import studentsProyect.repositories.studentRepository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    private static List<Student> students;

    public StudentRepositoryImpl(){

        new ArrayList<Student>();
    } 

    @Override
    public List<Student> findAll() {

        return students;
    }

    @Override
    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public List<Student> find(String name) {
        List<Student> stud = new ArrayList<>(students.stream().filter(x -> (x.getNombre()).equals(name)).toList());
/*         for(Student student : students) {
            if ((student.getNombre()).equals(name)) {
                stud.add(student);
            } 
        }*/       
        return stud;
    }
}
