package ru.hogwarts.schoolCreateAPI.services;


import org.springframework.stereotype.Service;
import ru.hogwarts.schoolCreateAPI.model.Student;
import ru.hogwarts.schoolCreateAPI.repositories.StudentRepository;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findStudent(long id) {
        return studentRepository.findById(id).get();
    }

    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }

    public Collection<Student> getAllStudent() {
        return studentRepository.findAll();
    }
    public Map<Integer, List<Student>> findStudentByAge(int age) {
        return getAllStudent().stream()
                .filter(student -> student.getAge() == age)
                .collect(groupingBy(Student::getAge, toList()));
    }
}