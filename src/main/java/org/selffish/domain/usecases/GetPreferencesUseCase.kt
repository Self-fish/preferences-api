package org.selffish.domain.usecases

import org.selffish.domain.contracts.PreferencesRepository
import org.selffish.domain.entities.Preference
import org.springframework.stereotype.Service
import java.util.*

@Service
class GetPreferencesUseCase(private val repository: PreferencesRepository) {

    fun getPreference(deviceId: String): Optional<Preference> = repository.get(deviceId)

}