package org.selffish.adapters.web

import org.selffish.domain.entities.LightPreferences

data class PreferenceWebModel(val lightsPreferences: LightPreferences,
                              val userId: String)