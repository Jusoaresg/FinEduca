package br.com.fiap.fineduca.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BaseScreen(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit,
    bottomBar: @Composable () -> Unit,
    content: @Composable () -> Unit) {
    val barColor = Color(0xFFFFA500)

    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        //topBar()
        DefaultTopBar(barColor = barColor, content = topBar)

        Box(modifier = Modifier
            .weight(1f),
        contentAlignment = Alignment.Center) {
            content()
        }

        //bottomBar()
        DefaultBottomBar(barColor = barColor, content = bottomBar)
    }
}

@Composable
private fun DefaultBottomBar(barColor: Color, content: @Composable () -> Unit) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(72.dp)
        .background(color = barColor),
    contentAlignment = Alignment.Center
    ) {
        content()
    }
}

@Composable
private fun DefaultTopBar(barColor: Color, content: @Composable () -> Unit) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(72.dp)
        .background(color = barColor),
        contentAlignment = Alignment.Center){
        //Text(text = "FinEduca", fontSize = 42.sp, fontWeight = FontWeight.Bold)
        content()
    }
}