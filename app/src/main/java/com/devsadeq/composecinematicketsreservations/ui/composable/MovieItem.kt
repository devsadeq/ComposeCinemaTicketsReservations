package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MovieItem(
    image: Int,
    modifier: Modifier = Modifier,
) {
    Image(
        painter = painterResource(image),
        contentDescription = null,
        modifier = modifier
            .fillMaxWidth()
            .height(450.dp)
            .clip(RoundedCornerShape(16.dp)),
        contentScale = ContentScale.Crop,
    )
}