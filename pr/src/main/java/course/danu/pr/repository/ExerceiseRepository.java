package course.danu.pr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import course.danu.pr.entity.Exercise;

public interface ExerceiseRepository extends JpaRepository<Exercise, Long> {
    
}
