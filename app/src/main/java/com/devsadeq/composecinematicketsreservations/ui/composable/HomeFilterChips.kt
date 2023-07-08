package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.R


@Composable
fun HomeFilterChips(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 36.dp, bottom = 24.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        AppChip(
            label = stringResource(R.string.now_showing),
            onClick = {},
            enabled = true,
        )
        Spacer(modifier = Modifier.width(8.dp))
        AppChip(
            label = stringResource(R.string.coming_soon),
            onClick = {},
            enabled = false
        )
    }
}