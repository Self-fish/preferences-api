package org.selffish.adapters.database

import org.selffish.domain.entities.Preference
import org.springframework.data.mongodb.repository.MongoRepository

interface PreferencesDataBase: MongoRepository<Preference, String> {

    fun findByDeviceId(deviceId: String): Preference



}