package com.devsadeq.composecinematicketsreservations.ui.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.devsadeq.composecinematicketsreservations.ui.composable.HomeFilterChips
import com.devsadeq.composecinematicketsreservations.ui.composable.HomePager


@Composable
fun HomeScreen() {
    HomeScreenContent()
}

@Composable
private fun HomeScreenContent() {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        HomeFilterChips()
        HomePager()
    }
}

@Preview(showBackground = true, showSystemUi = true, apiLevel = 31)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}