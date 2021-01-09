package org.selffish.framework.controller

import org.selffish.adapters.web.LightPreferencesWebModel
import org.selffish.adapters.web.PreferenceWebModel
import org.selffish.adapters.web.PreferenceWebModelMapper
import org.selffish.domain.entities.Preference
import org.selffish.domain.usecases.AddPreferenceUseCase
import org.selffish.domain.usecases.GetPreferencesUseCase
import org.selffish.domain.usecases.UpdateLightPreferencesUseCase
import org.selffish.framework.exceptions.PreferenceNotFoundException
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("preferences")
class PreferencesController(private val addUseCase: AddPreferenceUseCase,
                            private val mapper: PreferenceWebModelMapper,
                            private val getUseCase: GetPreferencesUseCase,
                            private val updateLightPreferencesUseCase: UpdateLightPreferencesUseCase) {

    @RequestMapping(method = [RequestMethod.POST], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun add(@RequestBody preferencesWebModel: PreferenceWebModel): Preference {
        return addUseCase.create(mapper.createPreference(preferencesWebModel))
    }

    @RequestMapping(method= [RequestMethod.GET])
    fun getPreference(@RequestParam deviceId: String): Preference {
        val preference = getUseCase.getPreference(deviceId)
        if(preference.isPresent) {
            return preference.get()
        }
        throw PreferenceNotFoundException()
    }

    @RequestMapping(method = [RequestMethod.PUT], consumes = [MediaType.APPLICATION_JSON_VALUE],
        value = ["/updateLightPreferences"])
    fun update(@RequestBody lightPreferences: LightPreferencesWebModel): Preference {
        val preference = updateLightPreferencesUseCase.update(lightPreferences.deviceId, lightPreferences.lightsPreferences)
        preference?.let {
            return preference
        }
        throw PreferenceNotFoundException()
    }


}