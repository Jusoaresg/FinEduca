package br.com.fiap.fineduca.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.fineduca.R

@Composable
fun TaxasCambioScreen(modifier: Modifier = Modifier, navController: NavController) {

    val text: @Composable (String) -> Unit = { texto ->
        Text(text = texto, fontSize = 16.sp, fontWeight = FontWeight.Bold)
    }


    Column(modifier = Modifier,
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {

        Column(modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(16.dp)
            .background(color = Color(0xFFFFCF83), shape = RoundedCornerShape(32.dp)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

            Image(modifier = Modifier
                .size(64.dp),
                painter = painterResource(id = R.drawable.aperto_de_mao), contentDescription = "aperto_de_mão")

            Spacer(modifier = Modifier.height(32.dp))

            text("1 Dólar ->")
            text("1 Euro ->")
            text("1 Peso ->")
            text("1 AUS Dólar ->")
            text("1 Libra ->")
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