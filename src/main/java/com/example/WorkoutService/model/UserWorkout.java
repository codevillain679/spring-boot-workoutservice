package com.example.WorkoutService.model;

import java.util.List;

public class UserWorkout {
    private List<Workout> userWorkout;

    public List<Workout> getUserWorkout() {
        return userWorkout;
    }

    public void setUserWorkout(List<Workout> userWorkout) {
        this.userWorkout = userWorkout;
    }
}
