package com.example.listado_de_paises

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("name")
    val name: String,
    @SerializedName("flags")
    val flags: Flags
)

data class Flags(
    @SerializedName("png")
    val png: String
)
