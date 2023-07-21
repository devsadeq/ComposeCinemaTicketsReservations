package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BlurBackground(
    image: Int
) {
    Image(
        painter = painterResource(image),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
            .blur(80.dp)
            .offset(y = (-300).dp)
    )
}