package br.com.fiap.fineduca.data

import com.squareup.moshi.Json

data class CambioResposta(
    @Json(name = "USDBRL") val usd: CambioInfo?,
    @Json(name = "EURBRL") val eur: CambioInfo?,
    @Json(name = "GBPBRL") val gbp: CambioInfo?,
    @Json(name = "ARSBRL") val ars: CambioInfo?,
    @Json(name = "CADBRL") val cad: CambioInfo?,
    @Json(name = "AUDBRL") val aud: CambioInfo?
)

data class CambioInfo(
    val code: String,
    val bid: String
)