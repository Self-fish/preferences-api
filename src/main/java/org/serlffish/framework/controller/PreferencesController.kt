package org.serlffish.framework.controller

import org.serlffish.adapters.web.PreferenceWebModel
import org.serlffish.domain.entities.Preference
import org.serlffish.domain.usecases.AddPreferenceUseCase
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("preferences")
class PreferencesController(private val addUseCase: AddPreferenceUseCase) {

    @RequestMapping(method = [RequestMethod.POST], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun add(@RequestBody preferencesWebModel: PreferenceWebModel): Preference {
        return addUseCase.create(Preference())
    }


}