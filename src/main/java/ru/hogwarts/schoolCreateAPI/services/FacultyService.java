package ru.hogwarts.schoolCreateAPI.services;


import org.springframework.stereotype.Service;
import ru.hogwarts.schoolCreateAPI.model.Faculty;
import ru.hogwarts.schoolCreateAPI.model.Faculty;
import ru.hogwarts.schoolCreateAPI.repositories.FacultyRepository;


import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

@Service
public class FacultyService {

    private final FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty findFaculty(long id) {
        return facultyRepository.findById(id).get();
    }

    public Faculty editFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public void deleteFaculty(long id) {
        facultyRepository.deleteById(id);
    }

    public Collection<Faculty> deleteFaculty() {
        return facultyRepository.findAll();
    }


    public Map<String, List<Faculty>> findFacultyByColor(String color){
        return deleteFaculty().stream()
                .filter(faculty -> faculty.getColor().equals(color))
                .collect(groupingBy(Faculty::getColor, toList()));
    }
}
