package com.devsadeq.composecinematicketsreservations.ui.screen.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.devsadeq.composecinematicketsreservations.R
import com.devsadeq.composecinematicketsreservations.ui.composable.BlurBackground
import com.devsadeq.composecinematicketsreservations.ui.composable.HomeFilterChips
import com.devsadeq.composecinematicketsreservations.ui.composable.HomeOverview
import com.devsadeq.composecinematicketsreservations.ui.composable.HomePager


@Composable
fun HomeScreen() {
    HomeScreenContent()
}

@Composable
private fun HomeScreenContent() {
    val images = listOf(
        R.drawable.movie1,
        R.drawable.movie2,
        R.drawable.movie3,
    )

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        BlurBackground(image = images[2])
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            HomeFilterChips()
            HomePager(images)
            HomeOverview()
        }
    }
}


@Preview(showBackground = true, showSystemUi = true, apiLevel = 31)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}