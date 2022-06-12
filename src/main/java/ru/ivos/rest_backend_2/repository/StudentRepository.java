package ru.ivos.rest_backend_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ivos.rest_backend_2.model.Student;

/**
 * @author iVos 12.06.2022
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
