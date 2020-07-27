package org.jwklomp.workouts.repository

import org.jwklomp.workouts.model.WorkoutType
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class WorkoutEntity(
        @Id
        val id: String?,
        val title: String,
        val workoutType: WorkoutType,
        val description: String,
        val createdDate: LocalDateTime,
        val modifiedDate: LocalDateTime
)