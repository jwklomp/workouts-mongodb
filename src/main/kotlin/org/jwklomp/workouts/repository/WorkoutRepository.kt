package org.jwklomp.workouts.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface WorkoutRepository : MongoRepository<WorkoutEntity, String>