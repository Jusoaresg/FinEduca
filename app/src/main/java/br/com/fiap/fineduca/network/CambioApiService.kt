package br.com.fiap.fineduca.network

import retrofit2.Call
import retrofit2.http.GET
import br.com.fiap.fineduca.data.CambioResposta

interface CambioApiService {
    @GET("json/last/USD-BRL,EUR-BRL,GBP-BRL,ARS-BRL,CAD-BRL,AUD-BRL")
    fun getTaxasCambio(): Call<CambioResposta>
}