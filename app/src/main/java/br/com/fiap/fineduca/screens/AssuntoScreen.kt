package br.com.fiap.fineduca.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AssuntoScreen(modifier: Modifier = Modifier, texto: String) {
    Box(modifier = Modifier
        .padding(10.dp)
        .background(
            Color(0xFFFFCF83),
            shape = RoundedCornerShape(16.dp)
        ),
    contentAlignment = Alignment.Center
    ) {
        Text(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
                    text = texto,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun AssuntoScreenPreview() {
    AssuntoScreen(texto = "Teste")
}