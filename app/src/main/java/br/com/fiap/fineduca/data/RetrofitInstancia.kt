package br.com.fiap.fineduca.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import br.com.fiap.fineduca.network.CambioApiService

object RetrofitInstance {
    private const val BASE_URL = "https://economia.awesomeapi.com.br/json/"

    val api: CambioApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(CambioApiService::class.java)
    }
}