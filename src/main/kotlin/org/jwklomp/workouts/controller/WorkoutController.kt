package org.jwklomp.workouts.controller

import org.jwklomp.workouts.Version
import org.jwklomp.workouts.model.Workout
import org.jwklomp.workouts.service.WorkoutService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RequestMapping(Version.APIVERSION)
@RestController
class WorkoutController(val workoutService: WorkoutService) {

    @GetMapping("/workouts", produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseStatus(HttpStatus.OK)
    fun getWorkouts(): ResponseEntity<List<Workout>> {
        return ResponseEntity(workoutService.getWorkouts(), HttpStatus.OK)
    }

    @GetMapping(value = ["/workouts/{id}"], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseStatus(HttpStatus.OK)
    fun getWorkoutById(@PathVariable id: String): ResponseEntity<Workout> {
        return ResponseEntity(workoutService.getWorkoutById(id), HttpStatus.OK)
    }

    @PostMapping("/workout", consumes = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody workout: Workout) {
        workoutService.addWorkout(workout)
    }

}