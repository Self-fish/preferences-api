package org.selffish.domain.usecases

import org.selffish.domain.contracts.PreferencesRepository
import org.selffish.domain.entities.Preference
import org.springframework.stereotype.Service

@Service
class AddPreferenceUseCase(private val repository: PreferencesRepository) {

    fun create(preference: Preference): Preference {
        return repository.insert(preference)
    }

}