package com.cesarurrego.jwttokensmn.model

import io.micronaut.serde.annotation.Serdeable.Deserializable

@Deserializable
data class SearchRequest(val name: String)