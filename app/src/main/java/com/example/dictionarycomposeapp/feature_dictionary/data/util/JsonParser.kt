package com.example.dictionarycomposeapp.feature_dictionary.data.util

import java.lang.reflect.Type

interface JsonParser {
    // 1. json string에서 객체 가져오는 함수
    fun <T> fromJson(json: String, type: Type): T?

    // 2. json string에서 객체 파싱하는 함수
    fun <T> toJson(obj: T, type: Type): String
}