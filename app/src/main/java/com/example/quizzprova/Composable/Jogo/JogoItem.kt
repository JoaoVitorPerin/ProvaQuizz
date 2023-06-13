import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import com.example.quizzprova.Model.PaisesList
import imgJogo


@Composable
fun JogoItem(number: Int) {
    val listaPaises = PaisesList.paises
    val listaAleatoria = remember { mutableStateOf(listaPaises.shuffled()) }
    val pais = remember { mutableStateOf(listaAleatoria.value[number]) }
    val visible = remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        visible.value = true
    }

    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AnimatedVisibility(
            visible = visible.value,
            enter = fadeIn(
                animationSpec = tween(
                    durationMillis = 1000,
                    easing = FastOutSlowInEasing
                )
            ),
            exit = fadeOut(
                animationSpec = tween(
                    durationMillis = 1000,
                    easing = FastOutSlowInEasing
                )
            )
        ) {
            imgJogo(pais.value, true)
        }

        criarBotoesResposta(pais.value)
    }
}
