package br.com.fiap.fineduca.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.awaitResponse
import br.com.fiap.fineduca.data.CambioResposta
import br.com.fiap.fineduca.data.RetrofitInstance

class CambioViewModel : ViewModel() {
    var taxasCambio: CambioResposta? = null
        private set
    var isLoading = false
        private set

    fun fetchTaxasCambio() {
        viewModelScope.launch(Dispatchers.IO) {
            isLoading = true
            try {
                val response = RetrofitInstance.api.getTaxasCambio().awaitResponse()
                if (response.isSuccessful) {
                    taxasCambio = response.body()
                }
            } catch (e: Exception) {
                taxasCambio = null
            }
            isLoading = false
        }
    }
}