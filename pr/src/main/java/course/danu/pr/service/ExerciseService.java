package course.danu.pr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import course.danu.pr.entity.Exercise;
import course.danu.pr.repository.ExerceiseRepository;

@Service
public class ExerciseService {
    
    @Autowired
    private ExerceiseRepository exerciseRepository;

    public Exercise createExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    public Exercise getExerciseById(Long id) {
        return exerciseRepository.findById(id).orElse(null);
    }

    public List<Exercise> getAllExercises() {
        return exerciseRepository.findAll();
    }
}
