package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.R
import com.devsadeq.composecinematicketsreservations.ui.theme.DarkGrey
import com.devsadeq.composecinematicketsreservations.ui.theme.Orange
import com.devsadeq.composecinematicketsreservations.ui.theme.White
import com.devsadeq.composecinematicketsreservations.viewmodel.reservation.SeatUIState

@Composable
fun SeatItem(
    seatUIState: SeatUIState,
    onSeatClick: (id: Int) -> Unit
) {
    Icon(
        painterResource(R.drawable.seat),
        contentDescription = null,
        tint = when {
            seatUIState.isReserved -> DarkGrey
            seatUIState.isSelected -> Orange
            else -> White
        },
        modifier = Modifier
            .size(36.dp)
            .clickable(enabled = !seatUIState.isReserved) {
                onSeatClick(seatUIState.id)
            }
    )
}