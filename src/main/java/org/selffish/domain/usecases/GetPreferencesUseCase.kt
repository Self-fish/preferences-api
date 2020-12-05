package org.selffish.domain.usecases

import org.selffish.domain.contracts.PreferencesRepository
import org.springframework.stereotype.Service

@Service
class GetPreferencesUseCase(private val repository: PreferencesRepository) {

    fun getPreference(deviceId: String) = repository.get(deviceId)

}