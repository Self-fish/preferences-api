package org.selffish.adapters.repositories

import org.selffish.adapters.database.PreferencesDataBase
import org.selffish.domain.contracts.PreferencesRepository
import org.selffish.domain.entities.Preference
import org.springframework.stereotype.Component

@Component
class PreferencesRepositoryImpl(private val dataBase: PreferencesDataBase): PreferencesRepository {

    override fun insert(preference: Preference): Preference = dataBase.insert(preference)
    override fun get(deviceId: String): Preference = dataBase.findByDeviceId(deviceId)

}