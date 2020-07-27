package org.jwklomp.workouts.service

import org.jwklomp.workouts.model.Workout
import org.jwklomp.workouts.model.toEntity
import org.jwklomp.workouts.model.toWorkout
import org.jwklomp.workouts.repository.WorkoutRepository
import org.springframework.stereotype.Service

@Service
class WorkoutServiceImpl(val workoutRepository: WorkoutRepository) : WorkoutService {
    override fun getWorkouts(): List<Workout> {
        return workoutRepository.findAll().map { it.toWorkout() }
    }

    override fun getWorkoutById(workoutId: String?): Workout? {
        return if (workoutId != null) {
            val workout = workoutRepository.findById(workoutId)
            if (workout.isPresent) {
                workout.get().toWorkout();
            } else {
                null
            }
        } else {
            null
        }
    }

    override fun addWorkout(workout: Workout) {
        if (workout != null) {
            workoutRepository.insert(workout.toEntity())
        }
    }
}