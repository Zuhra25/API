package ru.hogwarts.schoolCreateAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.schoolCreateAPI.model.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long>{
}
