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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.fineduca.R

@Composable
fun EstudosScreen(modifier: Modifier = Modifier, navController: NavController) {
    val voltarImage = painterResource(id = R.drawable.de_volta)

    Column(modifier = Modifier
        .fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Column(modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top) {

            Box(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(color = Color(0xFFFECC7D)),
                contentAlignment = Alignment.Center
            ){
                Text(text = "Estudos Em Andamento: ", fontSize = 26.sp, fontWeight = FontWeight.Bold)
            }

            Button(modifier = Modifier
                .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC6C5C5)),
                shape = RoundedCornerShape(0.dp),
                onClick = { navController.navigate("assunto") }) {
                Text(text = "Assunto Tal: ", color = Color.Black, fontSize = 18.sp)
                Image(modifier = Modifier
                    .size(24.dp),painter = voltarImage, contentDescription = "Retomar")
            }

            Spacer(modifier = Modifier.height(5.dp))

            Button(modifier = Modifier
                .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC6C5C5)),
                shape = RoundedCornerShape(0.dp),
                onClick = { navController.navigate("assunto_taxas") }) {
                Text(text = "Taxas de Câmbio: ", color = Color.Black, fontSize = 18.sp)
                Image(modifier = Modifier
                    .size(24.dp),painter = voltarImage, contentDescription = "Retomar")
            }

            Spacer(modifier = Modifier.height(128.dp))

            Text(text = "Você não possui outros estudos em andamento!", fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun EstudosScreenPreview() {
    EstudosScreen(navController = rememberNavController())
}