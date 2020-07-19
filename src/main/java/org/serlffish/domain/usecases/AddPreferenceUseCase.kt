package org.serlffish.domain.usecases

import org.serlffish.domain.contracts.PreferencesRepository
import org.serlffish.domain.entities.Preference
import org.springframework.stereotype.Service

@Service
class AddPreferenceUseCase(private val repository: PreferencesRepository) {

    fun create(preference: Preference): Preference {
        return repository.insert(preference)
    }

}