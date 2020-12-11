package org.selffish.adapters.web

import org.selffish.domain.entities.LightPreferences
import org.selffish.domain.entities.WaterTemperaturePreferences

data class PreferenceWebModel(val lightsPreferences: LightPreferences,
                              val waterTemperaturePreferences: WaterTemperaturePreferences,
                              val deviceId: String)