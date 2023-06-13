import BotaoJogo
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.*
import com.example.quizzprova.Model.Pais


@Composable
fun criarBotoesResposta(pais: Pais) {
    val visible = remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        visible.value = true
    }

    Row {
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
            BotaoJogo(pais, 0)
        }
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
            BotaoJogo(pais, 1)
        }
    }
    Row {
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
            BotaoJogo(pais, 2)
        }
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
            BotaoJogo(pais, 3)
        }
    }
}
