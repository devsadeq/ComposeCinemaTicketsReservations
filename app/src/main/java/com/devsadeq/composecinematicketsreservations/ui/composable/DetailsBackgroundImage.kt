package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.R

@Composable
fun DetailsBackgroundImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.movie2),
        contentDescription = null,
        modifier = modifier
            .fillMaxSize()
            .offset(y = (-200).dp),
        contentScale = ContentScale.FillWidth,
    )
}