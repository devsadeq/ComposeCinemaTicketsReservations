package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.R

@Composable
fun MovieTitle() {
    Text(
        text = stringResource(R.string.fantastic_beasts_the_secrets_of_dumbledore),
        style = MaterialTheme.typography.headlineMedium,
        modifier = Modifier.padding(vertical = 16.dp, horizontal = 24.dp),
        textAlign = TextAlign.Center,
    )
}