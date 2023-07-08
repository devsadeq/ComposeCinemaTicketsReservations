package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.R

@Composable
fun MovieStatistics() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        DetailsInfoText(stringResource(R.string._6_8), stringResource(R.string.imdb), true)
        DetailsInfoText(stringResource(R.string._36), stringResource(R.string.rotten_tomatoes))
        DetailsInfoText(stringResource(R.string._4), stringResource(R.string.ign), true)
    }
}