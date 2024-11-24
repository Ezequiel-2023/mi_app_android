package com.example.listado_de_paises

import retrofit2.Call
import retrofit2.http.GET

interface CountryService {
    @GET("all")
    fun getAllCountries(): Call<List<Country>>
}
