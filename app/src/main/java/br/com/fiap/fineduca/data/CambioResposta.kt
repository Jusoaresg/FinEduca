package br.com.fiap.fineduca.data

data class CambioResposta(
    val USDBRL: CambioBid?,
    val EURBRL: CambioBid?,
    val GBPBRL: CambioBid?,
    val ARSBRL: CambioBid?,
    val CADBRL: CambioBid?,
    val AUDBRL: CambioBid?
)

data class CambioBid(
    val bid: String?
)