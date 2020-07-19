package org.selffish.framework.controller

import org.selffish.adapters.web.PreferenceWebModel
import org.selffish.adapters.web.PreferenceWebModelMapper
import org.selffish.domain.entities.Preference
import org.selffish.domain.usecases.AddPreferenceUseCase
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("preferences")
class PreferencesController(private val addUseCase: AddPreferenceUseCase,
                            private val mapper: PreferenceWebModelMapper) {

    @RequestMapping(method = [RequestMethod.POST], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun add(@RequestBody preferencesWebModel: PreferenceWebModel): Preference {
        return addUseCase.create(mapper.createPreference(preferencesWebModel))
    }


}