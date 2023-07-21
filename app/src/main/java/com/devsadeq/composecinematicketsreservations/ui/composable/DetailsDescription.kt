package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devsadeq.composecinematicketsreservations.R
import com.devsadeq.composecinematicketsreservations.ui.theme.OpenSans


@Composable
fun MovieDescription() {
    Text(
        stringResource(R.string.details_description),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
        fontFamily = OpenSans,
        fontWeight = FontWeight.Medium,
        maxLines = 3,
        textAlign = TextAlign.Center,
        overflow = TextOverflow.Ellipsis,
        fontSize = 14.sp,
    )
}