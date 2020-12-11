package org.selffish.domain.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Preference(@Id val id: String?, val creationDate: Long, val updatedDate: Long,
                      val lightsPreferences: LightPreferences, val waterPreferences: WaterTemperaturePreferences,
                      val deviceId: String)

data class LightPreferences(val mode: Mode, val range: HoursRange)

data class WaterTemperaturePreferences(val mode: Mode, val value: Double)

data class HoursRange(val starting: String, val finishing: String)

enum class Mode {
    AUTOMATIC, MANUAL
}