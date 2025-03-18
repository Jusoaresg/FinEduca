package br.com.fiap.fineduca.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import retrofit2.awaitResponse
import br.com.fiap.fineduca.data.RetrofitInstance

class CambioViewModel : ViewModel() {
    private val _taxasCambio = MutableStateFlow<Map<String, String?>>(emptyMap())
    val taxasCambio: StateFlow<Map<String, String?>> get() = _taxasCambio

    var isLoading = false
        private set

    fun fetchTaxasCambio() {
        viewModelScope.launch(Dispatchers.IO) {
            isLoading = true
            try {
                val response = RetrofitInstance.api.getTaxasCambio().awaitResponse()

                Log.d("CambioViewModel", "Resposta da API: ${response.body()}")

                if (response.isSuccessful) {
                    val cambioResposta = response.body()
                    val taxas = mutableMapOf<String, String?>()

                    cambioResposta?.let {
                        taxas["USD"] = it.USDBRL?.bid
                        taxas["EUR"] = it.EURBRL?.bid
                        taxas["GBP"] = it.GBPBRL?.bid
                        taxas["ARS"] = it.ARSBRL?.bid
                        taxas["CAD"] = it.CADBRL?.bid
                        taxas["AUD"] = it.AUDBRL?.bid
                    }

                    _taxasCambio.value = taxas
                } else {
                    _taxasCambio.value = emptyMap()
                    Log.e("CambioViewModel", "Erro na resposta da API: ${response.code()}")
                }
            } catch (e: Exception) {
                _taxasCambio.value = emptyMap()
                Log.e("CambioViewModel", "Erro ao fazer a requisição: $e")
            }
            isLoading = false
        }
    }
}