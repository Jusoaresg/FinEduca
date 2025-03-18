package br.com.fiap.fineduca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.fineduca.screens.TaxasCambioScreen
import br.com.fiap.fineduca.screens.AssuntoScreen
import br.com.fiap.fineduca.screens.BaseScreen
import br.com.fiap.fineduca.screens.EstudosScreen
import br.com.fiap.fineduca.screens.HomeScreen
import br.com.fiap.fineduca.screens.content.CambioMoedas
import br.com.fiap.fineduca.screens.content.LeisDinheiroContent
import br.com.fiap.fineduca.ui.theme.FinEducaTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinEducaTheme {
                val navController = rememberNavController()

                val voltarButton: @Composable () -> Unit = {
                    Button(colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF323131)), onClick = { navController.popBackStack() }) {
                        Text(text = "Voltar")
                    }
                }

                val baseScreenModifier = Modifier.fillMaxSize()

                NavHost(navController = navController, startDestination = "home" ) {
                    composable("home") {
                        BaseScreen(modifier = baseScreenModifier, topBar = {
                            Text(text = "FinEduca", fontSize = 42.sp, fontWeight = FontWeight.Bold)
                        }, bottomBar = {}) {
                            HomeScreen(navController = navController)
                        }
                    }

                    composable("taxas_cambio") {
                        BaseScreen(modifier = baseScreenModifier, topBar = {
                            Text(text = "Taxas de Câmbio - R$", fontSize = 32.sp, fontWeight = FontWeight.Bold)
                        }, bottomBar = { voltarButton() }) {
                            TaxasCambioScreen(navController = navController)
                        }
                    }

                    composable("estudos") {
                        BaseScreen(modifier = baseScreenModifier, topBar = {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(text = "Meus Estudos", fontSize = 32.sp, fontWeight = FontWeight.Bold)
                                Image(modifier = Modifier
                                    .size(48.dp)
                                    .offset(x = 4.dp, y = -4.dp),
                                    painter = painterResource(id = R.drawable.conhecimento),
                                    contentDescription = "conhecimento")
                            }
                        }, bottomBar = { voltarButton() }) {
                            EstudosScreen(modifier = Modifier, navController = navController)
                        }
                    }

                    composable("assunto") {
                        BaseScreen(modifier = baseScreenModifier, topBar = {
                            Text(text = "As 5 Leis do Dinheiro", fontSize = 32.sp, fontWeight = FontWeight.Bold)
                        }, bottomBar = { voltarButton() }) {
                            AssuntoScreen(content = { LeisDinheiroContent() })
                        }
                    }

                    composable("assunto_taxas") {
                        BaseScreen(modifier = baseScreenModifier, topBar = {
                            Text(text = "Como Funciona o Câmbio de Moedas?", fontSize = 22.sp, fontWeight = FontWeight.Bold)
                        }, bottomBar = { voltarButton() }) {
                            AssuntoScreen(content = { CambioMoedas() })
                        }
                    }

                    composable("taxas_cambio") {
                        BaseScreen(modifier = baseScreenModifier, topBar = {
                            Text(text = "Taxas de Câmbio - R$", fontSize = 32.sp, fontWeight = FontWeight.Bold)
                        }, bottomBar = { voltarButton() }) {
                            TaxasCambioScreen(navController = navController)
                        }
                    }
                }
            }
        }
    }
}