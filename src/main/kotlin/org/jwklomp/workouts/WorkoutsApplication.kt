package org.jwklomp.workouts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WorkoutsApplication

fun main(args: Array<String>) {
	runApplication<WorkoutsApplication>(*args)
}
