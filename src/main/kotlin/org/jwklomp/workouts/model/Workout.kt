package org.jwklomp.workouts.model

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import java.time.LocalDateTime

data class Workout(
        val id: String? = null,
        val title: String,
        val workoutType: WorkoutType,
        val description: String,
        @JsonDeserialize(using = LocalDateTimeDeserializer::class)
        @JsonSerialize(using = LocalDateTimeSerializer::class)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_TIME_FORMAT)
        val createdDate: LocalDateTime = LocalDateTime.now(),
        @JsonDeserialize(using = LocalDateTimeDeserializer::class)
        @JsonSerialize(using = LocalDateTimeSerializer::class)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_TIME_FORMAT)
        val modifiedDate: LocalDateTime = LocalDateTime.now()
) {
    companion object {
        private const val DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'"
    }
}