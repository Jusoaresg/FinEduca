package br.com.fiap.fineduca.screens.content

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CambioMoedas() {
    Column(
        modifier = Modifier
            .padding(8.dp)
    ) {
        
        Text(text = "O câmbio é o processo de conversão de uma moeda para outra. Ele está presente em diversas situações do dia a dia, como viagens internacionais, comércio exterior e investimentos. Entender como funciona o câmbio é essencial para tomar decisões financeiras mais seguras e vantajosas.")

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "O que é o câmbio?", fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Câmbio é a troca de uma moeda por outra com base em uma taxa de conversão determinada pelo mercado financeiro. Por exemplo, se um dólar custa R$ 5,00, isso significa que, para comprar 1 dólar, você precisa pagar cinco reais. Essa taxa de conversão varia constantemente de acordo com a oferta e demanda no mercado.")

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Tipos de câmbio", fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "O mercado de câmbio pode operar de diferentes formas. Os principais tipos são:")

        Spacer(modifier = Modifier.height(4.dp))

        Column(modifier = Modifier.padding(bottom = 16.dp)) {
            val items = listOf(
                "- Câmbio Comercial: Utilizado para transações internacionais, como importação e exportação de produtos, investimentos e operações entre bancos. Normalmente, tem uma cotação mais baixa, pois movimenta grandes volumes de dinheiro.",
                "- Câmbio Turismo: Usado para compra de moeda estrangeira em espécie, geralmente para viagens. A cotação é mais alta devido às taxas administrativas e impostos aplicados pelas instituições financeiras.",
                "- Câmbio Paralelo: Refere-se à negociação de moedas fora do mercado regulamentado. Pode envolver riscos, pois não segue as regras do Banco Central e pode estar ligado a atividades ilegais."
            )
            items.forEach { item ->
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = item, modifier = Modifier.padding(bottom = 4.dp))
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Fatores que influenciam a taxa de câmbio", fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "A variação do câmbio ocorre por diversos fatores econômicos e políticos. Os principais são:")

        Spacer(modifier = Modifier.height(4.dp))

        Column(modifier = Modifier.padding(bottom = 16.dp)) {
            val items = listOf(
                "- Oferta e demanda: Se muitas pessoas querem comprar uma moeda específica, seu preço sobe; se a procura diminui, o preço cai.",
                "- Taxa de juros: Países com juros mais altos atraem investidores estrangeiros, aumentando a valorização da moeda local.",
                "- Inflação: Moedas de países com alta inflação tendem a perder valor em relação a outras mais estáveis.",
                "- Política econômica e estabilidade: Mudanças políticas, crises econômicas e decisões governamentais impactam diretamente a confiança na moeda e sua valorização.",
                "- Comércio exterior: Se um país exporta mais do que importa, sua moeda tende a se valorizar devido à entrada de capital estrangeiro."
            )
            items.forEach { item ->
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = item, modifier = Modifier.padding(bottom = 4.dp))
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Onde fazer câmbio de moedas?", fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "A troca de moedas pode ser feita em diferentes instituições financeiras, cada uma com regras e taxas específicas. As principais opções incluem:")

        Spacer(modifier = Modifier.height(4.dp))

        Column(modifier = Modifier.padding(bottom = 16.dp)) {
            val items = listOf(
                "- Bancos: Oferecem segurança, mas podem cobrar taxas elevadas.",
                "- Casas de câmbio: Possuem maior flexibilidade, mas a cotação pode ser mais alta.",
                "- Cartões de crédito internacionais: Práticos, porém sujeitos à taxa de câmbio do dia da compra e tarifas adicionais.",
                "- Plataformas digitais: Algumas fintechs oferecem serviços de câmbio com taxas mais competitivas."
            )
            items.forEach { item ->
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = item, modifier = Modifier.padding(bottom = 4.dp))
            }
        }


        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Dicas para economizar na conversão de moedas", fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Para obter um câmbio mais favorável e evitar gastos desnecessários, siga algumas estratégias:")

        Spacer(modifier = Modifier.height(4.dp))

        Column(modifier = Modifier.padding(bottom = 16.dp)) {
            val items = listOf(
                "- Pesquise a cotação em diferentes locais antes de fazer a conversão. Pequenas diferenças na taxa podem gerar economia significativa.",
                "- Evite trocar dinheiro em aeroportos, pois as taxas costumam ser mais altas.",
                "- Prefira fazer câmbio aos poucos, evitando grandes conversões em momentos de alta volatilidade.",
                "- Considere cartões pré-pagos internacionais, que permitem travar a cotação no momento da recarga.",
                "- Acompanhe o mercado financeiro para identificar os melhores momentos para conversão."
            )
            items.forEach { item ->
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = item, modifier = Modifier.padding(bottom = 4.dp))
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Conclusão", fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "O câmbio de moedas é um elemento fundamental da economia global, afetando desde viagens até grandes transações comerciais. Compreender como ele funciona e os fatores que influenciam sua variação ajuda a tomar decisões financeiras mais inteligentes. Ao planejar bem suas conversões e buscar as melhores taxas, é possível evitar surpresas e otimizar seu dinheiro.")

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Agora que você já sabe o básico sobre o câmbio de moedas, aproveite esse conhecimento para fazer transações mais vantajosas e planejar melhor suas finanças internacionais!")

    }
}