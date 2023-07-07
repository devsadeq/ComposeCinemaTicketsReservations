package com.devsadeq.composecinematicketsreservations.ui.screen.details

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.devsadeq.composecinematicketsreservations.ui.composable.DetailsBackgroundImage
import com.devsadeq.composecinematicketsreservations.ui.composable.DetailsBottomSheet
import com.devsadeq.composecinematicketsreservations.ui.composable.DetailsHeader

@Composable
fun DetailsScreen() {
    DetailsScreenContent()
}

@Composable
fun DetailsScreenContent() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        DetailsBackgroundImage(modifier = Modifier.align(Alignment.TopCenter))
        DetailsHeader()
        DetailsBottomSheet(modifier = Modifier.align(Alignment.BottomCenter))
    }
}


@Preview(showBackground = true, apiLevel = 31, showSystemUi = true)
@Composable
fun DetailsScreenPreview() {
    DetailsScreen()
}