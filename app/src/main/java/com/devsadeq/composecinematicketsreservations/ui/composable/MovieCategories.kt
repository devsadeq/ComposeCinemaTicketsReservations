package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devsadeq.composecinematicketsreservations.R
import com.devsadeq.composecinematicketsreservations.ui.theme.DarkGrey
import com.devsadeq.composecinematicketsreservations.ui.theme.LightGrey
import com.devsadeq.composecinematicketsreservations.ui.theme.OpenSans


@Composable
fun MovieCategories() {
    Row(
        modifier = Modifier.wrapContentSize(),
    ) {
        AppChip(
            label = stringResource(R.string.fantasy),
            onClick = {},
            labelPadding = PaddingValues(2.dp),
            borderColor = LightGrey,
            labelStyle = TextStyle().copy(
                fontFamily = OpenSans,
                fontSize = 16.sp,
                letterSpacing = 0.15.sp,
                color = DarkGrey,
                fontWeight = FontWeight.SemiBold
            )
        )
        Spacer(modifier = Modifier.width(4.dp))
        AppChip(
            label = stringResource(R.string.adventure),
            onClick = {},
            labelPadding = PaddingValues(2.dp),
            borderColor = LightGrey,
            labelStyle = TextStyle().copy(
                fontFamily = OpenSans,
                fontSize = 16.sp,
                letterSpacing = 0.15.sp,
                color = DarkGrey,
                fontWeight = FontWeight.SemiBold
            )
        )
    }
}