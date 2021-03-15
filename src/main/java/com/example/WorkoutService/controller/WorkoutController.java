package com.example.WorkoutService.controller;

import com.example.WorkoutService.model.UserWorkout;
import com.example.WorkoutService.model.Workout;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/workout")
public class WorkoutController {

    @GetMapping("/{workoutId}")
    public Workout getWorkout(@PathVariable("workoutId") String workoutId){

        if(workoutId.equals("1")) {
            return new Workout("Full body Workout", "Test", workoutId);
        }else{
            return new Workout("Random Workout", "optional test text desc", workoutId);
        }

    }

    @GetMapping("users/{userId}")
    public UserWorkout getUserWorkout(@PathVariable("userId") String userId) {

        List<Workout> workouts = Arrays.asList(
                new Workout("Full body workout", "Foo", "1"),
                new Workout("Upper body workout", "Foo", "2")
        );

        UserWorkout userWorkout = new UserWorkout();
        userWorkout.setUserWorkout(workouts);

        return userWorkout;
    }

}
