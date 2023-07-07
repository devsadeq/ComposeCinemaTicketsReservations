package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devsadeq.composecinematicketsreservations.ui.theme.Grey
import com.devsadeq.composecinematicketsreservations.ui.theme.Orange
import com.devsadeq.composecinematicketsreservations.ui.theme.White


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AppChip(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = false,
    labelPadding: PaddingValues = PaddingValues(8.dp),
    labelStyle: TextStyle = TextStyle(
        fontSize = 14.sp,
        letterSpacing = 0.15.sp,
        color = White
    )
) {
    Chip(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(50.dp),
        colors = ChipDefaults.chipColors(
            backgroundColor = Orange,
            disabledBackgroundColor = Color.Transparent,
        ),
        enabled = enabled,
        border = if (enabled.not()) BorderStroke(1.dp, Grey) else null,
    ) {
        Text(
            text = label,
            modifier = Modifier.padding(labelPadding),
            style = labelStyle,
        )
    }
}