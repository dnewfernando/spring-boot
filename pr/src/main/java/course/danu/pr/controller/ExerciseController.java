package course.danu.pr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import course.danu.pr.entity.Exercise;
import course.danu.pr.service.ExerciseService;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {
    
    @Autowired
    private ExerciseService exerciseService;

    @PostMapping("/create")
    public ResponseEntity<Exercise> createExerciseFromController(@RequestBody Exercise exerciseParameter) {
        Exercise exerciseBaru = exerciseService.createExercise(exerciseParameter);
        return ResponseEntity.ok(exerciseBaru);
    }

    @GetMapping()
    public ResponseEntity<List<Exercise>> getAllExerciseFromController() {
        List<Exercise> listExercises = exerciseService.getAllExercises();
        return ResponseEntity.ok(listExercises);
    }
}
