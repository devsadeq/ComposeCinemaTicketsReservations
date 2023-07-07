package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.R

@Composable
fun DetailsBackgroundImage() {
    Image(
        painter = painterResource(R.drawable.movie2),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
            .offset(y = (-100).dp),
        contentScale = ContentScale.Fit,
        alignment = Alignment.TopCenter
    )
}