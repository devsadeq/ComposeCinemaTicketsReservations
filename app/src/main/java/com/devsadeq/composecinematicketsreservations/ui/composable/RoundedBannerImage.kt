package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.R

@Composable
fun RoundedBannerImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.banner),
        contentDescription = "",
        modifier = modifier
            .fillMaxWidth()
            .height(170.dp)
            .padding(16.dp)
            .drawWithContent {
                val path = Path().apply {
                    val yRatio = 0.35f
                    moveTo(0f, size.height * yRatio)
                    lineTo(0f, size.height)
                    quadraticBezierTo(
                        size.width / 2,
                        size.height * 0.6f,
                        size.width,
                        size.height
                    )
                    lineTo(size.width, size.height * yRatio)
                    quadraticBezierTo(
                        size.width / 2,
                        0f,
                        0f,
                        size.height * yRatio,
                    )
                }
                clipPath(path = path) {
                    this@drawWithContent.drawContent()
                }
            }
            .graphicsLayer { this.rotationX = rotationX },
        contentScale = ContentScale.FillWidth
    )
}