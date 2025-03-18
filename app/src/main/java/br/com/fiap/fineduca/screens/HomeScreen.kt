package br.com.fiap.fineduca.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun HomeScreen(modifier: Modifier = Modifier, navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        CenterContent(navController = navController)
    }
}

@Composable
private fun CenterContent(modifier: Modifier = Modifier, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Column(modifier = Modifier) {
            Image(modifier = Modifier
                .size(180.dp), painter = painterResource(id = R.drawable.financa), contentDescription = "financa")

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Bem-Vindo!", fontSize = 38.sp)
        }

        Button(modifier = Modifier, colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xffFECC7D)),
            onClick = { navController.navigate("estudos") }) {
                Text(text = "Meus Estudos", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                Image(modifier = Modifier
                    .size(26.dp)
                    .offset(x = 5.dp),
                    painter = painterResource(id = R.drawable.seta_para_a_direita), contentDescription = "seta-para-direita")
        }

        Spacer(modifier = Modifier.height(32.dp))

        Column(modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally) {

                Text(text = "Tempo Real: ", fontSize = 24.sp)

                Button(modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffFECC7D)),
                    onClick = { navController.navigate("taxas_cambio") }) {
                        Text(text = "Conferir Taxas de Câmbio ", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color(0xff000000))
                        Image(modifier = Modifier
                            .size(26.dp),
                            painter = painterResource(id = R.drawable.troca), contentDescription = "taxa-câmbio")
                }
            }

        }
}