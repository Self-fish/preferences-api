package org.serlffish.adapters.database

import org.serlffish.domain.entities.Preference
import org.springframework.data.mongodb.repository.MongoRepository

interface PreferencesDataBase: MongoRepository<Preference, String>