package br.com.fiap.fineduca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.fineduca.screens.AssuntoScreen
import br.com.fiap.fineduca.screens.BaseScreen
import br.com.fiap.fineduca.screens.EstudosScreen
import br.com.fiap.fineduca.screens.HomeScreen
import br.com.fiap.fineduca.screens.TaxasCambioScreen
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
                        
                        composable("estudos") {
                            BaseScreen(modifier = baseScreenModifier, topBar = {
                                Text(text = "Meus Estudo", fontSize = 32.sp, fontWeight = FontWeight.Bold)
                            }, bottomBar = { voltarButton() }) {
                                EstudosScreen(modifier = Modifier, navController = navController)
                            }
                        }
                        
                        composable("assunto") {
                            BaseScreen(modifier = baseScreenModifier, topBar = {
                                Text(text = "Educação Financeira", fontSize = 32.sp, fontWeight = FontWeight.Bold)
                            }, bottomBar = { voltarButton() }) {
                                AssuntoScreen(texto = "A educação financeira é essencial para construir um futuro estável e próspero. Muitas pessoas enfrentam dificuldades financeiras não por falta de renda, mas por não saberem como administrar seu dinheiro corretamente. Para alcançar a independência financeira, é fundamental seguir princípios que ajudam a ganhar, proteger e multiplicar os recursos. A seguir, conheça cinco leis do dinheiro que podem transformar sua relação com as finanças.")
                            }
                        }

                        composable("assunto_taxas") {
                            BaseScreen(modifier = baseScreenModifier, topBar = {
                                Text(text = "O que são Taxas de Câmbio?", fontSize = 30.sp, fontWeight = FontWeight.Bold)
                            }, bottomBar = { voltarButton() }) {
                                AssuntoScreen(texto = "O câmbio é o processo de conversão de uma moeda para outra. Ele está presente em diversas situações do dia a dia, como viagens internacionais, comércio exterior e investimentos. Entender como funciona o câmbio é essencial para tomar decisões financeiras mais seguras e vantajosas.")
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