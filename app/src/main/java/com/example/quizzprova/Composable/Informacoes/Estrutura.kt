import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import com.example.quizzprova.Composable.Informacoes.BodyInfo
import com.example.quizzprova.Composable.Informacoes.CabecalhoInfo
import com.example.quizzprova.Composable.Informacoes.FooterInfo

@Composable
fun estruturaInfo(number: Int) {
    val offsetX = remember { Animatable(-100f) }

    LaunchedEffect(Unit) {
        offsetX.animateTo(
            targetValue = 0f,
            animationSpec = tween(durationMillis = 500, easing = FastOutSlowInEasing)
        )
    }

    Column(
        modifier = Modifier
            .graphicsLayer {
                translationX = offsetX.value.dp.toPx()
                transformOrigin = TransformOrigin(0.5f, 0f)
            }
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CabecalhoInfo(number)
        BodyInfo(number)
        FooterInfo(number)
    }
}
