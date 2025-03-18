package br.com.fiap.fineduca.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.fineduca.R
import br.com.fiap.fineduca.viewmodel.CambioViewModel


@Composable
fun TaxasCambioScreen(modifier: Modifier = Modifier, navController: NavController) {
    val viewModel: CambioViewModel = viewModel()

    LaunchedEffect(Unit) {
        viewModel.fetchTaxasCambio()
    }

    val text: @Composable (String) -> Unit = { texto ->
        Text(text = texto, fontSize = 16.sp, fontWeight = FontWeight.Bold)
    }

    Column(modifier = modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        // Exibe as taxas de câmbio
        if (viewModel.isLoading) {
            CircularProgressIndicator()
        } else {
            viewModel.taxasCambio?.let { taxas ->
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .padding(16.dp)
                    .background(color = Color(0xFFFFCF83), shape = RoundedCornerShape(32.dp)),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {

                    Image(modifier = Modifier.size(64.dp),
                        painter = painterResource(id = R.drawable.aperto_de_mao),
                        contentDescription = "aperto_de_mão")

                    Spacer(modifier = Modifier.height(32.dp))

                    text("1 Dólar -> R$ ${taxas.usd?.bid ?: "N/A"}")
                    text("1 Euro -> R$ ${taxas.eur?.bid ?: "N/A"}")
                    text("1 Peso -> R$ ${taxas.ars?.bid ?: "N/A"}")
                    text("1 AUS Dólar -> R$ ${taxas.aud?.bid ?: "N/A"}")
                    text("1 Libra -> R$ ${taxas.gbp?.bid ?: "N/A"}")
                }
            } ?: Text(text = "Erro ao carregar os dados.")
        }

        Spacer(modifier = Modifier.height(32.dp))

        Button(modifier = Modifier
            .shadow(4.dp, ButtonDefaults.shape),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF302819)),
            onClick = { navController.navigate("assunto_taxas") }) {
            Text(text = "Saber Mais Sobre Taxas de Câmbio")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TaxasDeCambioPreview() {
    TaxasCambioScreen(navController = rememberNavController())
}