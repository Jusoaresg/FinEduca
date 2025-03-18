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
fun LeisDinheiroContent(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .padding(8.dp)) {

        Text(text = "A educação financeira é essencial para construir um futuro estável e próspero. Muitas pessoas enfrentam dificuldades financeiras não por falta de renda, mas por não saberem como administrar seu dinheiro corretamente. Para alcançar a independência financeira, é fundamental seguir princípios que ajudam a ganhar, proteger e multiplicar os recursos. A seguir, conheça cinco leis do dinheiro que podem transformar sua relação com as finanças.")

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "1ª Lei: O dinheiro cresce para quem aprende a poupar regularmente", fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Uma das regras mais importantes da educação financeira é o hábito de economizar. Antes de gastar, é essencial reservar uma parte da renda para o futuro. Isso cria um ciclo positivo que permite maior segurança e oportunidades financeiras.")

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Como aplicar: ", fontSize = 16.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(5.dp))

        Column(modifier = Modifier.padding(bottom = 16.dp)) {
            val items = listOf(
                "- Separe pelo menos 10% da sua renda para poupança ou investimentos;",
                "- Priorize essa reserva antes de pagar outras despesas;",
                "- Encare esse valor como um compromisso consigo mesmo."
            )
            items.forEach { item ->
                Text(text = item, modifier = Modifier.padding(bottom = 4.dp))
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "2ª Lei: O dinheiro trabalha para quem sabe investi-lo com inteligência", fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Guardar dinheiro é importante, mas fazê-lo render é ainda melhor. Quem aprende a investir de forma estratégica consegue multiplicar seu patrimônio e conquistar maior liberdade financeira.")

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Como aplicar: ", fontSize = 16.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(5.dp))

        Column(modifier = Modifier.padding(bottom = 16.dp)) {
            val items = listOf(
                "- Invista em ativos que possam gerar renda ao longo do tempo;",
                "- Pesquise antes de aplicar seu dinheiro e diversifique seus investimentos;",
                "- Busque conhecimento para tomar decisões conscientes."
            )
            items.forEach { item ->
                Text(text = item, modifier = Modifier.padding(bottom = 4.dp))
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "3ª Lei: O dinheiro se mantém seguro quando investido de forma responsável", fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "A pressa em fazer dinheiro crescer pode levar a perdas financeiras. Aplicações em negócios arriscados, sem conhecimento adequado, podem comprometer o patrimônio. A segurança deve sempre vir em primeiro lugar.")

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Como aplicar: ", fontSize = 16.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(5.dp))

        Column(modifier = Modifier.padding(bottom = 16.dp)) {
            val items = listOf(
                "- Evite investimentos que prometem retornos rápidos e fáceis;",
                "- Antes de investir, estude e consulte especialistas no assunto;",
                "- Mantenha-se atento a oportunidades seguras e bem analisadas."
            )
            items.forEach { item ->
                Text(text = item, modifier = Modifier.padding(bottom = 4.dp))
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "4ª Lei: O dinheiro desaparece quando investido sem conhecimento ou sem orientação confiável", fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Muitas pessoas perdem dinheiro ao se arriscarem em investimentos sem entender o funcionamento do mercado. A falta de conhecimento e a influência de terceiros podem levar a escolhas equivocadas.")

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Como aplicar: ", fontSize = 16.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(5.dp))

        Column(modifier = Modifier.padding(bottom = 16.dp)) {
            val items = listOf(
                "- Nunca invista em algo que você não compreende totalmente;",
                "- Desconfie de recomendações sem embasamento sólido;",
                "- Busque aprender sobre finanças antes de tomar decisões importantes."
            )
            items.forEach { item ->
                Text(text = item, modifier = Modifier.padding(bottom = 4.dp))
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "5ª Lei: O dinheiro foge de quem age com ganância ou impulsividade", fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "A busca por retornos rápidos pode ser um grande erro. Decisões financeiras devem ser tomadas com racionalidade e planejamento. Quem tenta acelerar o processo sem estratégia pode acabar perdendo tudo.")

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Como aplicar: ", fontSize = 16.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(5.dp))

        Column(modifier = Modifier.padding(bottom = 16.dp)) {
            val items = listOf(
                "- Tenha paciência e pense no longo prazo;",
                "- Evite decisões emocionais ao lidar com dinheiro;",
                "- Construa sua riqueza de forma gradual e consistente."
            )
            items.forEach { item ->
                Text(text = item, modifier = Modifier.padding(bottom = 4.dp))
            }
        }


        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Conclusão", fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "A gestão financeira é um pilar fundamental para alcançar estabilidade e qualidade de vida. Seguir essas cinco leis do dinheiro ajudará a criar hábitos financeiros mais saudáveis, garantindo segurança e oportunidades no futuro. Ao aplicar esses princípios no dia a dia, você estará no caminho certo para a independência financeira.")
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Agora que você conhece essas regras essenciais, comece a colocar em prática e veja a diferença que elas farão na sua vida financeira!")

    }
}