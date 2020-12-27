package org.selffish.adapters.database

import org.selffish.domain.entities.Preference
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface PreferencesDataBase: MongoRepository<Preference, String> {

    fun findByDeviceId(deviceId: String): Optional<Preference>



}