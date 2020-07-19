package org.serlffish.adapters.repositories

import org.serlffish.adapters.database.PreferencesDataBase
import org.serlffish.domain.contracts.PreferencesRepository
import org.serlffish.domain.entities.Preference
import org.springframework.stereotype.Component

@Component
class PreferencesRepositoryImpl(private val dataBase: PreferencesDataBase): PreferencesRepository {

    override fun insert(preference: Preference): Preference = dataBase.insert(preference)
}