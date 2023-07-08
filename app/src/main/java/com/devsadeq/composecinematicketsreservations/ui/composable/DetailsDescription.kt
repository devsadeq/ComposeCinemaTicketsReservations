package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.R


@Composable
fun MovieDescription() {
    Text(
        stringResource(R.string.details_description),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
        style = MaterialTheme.typography.bodyMedium,
        maxLines = 3,
        overflow = TextOverflow.Ellipsis,
    )
}