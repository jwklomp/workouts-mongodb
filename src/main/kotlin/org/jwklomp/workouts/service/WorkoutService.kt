package org.jwklomp.workouts.service

import org.jwklomp.workouts.model.Workout
import org.springframework.stereotype.Service

@Service
interface WorkoutService {
    fun getWorkouts(): List<Workout>

    fun getWorkoutById(workoutId: String?): Workout?

    fun addWorkout(workout: Workout): Unit
}