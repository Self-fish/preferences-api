package org.selffish.domain.contracts

import org.selffish.domain.entities.LightPreferences
import org.selffish.domain.entities.Preference
import java.util.*

interface PreferencesRepository {

    fun insert(preference: Preference) : Preference
    fun get(deviceId: String) : Optional<Preference>
    fun update(preference: Preference?): Preference
}