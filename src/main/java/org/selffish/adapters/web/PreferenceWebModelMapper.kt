package org.selffish.adapters.web

import org.selffish.domain.entities.Preference
import org.springframework.stereotype.Service

@Service
class PreferenceWebModelMapper {

    fun createPreference(webModel: PreferenceWebModel) =
        Preference(null, System.currentTimeMillis(), System.currentTimeMillis(), webModel.lightsPreferences,
            webModel.userId)

}