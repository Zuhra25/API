package ru.hogwarts.schoolCreateAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.schoolCreateAPI.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
