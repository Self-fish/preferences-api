package org.selffish.adapters.web

import org.selffish.domain.entities.LightPreferences

data class LightPreferencesWebModel(val lightsPreferences: LightPreferences, val deviceId: String)