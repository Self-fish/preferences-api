package org.selffish.domain.usecases

import org.selffish.domain.contracts.PreferencesRepository
import org.selffish.domain.entities.LightPreferences
import org.selffish.domain.entities.Preference
import org.springframework.stereotype.Service

@Service
class UpdateLightPreferencesUseCase(private val repository: PreferencesRepository) {

    fun update(id: String, lightsPreferences: LightPreferences): Preference? {
        val preference = repository.get(id)
        preference.let {
            return if(preference.isPresent) {
                preference.get().lightsPreferences = lightsPreferences
                repository.update(preference.get())
            } else {
                null
            }
        }
    }

}