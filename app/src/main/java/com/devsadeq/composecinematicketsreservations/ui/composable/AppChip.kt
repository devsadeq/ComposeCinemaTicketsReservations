package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devsadeq.composecinematicketsreservations.ui.theme.Orange
import com.devsadeq.composecinematicketsreservations.ui.theme.White


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AppChip(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = false,
) {
    Chip(
        onClick = onClick,
        shape = RoundedCornerShape(50.dp),
        colors = ChipDefaults.chipColors(
            backgroundColor = Orange,
            disabledBackgroundColor = Color.Transparent,
        ),
        enabled = enabled
    ) {
        Text(
            text = label,
            fontSize = 14.sp,
            modifier = Modifier.padding(8.dp),
            color = White
        )
    }
}