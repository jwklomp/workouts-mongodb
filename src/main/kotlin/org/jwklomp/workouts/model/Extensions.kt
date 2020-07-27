package org.jwklomp.workouts.model

import org.jwklomp.workouts.repository.WorkoutEntity

fun Workout.toEntity(): WorkoutEntity {
    return WorkoutEntity(id, title, workoutType, description, createdDate, modifiedDate)
}

fun  WorkoutEntity.toWorkout(): Workout {
    return Workout(id, title, workoutType, description, createdDate, modifiedDate)
}
