package studentsProyect.repositories.studentRepository.impl;

import studentsProyect.models.Student;
import studentsProyect.repositories.studentRepository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    private static List<Student> students = new ArrayList<Student>();

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public Student save(Student student) {
        return student;
    }

    @Override
    public List<Student> find(String title) {

        return List.of();
    }
}
