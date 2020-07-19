package org.serlffish.domain.contracts

import org.serlffish.domain.entities.Preference

interface PreferencesRepository {

    fun insert(preference: Preference) : Preference
}