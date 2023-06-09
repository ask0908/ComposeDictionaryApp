package com.example.dictionarycomposeapp.feature_dictionary.data.remote.dto

import com.example.dictionarycomposeapp.feature_dictionary.domain.model.Meaning

data class MeaningDto(
    val definitions: List<DefinitionDto>,
    val partOfSpeech: String,
) {
    fun toMeaning(): Meaning =  Meaning(
        definitions = definitions.map { it.toDefinition() },
        partOfSpeech = partOfSpeech
    )
}