package org.selffish.domain.contracts

import org.selffish.domain.entities.Preference

interface PreferencesRepository {

    fun insert(preference: Preference) : Preference
}